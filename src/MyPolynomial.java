import java.io.*;
import java.util.*;

public class MyPolynomial {
	
	private double[] coeffs; 
	
	public MyPolynomial(double... coeffs) {  // varargs 
		this.coeffs = coeffs; 
	}

	public MyPolynomial(String filename) { 
		Scanner in = null;   
		try {       
			in = new Scanner(new File(filename));     
			} catch (FileNotFoundException e) {    
				e.printStackTrace();   
			}    
		int degree = in.nextInt();        
		coeffs = new double[degree+1];     
		for (int i=0; i<coeffs.length; ++i) {    
			coeffs[i] = in.nextDouble();    
		}    		
	}
	
	public int getDegree() {
		return coeffs.length - 1;
	}
	
	@Override
	public String toString() {		
		String s = "";
		String term;
		for (int i = 0; i < coeffs.length; i++) {
			if (coeffs[i] != 0) {
				if (i == 0) {
					term = "" + coeffs[i];
				} else {
					if ( i == 1) {
						term = coeffs[i] + "x";
					} else {
						term = coeffs[i] + "x^" + i;
					}
				}
				if (s.length() != 0) {
					s = term + "+" + s;
				} else {
					s = term + s;
				}
			}		
		}		
		return s;		
	}
	
	public double evaluate(double x) {
		double accum = 0;
		for (int i = 0; i < coeffs.length; i++) {
			accum += coeffs[i] * Math.pow(x, i);
		}
		return accum;
	}
	
	
	public MyPolynomial add(MyPolynomial p) {
		double[] result, biggest, smallest;
		if (coeffs.length > p.coeffs.length) {
			biggest = coeffs;
			smallest = p.coeffs;
		} else {
			biggest = p.coeffs;
			smallest = coeffs;
		}
		result = new double[biggest.length];
		for (int i = 0; i < biggest.length; i++) {
			result[i] = biggest[i];
		}
		for (int i = 0; i < smallest.length; i++) {
			result[i] += smallest[i];
		}
		return new MyPolynomial(result);
		
	}
	
	public MyPolynomial multiply(MyPolynomial p) {
		double[] result = 
				new double[coeffs.length + p.coeffs.length - 1];
		
		for (int i = 0; i < coeffs.length; i ++) {
			for (int j = 0; j < p.coeffs.length; j ++) {
				result[i + j] = coeffs[i] * p.coeffs[j];
			}
		}
		
		return new MyPolynomial(result);
	}
	
}

















