package pset5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Graph {
	private int numNodes; // number of nodes in the graph
	private boolean[][] edges;
	// edges[i][j] is true if and only if there is an edge from node i to node j
	// class invariant: fields "edges" is non-null;
	// "edges" is a square matrix;
	// numNodes is number of rows in "edges"
	public Graph(int size) {
		numNodes = size;
		// ...
		edges = new boolean[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				edges[i][j] = false; // initialize edge to false
			}
//			edges[i][i] = true; // add path from each node to itself, but @106 from piazza, this should be done implicitly.
		}
	}
	
	public String toString() {
		return "numNodes: " + numNodes + "\n" + "edges: " + Arrays.deepToString(edges);
	}
	
	public boolean equals(Object o) {
		if (o.getClass() != Graph.class) return false;
		return toString().equals(o.toString());
	}
	
	public void addEdge(int from, int to) {
		// postcondition: adds a directed edge "from" -> "to" to this graph
		//...
		// do nothing if from or to node is invalid
		if(from >= numNodes || from < 0 || to >= numNodes || to < 0)
			return;
		edges[from][to] = true;
	}
	
	public boolean reachable(Set<Integer> sources, Set<Integer> targets) {
		if (sources == null || targets == null) throw new IllegalArgumentException();
		// postcondition: returns true if (1) "sources" does not contain an illegal node,
		// (2) "targets" does not contain an illegal node, and
		// (3) for each node "m" in set "targets", there is some
		// node "n" in set "sources" such that there is a directed
		// path that starts at "n" and ends at "m" in "this"; and
		// false otherwise
		//...
		// if "sources" contains an illegal node, return false
		for(int source : sources) {
			if(source >= numNodes || source < 0)
				return false;
		}
		// if "sources" contains an illegal node, return false
		for(int target : targets) {
			if(target >= numNodes || target < 0)
				return false;
		}
		
		for(int source : sources) {
			for(int target : targets) {
				if (!isReachableFromNToM_BFS(source, target)) {
//					System.out.println("cover 1");
					return false;
				}
			}
		}
		
		return true;
	}
	
    private boolean isReachableFromNToM_BFS(int n, int m) { 
        // Same node, return true
        if (n == m) {
//        	System.out.println("cover 2");
            return true;
        }
  
        boolean[] visited = new boolean[numNodes]; 
  
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        visited[n] = true; 
        queue.offer(n); 
        
        List<Integer> adjacentNodes = new ArrayList<Integer>(); 
  
        while (!queue.isEmpty()) {
            n = queue.poll(); 
  
            for(int j = 0; j < numNodes; j++) {
            	if(edges[n][j] == true) {
            		adjacentNodes.add(j); 
//            		System.out.println("cover 3");
            	}
            }
            
            for (int currentNode : adjacentNodes) { 
                if (currentNode == m)  {
//                	System.out.println("cover 4");
                    return true; 
                }
                if (!visited[currentNode]) { 
                    visited[currentNode] = true; 
                    queue.offer(currentNode); 
//                    System.out.println("cover 5");
                } 
            } 
        } 
        
        return false; 
    } 
}