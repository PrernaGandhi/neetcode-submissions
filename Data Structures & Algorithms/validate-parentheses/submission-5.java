class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
    
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else if(
                (ch == ')' && !stack.isEmpty() && stack.peek() == '(')
                || (ch == '}' && !stack.isEmpty() && stack.peek() == '{')
                || (ch == ']' && !stack.isEmpty() && stack.peek() == '[')) {
                    stack.pop();
                }
                else {
                    return false;
                }
        }

        return stack.isEmpty();
        
    }
}
