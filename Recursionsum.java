import java.util.Scanner;
class  Recursionsum{
	static int SumNaturalNumbers(int n) {
		if(n==1){
			return 1;
		}
		else{
			return n+SumNaturalNumbers(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=SumNaturalNumbers(number);
		System.out.println("Sum of first "+number+ " natural numbers is" + result);
	}
}