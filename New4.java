import java.util.Scanner;
import java.util.Stack;

public class New4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        BinaryTree bt = createBt(s);
        bt.orderTraversal(bt.getRoot());
    }

    private static BinaryTree createBt(String s) {
        Stack<Integer> stack = new Stack<>();
        fillData(s, stack);
        Node root = new Node(stack.get(0));
        BinaryTree bt = new BinaryTree(root);
        for (int i=0;i<stack.size();i++) {
            if (i != 0) {
                bt.add(stack.get(i));
            }
        }

        return bt;
    }

    private static Stack<Integer> fillData(String s, Stack<Integer> stack) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                newS += s.charAt(i);
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int digit = Integer.parseInt(newS);
                stack.add(digit);
                newS = "";
            }
        }
        return stack;
    }
}
