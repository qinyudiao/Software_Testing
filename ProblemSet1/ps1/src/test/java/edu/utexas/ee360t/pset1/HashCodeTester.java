/* EE360T problem set 1
 * Spring 2020
 * Jack Diao
 */

package edu.utexas.ee360t.pset1;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.utexas.ee360t.pset1.C;
import edu.utexas.ee360t.pset1.D;

public class HashCodeTester {
	/*
	* P5: If two objects are equal according to the equals(Object)
	* method, then calling the hashCode method on each of
	* the two objects must produce the same integer result.
	*/
	// your test methods go here
	
    // Case 0: Object vs Object
    @Test public void hash_t0(){
        Object x = new Object();
        Object y = new Object();
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 1: Object vs C Class
    @Test public void hash_t1(){
        Object x = new Object();
        C y = new C(1);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 2: Object vs D Class
    @Test public void hash_t2(){
        Object x = new Object();
        D y = new D(2,3);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 3: C Class vs D Class
    @Test public void hash_t3(){
    	C x = new C(3);
        D y = new D(4,5);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 4: C Class vs C Class with different values
    @Test public void hash_t4(){
        C x = new C(4);
        C y = new C(5);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 9: C Class vs C Class with same values
    @Test public void hash_t5(){
        C x = new C(5);
        C y = new C(5);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 9: D Class vs D Class with different values
    @Test public void hash_t6(){
        D x = new D(6,7);
        D y = new D(8,9);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 9: D Class vs D Class with same values
    @Test public void hash_t7(){
        D x = new D(7,8);
        D y = new D(7,8);
        assertTrue((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 9: Object = Object
    @Test public void hash_t8(){
        Object x = new Object();
        Object y = x;
        assertFalse((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 9: C Class = C Class
    @Test public void hash_t9(){
        C x = new C(9);
        C y = x;
        assertFalse((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }

    // Case 10: D Class = D Class
    @Test public void hash_t10(){
        D x = new D(10,11);
        D y = x;
        assertFalse((!x.equals(y) && !y.equals(x)) && x.hashCode() != y.hashCode());
    }
    
}
