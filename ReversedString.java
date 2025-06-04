import java.util.Scanner;
class ReversedString{
	static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		} else {
			return reverse(str.substring(1))+str.charAt(0);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		System.out.println("Reversed string: " +reverse(input));
		sc.close();
	}
}