//time complexity - O(n), Space complexity - O(n)
//The algorithm uses a HashMap to store the elements encountered in the array.
//It iterates through the array, calculating the complement for each element. If the complement is found in the HashMap, it returns the indices of the two elements. 
//Otherwise, it adds the current element and its index to the HashMap. 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int c = target-nums[i];
            if(map.containsKey(c)) return new int[] {map.get(c),i};
            
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
        
    }
}
