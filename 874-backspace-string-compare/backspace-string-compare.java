import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildWithStack(s).equals(buildWithStack(t));
    }

    private String buildWithStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop(); // simulate backspace
                }
            } else {
                stack.push(c); // simulate typing
            }
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
