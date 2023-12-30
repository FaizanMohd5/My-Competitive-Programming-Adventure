class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s: tokens){
            if(isInteger(s))
                stack.push(Integer.parseInt(s));
            else{
                int x = stack.pop();
                int y = stack.pop();
                switch(s){
                    case "+" : 
                                stack.push(y+x);
                                break;
                    case "-" : 
                                stack.push(y-x);
                                break;
                    case "*" : 
                                stack.push(y*x);
                                break;
                    case "/" : 
                                stack.push(y/x);
                                break;
                }
            }
        }
        
        return stack.pop();
    }
    public boolean isInteger(String operand){
        try{
            Integer.parseInt(operand);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}