class KbIn {
	public static void main(String args[]) 
		throws java.io.IOException {
			
			char ch;
			
			System.out.print("wprowadź znak, a nastepnie nacisnij ENTER: ");
			
			ch = (char) System.in.read();
			
			System.out.print ("wprowadziłeś: " + ch);
		}
	}
