
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("for Loop");
		
		
		System.out.println("1st pattern");
		for (int a=1; a<=5; a++) { // a=> 1<=5, 2<=5, 3<=5, 4<=5, 5<=5, 6<=5 false 
			
			for (int b=1; b<=a; b++) { // b=> 1<=5, 2<=5, 3<=5, 4<=5, 5<=5, 6<=5 false 
				System.out.print(a);
							}
			System.out.println();
		  }
		
					
		System.out.println("-------------------------");
		System.out.println("2nd pattern");
		for (int a=0; a<5; a++) { 
			for (int b=a; b<=a; b++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------");
		System.out.println("3rd pattern");
		
		for(int i=1; i<=5; i++) {
			for (int p=i; p<=5; p++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		System.out.println("4th pattern");
		
		
		
		
		
		}
		
		
 }


