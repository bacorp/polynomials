/**
 * Polynomial class to store all the polynomial data
 * 
 * @author
 * 
 */
public class Polynomial {

	private int n; // no. of variables
	private int degree; // degree of polynomial
	private double[][] coefs; // coefficients

	// constructors
	public Polynomial() {

	}

	public Polynomial(int n, int degree, double[][] coefs) {
		this.n = n;
		this.degree = degree;
		this.coefs = coefs;
	}

	// getters
	public int getN() {
		return this.n;
	}

	public int getDegree() {
		return degree;
	}

	public double[][] getCoefs() {
		return coefs;
	}

	// setters
	public void setN(int a) {
		this.n = a;
	}

	public void setDegree(int a) {
		this.degree = a;
	}

	public void setCoef(int j, int d, double a) {
		this.coefs[j][d] = a;
	}

	// other methods
	public void init() {
		// init member arrays to correct size
	}

	public double f(double[] x) {
		return degree;
		// calculate function value at point x
	}

	public double[] gradient(double[] x) {
		return x;
		// calculate gradient at point x
	}

	public double gradientNorm(double[] x) {
		return degree;
		// calculate norm of gradient at point x
	}

	public boolean isSet() {
		return false;
		// indicate whether polynomial
	}
	
	public void print (){
		// print out the polynomial
	}
}
