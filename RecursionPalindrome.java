import java.util.Scanner;
class RecursionPalindrome {
	static boolean isPalindrome(String s,int start,int end){
		if(start>=end) {
			return true;
		}
		if(s.charAt(start)!=s.charAt(end)){
			return false;
		}
		return isPalindrome(s,start+1,end-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		if(isPalindrome(s,0,s.length()-1)) {
			System.out.println(s+"is palindrome");
		} else {
			System.out.println(s+"is not palindrome");
		}
	}
}