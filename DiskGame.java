import java.util.Scanner;
public class DiskGame {
    public static void solveHanoi(int n,char source,char auxiliary,char destination) {
        if (n==1) {
            System.out.println("Move disk 1 from " +source+ "to" +destination);
            return;
        }
        solveHanoi(n-1,source,destination,auxiliary);
        System.out.println("Move disk " +n+ "from" +source+ "to" +destination);
        solveHanoi(n-1,auxiliary,source,destination);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int numDisks = sc.nextInt();
        System.out.println("\nTowers of Hanoi solution for " + numDisks + " disks:\n");
        solveHanoi(numDisks, 'A', 'B', 'C');
        sc.close();
    }
}
