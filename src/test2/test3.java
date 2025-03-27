package test2;

public class test3 {
	public static void main(String[] args) {
//		
		//int i = 0;
		int sum = 0;
		
		for(int i = 0; i<100; i++) {
			if(i % 3==0 || i % 7==0) {
				sum += i;
			}
		}
		System.out.println("for문"+ sum);

			int y = 0;
	
				for(int i=0; i<7; i++) {
					if(i%2!=0) {
						y += i;
			System.out.println();			
			}	
		System.out.println("*");
				}
		


	}
}
