class LogicalOpsTable {
	public static void main(String args[]) {
		boolean p, q, t1, t2;
		int a = 0;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = q = true;
		System.out.print(p +"\t" + q + "\t");
		if(p&q)
			System.out.print("1"); 
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print(p +"\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p +"\t" + q + "\t");
		if(p&q) {
			System.out.print("1" + "\t"); a = 1;
		}
		if(a==0) 
			System.out.print("0" + "\t");
			
		System.out.println((p^q) + "\t" + (!p));
		
		p = q = false;
		System.out.print(p +"\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
	}
}