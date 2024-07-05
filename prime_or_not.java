package basics;

public class sum_of_two_nums {
	public static void main(String args[]) {
		int a=0;
		int c=1;
		if(a==1||a==0) {
			System.out.println("not datermined");
		}
		else {
		 for(int i=2;i<=a;i++) {
		
			if(a%i==0) {
				c++;}
		}
		}
		if(c!=1) {
		  if(c==2) {
			System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}  
	}
	
}
