package pset3;

/**
 * Author: Jack Diao
 * Date: 3/29/2020
 * Last Modified: 3/31/2020
 */

import java.util.HashMap;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.*;

public class GraphGenerator {

	public static final int JSR = 168; // a8 JSR
	public static final int JSR_W = 201; // c9 JSR_W
	public static final int LOOKUPSWITCH = 171; // ab lookupswitch
	public static final int TABLESWITCH = 170; // aa tableswitch
    public static final int EXIT = -1;

    public CFG createCFG(String className) throws ClassNotFoundException {
        CFG cfg = new CFG();
        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();
        
        for (Method m: cg.getMethods()) {
            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();
            for (InstructionHandle ih: handles) {
                int position = ih.getPosition();
                cfg.addNode(position, m, jc);
                Instruction inst = ih.getInstruction();

                // Ignore the edges that represent method invocations as well as jsr[ w] and *switch instructions
                if (inst.getOpcode() == JSR
                		|| inst.getOpcode() == JSR_W
                		|| inst.getOpcode() == LOOKUPSWITCH
                		|| inst.getOpcode() == TABLESWITCH) {
                	int nextPosition = ih.getNext() == null ? EXIT : ih.getNext().getPosition();
                    cfg.addEdge(position, nextPosition, m, jc);
                } else if (inst instanceof ReturnInstruction) {
                    cfg.addEdge(position, EXIT, m, jc);
                } else if (inst instanceof BranchInstruction) {
                    int nextPosition = ih.getNext() == null ? EXIT : ih.getNext().getPosition();
                    cfg.addEdge(position, nextPosition, m, jc);
                    int targetPosition = ((BranchInstruction) inst).getTarget().getPosition();
                    cfg.addEdge(position, targetPosition, m, jc);
                } else {
                	int nextPosition = ih.getNext() == null ? EXIT : ih.getNext().getPosition();
                    cfg.addEdge(position, nextPosition, m, jc);
                }

            }
        }
        return cfg;
    }
    
    public CFG createCFGWithMethodInvocation(String className) throws ClassNotFoundException {
        CFG cfg = new CFG();

        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();
        HashMap<Integer, MethodGen> methodsMap = new HashMap<Integer, MethodGen>();

        int size = 0;
        for (Method m: cg.getMethods()){
            methodsMap.put(size, new MethodGen(m, cg.getClassName(), cpg));
            size++;
        }

        for (Method m : cg.getMethods()) {
            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();
            for (InstructionHandle ih : handles) {
                int position = ih.getPosition();
                cfg.addNode(position, m, jc);
                Instruction inst = ih.getInstruction();

                // Ignore the edges that represent method invocations as well as jsr[ w] and *switch instructions
                if (inst.getOpcode() == JSR
                		|| inst.getOpcode() == JSR_W
                		|| inst.getOpcode() == LOOKUPSWITCH
                		|| inst.getOpcode() == TABLESWITCH) {
                	int nextPosition = ih.getNext() == null ? EXIT : ih.getNext().getPosition();
                    cfg.addEdge(position, nextPosition, m, jc);
                } else if (inst instanceof ReturnInstruction) {
                    cfg.addEdge(position, EXIT, m, jc);
                } else if (inst instanceof BranchInstruction) {
                    int nextPosition = ih.getNext() == null ? EXIT : ih.getNext().getPosition();
                    cfg.addEdge(position, nextPosition, m, jc);
                    int targetPosition = ((BranchInstruction) inst).getTarget().getPosition();
                    cfg.addEdge(position, targetPosition, m, jc);
                } else if (inst instanceof INVOKESTATIC) {
                	InvokeInstruction ii = (InvokeInstruction) inst;
					JavaClass nextJc = Repository.lookupClass(ii.getClassName(cpg));
					Method nextMethod = cg.containsMethod(ii.getName(cpg), ii.getSignature(cpg));
					int nextPosition = 0;
					cfg.addEdge(position, m, jc, nextPosition, nextMethod, nextJc); // outgoing
					cfg.addEdge(EXIT, nextMethod, nextJc, nextPosition = ih.getNext().getPosition(), m, jc); // incoming
                } else {
                	int nextPosition = ih.getNext() == null ? EXIT : ih.getNext().getPosition();
                    cfg.addEdge(position, nextPosition, m, jc);
                }
            }
        }
        return cfg;
    }
    
    public static void main(String[] a) throws ClassNotFoundException {
        GraphGenerator gg = new GraphGenerator();
        CFG cfg = gg.createCFG("pset3.C"); // example invocation of createCFG
        CFG cfgWithMethodInvocation = gg.createCFGWithMethodInvocation("pset3.D"); // example invocation of createCFGWithMethodInovcation
        
        /* Promblem 1 */
        System.out.println(cfg.toString());
        /* Promblem 2.1 */
        System.out.println(cfgWithMethodInvocation.toString());
        /* Promblem 2.2 */
        System.out.println(cfgWithMethodInvocation.isReachable("main", "pset3.D", "main", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("main", "pset3.D", "foo", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("main", "pset3.D", "bar", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("foo", "pset3.D", "main", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("foo", "pset3.D", "foo", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("foo", "pset3.D", "bar", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("bar", "pset3.D", "main", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("bar", "pset3.D", "foo", "pset3.D"));
        System.out.println(cfgWithMethodInvocation.isReachable("bar", "pset3.D", "bar", "pset3.D"));
    }
}
