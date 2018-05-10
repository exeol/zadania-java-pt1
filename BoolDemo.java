class BoolDemo {
	public static void main(String args[]) {
		boolean b;
		
		b = false;
		System.out.println("b jest: " + b);
		
		b = true;
		System.out.println("b jest: " + b);
		if(b) System.out.println(" to wywołanie zostało wykonane");
		
		b = false;
		if(b) System.out.println("to wywołanie nie zostało wykonane");
		
		System.out.println("10 > 9 jest" + (10 > 9));
	}
}