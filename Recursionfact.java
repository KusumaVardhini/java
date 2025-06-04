import java.util.Scanner;
class Recursionfact{
	static int factorial(int n) {
		if(n<=1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=factorial(number);
		System.out.println("Factorial of" +number+ "is" +result);
	}
}