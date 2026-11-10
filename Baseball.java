import java.util.*;

public class Baseball {
    public static int baseBall(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {

            if (op.equals("C")) {
                stack.pop();
            }
            else if (op.equals("D")) {
                int x = stack.peek();
                stack.push(x * 2);
            }
            else if (op.equals("+")) {
                int x = stack.pop();
                int y = stack.peek();
                stack.push(x);
                stack.push(x + y);
            }
          else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(baseBall(ops));
    }
}