class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0; i<s.length()-1;i++){
            char char1= s.charAt(i);
            char char2= s.charAt(i+1);
            int asciValue1=(int) char1;
            int asciValue2=(int) char2;
            score+= Math.abs(asciValue2-asciValue1);
        }
        return score;
    }
}