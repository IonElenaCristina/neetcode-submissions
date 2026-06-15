class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
    
        for(char c: s.toCharArray()){
            if (c == '{' || c=='['|| c=='('){
                stack.push(c);
            }
            else if(stack.isEmpty()) return false;
            else {
                char last = stack.peek();
                if (c=='}' && last !='{') return false;
                if (c==']' && last !='[') return false;
                if (c==')' && last !='(') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
