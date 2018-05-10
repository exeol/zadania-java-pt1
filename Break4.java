class Break4 {
	public static void main(String args[]) {
		int i;
		
		for(i = 1; i < 4; i++) {
			one: {
			two: {
			three: {
				System.out.println("\ni jest rowne " + i);
				if(i == 1) break one;
				if(i == 2) break two;
				if(i == 3) break three;
				
				System.out.println("to sie nigdy nie wyswietli");
			}
			System.out.println("za trzecim blokeim");
			}
			System.out.println("za drugim blokiem");
			}
			System.out.println("za pierwszym blokiem");
		}
		System.out.println("za petla for");
		
	}
}