package Lab4;

import java.util.Stack;

public class checkParentheses {
    public boolean Check(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < expression.length(); i++)
        {
            if(expression.charAt(i) == '(') {
                stack.push('(');
            }
            if(expression.charAt(i) == ')') {
                if(stack.empty()) return false;
                stack.pop();
            }
        }
        if(!stack.empty()) return false;
        return true;
    }
}
