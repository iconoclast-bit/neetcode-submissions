class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> frequency= new HashMap<>();

    for (int num: nums){
        frequency.put(num, frequency.getOrDefault(num,0)+1);
    }
    PriorityQueue<Integer> sortedList= new PriorityQueue<>(
        (n1,n2)-> frequency.get(n1)-frequency.get(n2));
    
    for(int key: frequency.keySet()){
            sortedList.add(key);
            if(sortedList.size() > k){
                sortedList.poll();
            }
    }
    int[] result= new int[k];

    for(int i= k-1 ; i>=0 ; i--){
        result[i]= sortedList.poll();
    }
       return result; 
    }
}

