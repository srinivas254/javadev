package in.pbst;

public class problem26 {

    public static boolean isBalanced(String s) {
        if (s == null) {
            return false;
        }

        int[] stack = new int[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else if (c == ')' || c == '}' || c == ']') {
                if (top == -1 || !isMatching(stack[top], c)) {
                    return false;
                }
                top--;
            }
        }
        return top == -1;
    }

    private static boolean isMatching(int open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "{{[[(())]]}}";

        System.out.println("String 1: " + s1 + " - Balanced? " + isBalanced(s1));
        System.out.println("String 2: " + s2 + " - Balanced? " + isBalanced(s2));
        System.out.println("String 3: " + s3 + " - Balanced? " + isBalanced(s3));
    }
}
