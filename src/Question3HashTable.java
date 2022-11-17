import java.util.HashMap;

public abstract class Question3HashTable {
    public int[] sumTwoElementsToTarget(int[] nums, int target){
        int complement =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        //populate the map with nums elements as key
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        //find the couple elements
        for (int i =0; i < nums.length; i++){
            complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[] {i, map.get(complement)};
        }
        return null;
    }
}
