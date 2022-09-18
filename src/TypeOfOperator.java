
public class TypeOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String s1 = "deepak";
		String s2 = "Java";
		
		System.out.println(s1.concat(s2));
	    System.out.println(s1+s2);
		
	
		int a=4;
		int y=6;
		int j=9;
		int s=7;
		System.out.println("Arithmatic Operators"); 
		System.out.println(a+y); // addition
		System.out.println(j-y); // Subtraction
		System.out.println(j*s); // multiplication
		System.out.println(y/a); // division
		System.out.println(a%y); // Modulo
		System.out.println("----------------------------");
		
		
		System.out.println("Logical Operators");
		// AND
		System.out.println(a>y && s<j); // false && True = false
		System.out.println(a<s && j>y); // true && True = True
		// OR
		System.out.println(a>y || j<s); // false || false = False
		System.out.println(s>j || a<y); // false || True = True
		// NOT
		System.out.println(!(y<a && y<a)); // in NOT condition output result reversed
		System.out.println(!(a<y)); // if result come true then it comes in output false
		System.out.println("----------------------------");
		
		
		System.out.println("ternary operator");
		System.out.println(j>s ? 9:7); // if J variable value is greater than S then answer is 9
		System.out.println(j>s ? true:false); // if variable is greater than s then answer is true
		System.out.println(j<s ? 9:7); // if s variable value is greater than j then answer is 7
		System.out.println(j<s ? true:false); // if s variable value is greater than j then answer is false
		System.out.println("----------------------------");
		
		
		System.out.println("Assignment operator");
		System.out.println(a+=y); // 
		System.out.println(a-=y);
		System.out.println(a*=y);
		System.out.println(a/=y);
		System.out.println(a%=y);
		int num1= a; 
		System.out.println(num1+=j); // a+=J means 4+=9 value is 13
		System.out.println("----------------------------");
		
		System.out.println("Relational/comparisonal operator");
		System.out.println(j<a); // 9<4 then value is false
		System.out.println(j>a); // 9>4 then value is true
		System.out.println(j==a); // 9==4 then value is false
		System.out.println(j==j); // 9==9 then value is true
		System.out.println(j!=a); // 9!=4 not equal to then value is true
		System.out.println(j<=a); // 9<=4 less than equal to then value is false
		System.out.println(j>=a); // 9>=4 greater than equal to then value is true
		System.out.println("----------------------------");
		
		
		System.out.println("increment");
		System.out.println("Relational/comparisonal operator");
		
		
		int t=10; int p=15; 
		System.out.println("increment");
		System.out.println(t++); // post fix  increase the value of t by +1 after statement end
		System.out.println(t);  // show increased value of variable by 1 in output 
		System.out.println(++p);
		
		
		System.out.println("decrement");
		System.out.println(t--); // here increase value of t 
		System.out.println(t);
		System.out.println(p);
		System.out.println(--p);
		

	}

}
