class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<n; i++){
            map.put(arr[i],1 + map.getOrDefault(arr[i],0));
        }
        int num = n/2;
        int res = 0;
        for(Map.Entry m : map.entrySet()){  
            if((int)m.getValue() > num)
                res = (int)m.getKey();   
        }
        return res;
    }
}