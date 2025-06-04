import java.util.Scanner;
class leapyear {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year");
		int y=sc.nextInt();
		if(y%4==0 && y%100!=0) {
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("Not a leap year");
		}
		sc.close();
	}
}
		