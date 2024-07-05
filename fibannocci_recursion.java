 package basics;

public class sum_of_two_nums {
	static int a=1;
	static int b=1;
	static int c=0;
	 static void  fibannoci(int count) {
		if(count>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		
		 fibannoci(count-1);
	}
	 }
	public static void main(String args[]) {
		int count=10;
		System.out.print(a+" ");
		System.out.print(b);
		fibannoci(count-2);
	}
		
	}		




//fibannoci without recursiion 

     package basics;

public class sum_of_two_nums {
	public static void main(String args[]) {
		int a=1;
		int b=1;
		System.out.print(a+" ");
		System.out.print(a+" ");
		for(int i=0;i<10;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		
	}
		
	}		
	
}
