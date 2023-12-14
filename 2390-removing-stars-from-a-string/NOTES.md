#### Using only StringBuilder: 

class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder("");
        for(char c: s.toCharArray()){
            if(c!='*'){
                result.append(Character.toString(c));
            }
            else {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }
}

#### Using Stack

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if( c != '*' ) {
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        if(stack.size()==0)
			return "";
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}

#### Difference: 
##### StringBuilder offers direct methods for appending characters (append) and deleting characters at specific positions (deleteCharAt). These operations are generally performed in constant time or linear time, depending on the specific implementation. On the other hand, using a Stack introduces more complex operations, such as push and pop, which may come with a slightly higher overhead. Nevertheless, when it comes to straightforward tasks like removing characters while iterating through a string, utilizing StringBuilder directly is widely recognized as an efficient and accepted approach in Java.
