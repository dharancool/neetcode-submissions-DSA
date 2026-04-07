class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] result=new int[temperatures.length];
        result[temperatures.length-1]=0;

        for(int i=0;i<temperatures.length-1;i++){

            int count=0;
            result[i]=0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    count++;
                    result[i]=count;
                    break;
                }else{
                    count++;
                }
            }   
        }
        return result;

    }
}
