/* EE360T problem set 1
 * Spring 2020
 * Jack Diao
 */

package edu.utexas.ee360t.pset1;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.utexas.ee360t.pset1.SLList;
import edu.utexas.ee360t.pset1.SLList.Node;

public class SLListRepOkTester {
	/* 
	 * six total cases:
	 * 0. null
	 * 1. h --> null
	 * 2. h --> h
	 * 3. h --> n --> null
	 * 4. h --> n --> h
	 * 5. h --> n --> n
	 * */
	
	// Normal case 0: null >> True
	@Test public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}
	// your code goes here
	
	// Normal case 1: h --> null >> True
	@Test public void t1() {
		SLList l = new SLList();
        Node header = new Node();
        
        header.elem = true;
        header.next = null;
        
        l.header = header;

        assertTrue(l.repOk());
	}
	
	// Normal case 2: h --> h >> False
	@Test public void t2() {
		SLList l = new SLList();
        Node header = new Node();
        
        header.elem = true;
        header.next = header;
        
        l.header = header;

        assertFalse(l.repOk());
	}
	
	// Normal case 3: h --> n --> null >> True
	@Test public void t3() {
		SLList l = new SLList();
		Node n = new Node();  
        Node header = new Node();

        n.elem = false;
        n.next = null;
        header.elem = true;
        header.next = n;
        
        l.header = header;

        assertTrue(l.repOk());
	}
	
	// Normal case 4: h --> n --> h >> False
	@Test public void t4() {
		SLList l = new SLList();
		Node n = new Node();
        Node header = new Node();
        
        n.elem = false;
        n.next = header;
        header.elem = true;
        header.next = n;
        
        l.header = header;

        assertFalse(l.repOk());
	}
	
	// Normal case 5: h --> n --> n >> False
	@Test public void t5() {
		SLList l = new SLList();
		Node n = new Node();
        Node header = new Node();
        
        n.elem = false;
        n.next = n;
        header.elem = true;
        header.next = n;
        
        l.header = header;

        assertFalse(l.repOk());
	}
}
