class Solution {
    public boolean isValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        //if open bracket add it to stack 
        //else check consitions
        for(int i=0; i<s.length();i++){
            
            if (s.charAt(i)=='(' || s.charAt(i)== '{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            } else{
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if(st.peek()=='(' && s.charAt(i)==')'){
                    st.pop();
                }
                else if(st.peek()=='{' && s.charAt(i)=='}'){
                    st.pop();
                }
                else if(st.peek()=='[' && s.charAt(i)==']'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
        
        

        
    }
}
