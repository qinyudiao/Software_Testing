/* EE360T problem set 1
 * Spring 2020
 * Jack Diao
 */

package edu.utexas.ee360t.pset1;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.utexas.ee360t.pset1.C;
import edu.utexas.ee360t.pset1.D;

public class EqualsTester {
	/*
	* P1: For any non-null reference value x, x.equals(null) should return false.
	*/
	// Case 0: Object Class
	@Test public void t0() {
		assertFalse(new Object().equals(null));
	}
	// your test methods for P1 go here
    // Case 1: C Class
    @Test public void t1() {
        assertFalse(new C(1).equals(null));
    }
    // Case 2: D Class
    @Test public void t2() {
        assertFalse(new D(2,3).equals(null));
    }
    
	/*
	* P2: It is reflexive: for any non-null reference value x, x.equals(x)
	* should return true.
	*/
	// your test methods for P2 go here
    // Case 0: Object Class
    @Test public void reflexive_t0(){
        Object x = new Object();
        assertTrue(x.equals(x));
    }

    // Case 1: C Class
    @Test public void reflexive_t1(){
        C x = new C(1);
        assertTrue(x.equals(x));
    }

    // Case 2: D Class
    @Test public void reflexive_t2(){
        D x = new D(2,3);
        assertTrue(x.equals(x));
    }
    
	/*
	* P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
	* should return true if and only if y.equals(x) returns true.
	*/
	// your test methods for P3 go here
    
    // Case 0: Object vs Object Class
    @Test public void symmetric_t0(){
        Object x = new Object();
        Object y = new Object();
        assertTrue(x.equals(y) == y.equals(x));

    }

    // Case 1: Object vs C Class
    @Test public void symmetric_t1(){
        Object x = new Object();
        C y = new C(3);
        assertTrue(x.equals(y) == y.equals(x));
    }

    // Case 2: Object vs D Class
    @Test public void symmetric_t2(){
        Object x = new Object();
        D y = new D(3,4);
        assertTrue(x.equals(y) == y.equals(x));
    }

    // Case 3: C Class vs C Class
    @Test public void symmetric_t3(){
        C x = new C(4);
        C y = new C(3);
        assertTrue(x.equals(y) == y.equals(x));
    }
    
    // Case 4: C Class vs D Class
    @Test public void symmetric_t4(){
        C x = new C(4);
        D y = new D(5,6);
        assertTrue(x.equals(y) == y.equals(x));
    }

    // Case 5: D Class vs D Class
    @Test public void symmetric_t5(){
        D x = new D(5,6);
        D y = new D(7,8);
        assertTrue(x.equals(y) == y.equals(x));
    }

    // Case 6: Object = Object
    @Test public void symmetric_t6(){
        Object x = new Object();
        Object y = x;
        assertTrue(x.equals(y) == y.equals(x));
    }

    // Case 7: C Class = C Class
    @Test public void symmetric_t7(){
        C x = new C(7);
        C y = x;
        assertTrue(x.equals(y) == y.equals(x));
    }

    // Case 8: D Class = D Class
    @Test public void symmetric_t8(){
        D x = new D(8,9);
        D y = x;
        assertTrue(x.equals(y) == y.equals(x));
    }
	
	/*
	* P4: It is transitive: for any non-null reference values x, y, and z,
	* if x.equals(y) returns true and y.equals(z) returns true, then
	* x.equals(z) should return true.
	*/
	// you do not need to write tests for P4
}
