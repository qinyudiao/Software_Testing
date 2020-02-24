/* EE360T problem set 1
 * Spring 2020
 * Jack Diao
 */

package edu.utexas.ee360t.pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList {
	Node header;
	
	static class Node {
		boolean elem;
		Node next;
	}
	
	boolean repOk() {
		// postcondition: returns true iff <this> is an acyclic list, i.e.,
		// there is no path from a node to itself
		Set<Node> visited = new HashSet<Node>();
		Node n = header;
		
		while (n != null) {
			if (!visited.add(n)) {
				return false;
			}	
			n = n.next;
		}
		
		return true;
	}
	void add(boolean e) {
		// precondition: this.repOk()
		// postcondition: adds <e> in a new node at the beginning of the
		// list; the rest of the list is unmodified
		// your code goes here
        Node node_to_add = new Node();
        node_to_add.elem = e;
        node_to_add.next = null;

        // Trivial case: header is null / list is empty.
        if (header == null) {
            header = node_to_add;
            return;
        }
        
        // Normal case: add the node to the beginning of the list.
        node_to_add.next = this.header;
        this.header = node_to_add;
	}
}