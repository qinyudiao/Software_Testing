/* EE360T problem set 1
 * Spring 2020
 * Jack Diao
 */

package edu.utexas.ee360t.pset1;

public class D extends C {
	int g;
	
	public D(int f, int g) {
		super(f);
		this.g = g;
	}
	@Override
	public boolean equals(Object o) {
		// assume this method is implemented for you
		return true;
	}
	@Override
	public int hashCode() {
		// assume this method is implemented for you
		return 0;
	}
}
