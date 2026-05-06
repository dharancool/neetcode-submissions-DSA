class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int countZero=0;
        int countOne=0;
        for(int i =0;i<students.length;i++){
            if(students[i]==0){
                countZero++;
            }else{
                countOne++;
            }
        }

        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && countZero>0){
                countZero--;
            }else if(sandwiches[i]==1 && countOne>0){
                countOne--;
            }else{
                break;
            }
        }
        return countZero + countOne;
        
    }
}