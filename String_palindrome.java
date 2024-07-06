     package basics;

public class palindrome {
	 public boolean palindrome(String str){
	        str.trim().toLowerCase();
	        String nstr=new StringBuilder(str).reverse().toString();
	        nstr.trim().toLowerCase();
	        System.out.println(str.length());
	        System.out.println(nstr.length());
	        
      return str.equals(nstr);
		}
	public static void main(String[] args) {
		String str="level";
		sum_of_two_nums obj=new sum_of_two_nums();
		System.out.println(obj.palindrome(str));
		
	}
}





