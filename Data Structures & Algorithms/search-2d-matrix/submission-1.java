class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex=0;
        for(int i=0;i<matrix.length;i++){
            if(target>matrix[i][matrix[i].length-1]){
                continue;
            }else{
                rowIndex=i;
                break;
            }
        }

        for(int j=0;j<matrix[0].length;j++){
            if(matrix[rowIndex][j]==target){
                return true;
            }
        }
        return false;
    }
}
