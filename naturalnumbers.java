import java.util.Scanner;
class naturalnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Enter a valied number");
		}
		else{
			System.out.println("The numbers are");
			for(int i=1;i<=n;i++){
				System.out.println(i+"");
			}
			System.out.println();
		}
		sc.close();
	}
}