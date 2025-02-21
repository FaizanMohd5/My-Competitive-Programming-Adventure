class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char temp: s.toCharArray()){
            if(temp=='(' || temp=='[' || temp=='{'){
                stack.push(temp);
            }
            else{

                if(stack.isEmpty()){
                    return false;
                }

                if((stack.peek()=='(' && temp == ')') || 
                   (stack.peek()=='[' && temp == ']') || 
                   (stack.peek()=='{' && temp == '}')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}