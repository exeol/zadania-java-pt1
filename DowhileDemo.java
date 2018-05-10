class DowhileDemo {
	public static void main(String args[])
	throws java.io.IOException {
		
		char ch;
		
		do {
			System.out.print("Nacisnij dowolny klawisz a potem Enter: ");
			ch = (char) System.in.read();
		} while(ch != 'q');
	}
}