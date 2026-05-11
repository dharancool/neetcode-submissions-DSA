class Solution {
    public int lengthOfLastWord(String s) {
        int index=s.length()-1;
        while(s.charAt(index)==' '){
            index--;
        }
        int length=0;

        for(int i=index;i>=0;i--){
            if(s.charAt(i)==' '){
                return length;
            }else{
                length++;
            }
        }
        return length;
        
    }
}