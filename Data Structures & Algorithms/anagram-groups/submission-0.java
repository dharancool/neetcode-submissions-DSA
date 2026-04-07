class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        //sort the each word in the array then convert back to string 

        List<String> sortedstrs = new ArrayList<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String sortedchars=new String(chars);
            //if key exisits add to
            // the list else , put key and create new list as value
            if(!map.containsKey(sortedchars)){
                map.put(sortedchars,new ArrayList<>());
            }
            map.get(sortedchars).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
}
