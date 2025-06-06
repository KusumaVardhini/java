import java.util.Scanner;
public class AntMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] moves = new int[n];
        for (int i = 0; i < n; i++) {
            moves[i] = sc.nextInt();
        }
        int position = 0;
        int count = 0;
        for (int move : moves) {
            position += move;
            if (position == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}