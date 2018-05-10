class Break5 {
	public static void main(String args[]) {
	
	done: 
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			for(int k = 0; k < 10; k++) {
				System.out.println(k + " ");
				if(k == 5) break done;
			}
			System.out.println("Za petla k");
		}
		System.out.println("za petla j");
	}
	System.out.println("za petla i");
	}
}