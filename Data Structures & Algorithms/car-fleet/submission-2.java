class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n=position.length;
        int[][] pair=new int[position.length][2];

        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(b[0],a[0]));
        Stack<Double> time=new Stack<>();

        for(int i=0;i<n;i++){
            time.push((double)(target-pair[i][0])/pair[i][1]);
            if(time.size()>=2 && time.peek()<=time.get(time.size()-2)){
                time.pop();
            }
        }
        return time.size();
    }
}
