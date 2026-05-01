class Solution {
    public int[] replaceElements(int[] arr) {
        for( int i =0;i<arr.length-1;i++){
            int greatest=0;
            for(int j=i+1;j<arr.length;j++){
                greatest=Math.max(arr[j],greatest);
            }
            arr[i]=greatest;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}