/*
	program ilustruje różnice
	pomiędzy int i double
	
*/
class Example3 {
	public static void main(String args[]) {
		int var; // def zm 1
		double x; // def zm 2
		
		var = 10;
		
		x = 10.0;
		
		System.out.println("początkowa wartość zmiennej var: " + var);
		System.out.println("Początkowa wartość zmiennej x: " + x);
		System.out.println();
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("wartość zmiennej var po dzieleniu: " + var);
		System.out.println("wartość zmiennej x po dzieleniu: " + x);
	}
}	