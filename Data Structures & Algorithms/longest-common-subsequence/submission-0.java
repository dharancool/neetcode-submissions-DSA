class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] c=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            c[i][0]=0;
        }  
        for(int j=0;j<n+1;j++){
            c[0][j]=0;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    c[i][j]=1+c[i-1][j-1];
                }else if(c[i-1][j]>=c[i][j-1]){
                    c[i][j]=c[i-1][j];
                }else{
                    c[i][j]=c[i][j-1];
                }

            }
        }
        return c[m][n];




    }
}
