import java.util.Scanner;
import java.util.Stack;
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len)
            return "0";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number string: ");
        String num = scanner.nextLine();      
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        Solution sol = new Solution();
        String result = sol.removeKdigits(num, k);
        System.out.println("Result after removing " + k + " digits: " + result);
    }
}
