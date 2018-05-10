class Guess4a {
	public static void main(String args[])
	throws java.io.IOException {
		char ch, ignore, answer = 'o';
		
		do {
			System.out.println("Pomyslalem litere z przedzialu od a do z.");
			System.out.print("Sprobuj ja odgadnac: ");
			
			ch = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			
			if(ch == answer) System.out.println("***DOBRZE***!!!");
			else {
				System.out.print("Niestety nie trafiles ");
				if(ch < answer) System.out.println(" za nisko");
				else System.out.println(" za wysoko");
				System.out.println("Sprobuj jeszcze raz!\n");
			}
			
		} while(answer != ch);
	}
}