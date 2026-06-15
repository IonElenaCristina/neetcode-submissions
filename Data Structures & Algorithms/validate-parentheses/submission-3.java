class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length()==1) return false;
        for(char c: s.toCharArray()){
            if (c == '{' || c=='['|| c=='('){
                stack.push(c);
            }
            else if(stack.size()==0) return false;
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
