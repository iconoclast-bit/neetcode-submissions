class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
            for(int i=0; i< s.length(); i++){
                if(isBracketOpen(s.charAt(i))){
                    stack.push(s.charAt(i));
                }else{
                    if(stack.size()==0) return false;
                    else{
                        if(areBracketMatching(stack.peek(),s.charAt(i))) stack.pop(); 
                        else return false;
                    }
                }
            }
            return stack.size()==0;
       
    }

    public boolean isBracketOpen(Character symbol){
        switch(symbol){
            case '(':
            case '{':
            case '[':
                return true;
            default:
                return false;
        }
    }

    public boolean areBracketMatching(char c, char d){
        if(c=='(' && d==')') return true;
        else if(c=='{' && d=='}') return true;
        else if (c=='[' && d==']') return true;
        else return false;
    }
}
