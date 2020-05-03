package pset3;

/**
 * Author: Jack Diao
 * Date: 3/29/2020
 * Last Modified: 3/31/2020
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;


import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;

public class CFG {
    Set<Node> nodes = new HashSet<Node>();
    Map<Node, Set<Node>> edges = new HashMap<Node, Set<Node>>();
    
    public static class Node {
        int position;
        Method method;
        JavaClass clazz;
        
        boolean isVisited;
        Node(int p, Method m, JavaClass c) {
            position = p;
            method = m;
            clazz = c;
            isVisited = false;
        }
        
        public Method getMethod() {
            return method;
        }
        
        public JavaClass getClazz() {
            return clazz;
        }

        public boolean equals(Object o) {
            if (!(o instanceof Node)) return false;
            Node n = (Node)o;
            return (position == n.position) && method.equals(n.method) && clazz.equals(n.clazz);
        }
        
        public int hashCode() {
            return position + method.hashCode() + clazz.hashCode();
        }
        
        public String toString() {
            return clazz.getClassName() + "." + method.getName() + method.getSignature() + ": " + position;
        }
        
        public int getPosition(){
            return position;
        }
    }
    
    public void addNode(int p, Method m, JavaClass c) {
        addNode(new Node(p, m, c));
    }
    
    private void addNode(Node n) {
        nodes.add(n);
        Set<Node> nbrs = edges.get(n);
        if (nbrs == null) {
            nbrs = new HashSet<Node>();
            edges.put(n, nbrs);
        }
    }
    
    public void addEdge(int p1, Method m1, JavaClass c1, int p2, Method m2, JavaClass c2) {
        Node n1 = new Node(p1, m1, c1);
        Node n2 = new Node(p2, m2, c2);
        addNode(n1);
        addNode(n2);
        Set<Node> nbrs = edges.get(n1);
        nbrs.add(n2);
        edges.put(n1, nbrs);
    }
    
    public void addEdge(int p1, int p2, Method m, JavaClass c) {
        addEdge(p1, m, c, p2, m, c);
    }
    
    public String toString() {
        return nodes.size() + " nodes\n" + "nodes: " + nodes + "\n" + "edges: " + edges;
    }
    
    public boolean isReachable(String methodFrom, String clazzFrom,
                               String methodTo, String clazzTo) {

        Node startNode = new Node(0, null, null);
        for (Node n: nodes){
            if (n.getMethod().getName().equals(methodFrom) && n.getClazz().getClassName().equals(clazzFrom) && n.getPosition() == 0) {
                startNode = n;
                break;
            }
        }
        
        if (methodFrom.equals(methodTo) && clazzFrom.equals(clazzTo))
            return true;
        else if (methodFrom.equals("<init>"))
            return false;

        Set<Node> visited = new LinkedHashSet<Node>(); // All nodes are not visited at start
        LinkedList<Node> queue = new LinkedList<Node>(); // Create a queue for BFS 

        visited.add(startNode);
        queue.add(startNode);

        Stack<HashMap<String,String>> stack = new Stack<HashMap<String,String>>(); // Create a stack for exits

        while (!queue.isEmpty()) {
            startNode = queue.poll();

            String fromNodeMethod = "";
            String toNodeMethod = "";
            boolean avoid = false;

            if (startNode.getPosition() == -1 && !stack.isEmpty()){
                HashMap<String, String> toSkip = stack.pop();
                fromNodeMethod = (String) toSkip.keySet().toArray()[0];
                toNodeMethod = toSkip.get(fromNodeMethod);
                avoid = true;
            }

            Iterator<Node> i = edges.get(startNode).iterator();
            while (i.hasNext()) {
                Node n = i.next();
                if(startNode.getPosition() == -1 && stack.isEmpty())
                    return false;
                else if (avoid){
                    if( (!visited.contains(n)) && n.getMethod().getName() == fromNodeMethod && startNode.getMethod().getName() == toNodeMethod)
                    {   
                        if (n.getMethod().getName().equals(methodTo) && n.getClazz().getClassName().equals(clazzTo))
                            return true;
                        else if (n.getPosition() == 0){
                            HashMap<String,String> newMap = new HashMap<String, String>();
                            newMap.put(startNode.getMethod().getName(), n.getMethod().getName());
                            stack.push(newMap);
                        }
                        visited.add(n);
                        queue.add(n);
                    }
                } else {
                    if (!visited.contains(n)) {
                        if (n.getMethod().getName().equals(methodTo) && n.getClazz().getClassName().equals(clazzTo))
                            return true;
                        else if (n.getPosition() == 0) {
                            HashMap<String, String> newMap = new HashMap<String, String>();
                            newMap.put(startNode.getMethod().getName(), n.getMethod().getName());
                            stack.push(newMap);
                        }
                        visited.add(n);
                        queue.add(n);
                    }
                }
            }
        }
        return false;
    }

}