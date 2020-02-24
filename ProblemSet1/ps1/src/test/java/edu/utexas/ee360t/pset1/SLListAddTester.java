/* EE360T problem set 1
 * Spring 2020
 * Jack Diao
 */

package edu.utexas.ee360t.pset1;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.utexas.ee360t.pset1.SLList;

public class SLListAddTester {
	@Test public void test0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
		l.add(true);
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);
		// your code goes here
        assertTrue(l.header.elem == true);
        assertTrue(l.header.next == null);
	}
	@Test public void test1() {
		SLList l = new SLList();
		assertTrue(l.repOk());
		l.add(true);
		assertTrue(l.repOk());
		l.add(false);
		assertTrue(l.repOk());
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);
		// your code goes here
        assertTrue(l.header.elem == false);
        assertTrue(l.header.next != null);
        assertTrue(l.header.next.elem == true);
        assertTrue(l.header.next.next == null);
	}
}
