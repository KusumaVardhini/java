import java.util.Scanner;
class switchoperator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st value:");
		double n1=sc.nextDouble();
		System.out.print("Enter 2nd value:");
		double n2=sc.nextDouble();
		System.out.print("Enter operator:");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator){
			case'+' :
			result=n1+n2;
			System.out.println(result);
			break;
			case'-':
			result=n1-n2;
			System.out.println(result);
			break;
			case '*' :
			result=n1*n2;
			System.out.println(result);
			case '/' :
			if(n2!=0){
				result=n1/n2;
				System.out.println(result);
				break;
			}else {
				System.out.println("Enter positive values");
			}
			default :
			System.out.println("invalid");
		}
		sc.close();
	}
}