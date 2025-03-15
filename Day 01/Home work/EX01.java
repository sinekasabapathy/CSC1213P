class EX01
{
	public static void main(String[]args)
	{
		
		// Unary operators
		
		int a=10;
		int b=20;
		
		System.out.println("value1 : "+a);
		System.out.println("post increment : "+ a++);
		System.out.println("currentval1 : "+a);
		System.out.println("pre increment : "+ ++a);
		
		System.out.println("value2 : "+b);
		System.out.println("post decrement : "+ b--);
		System.out.println("Currentval2 : "+ b);
		System.out.println("pre decrement : "+ --b);
		System.out.println();
		
		//logical operators
		
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println(true && true);
		System.out.println();
		
		System.out.println(true || false);
		System.out.println(true || false);
		System.out.println(true ||  false);
		System.out.println(true || false);
		System.out.println();
		
		System.out.println(!true);
		
		//Relational operators
		int c=1;
		int d=2;
		
		System.out.println(c>d);
		System.out.println(c<d);
		System.out.println(c>=d);
		System.out.println(c<=d);
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println();
		
		
		//Assignment operators
		int e=a+b;
		System.out.println("e = "+e);
		
		e+=a;
		System.out.println("number1 :"+e);
		
		e-=a;
		System.out.println("number2 :"+e);
		
		e*=a;
		System.out.println("number3 :"+e);
		
		e/=a;
		System.out.println("number4 :"+e);
		
		e%=a;
		System.out.println("number5 :"+e);
		
		System.out.println();
		
		
		//Ternary Operation 
		
		String Result=true?"yes":"no";
		System.out.println(Result);
		
		String result1=a>b?"yes":"No";
		System.out.println(result1);
	}
}
		
		