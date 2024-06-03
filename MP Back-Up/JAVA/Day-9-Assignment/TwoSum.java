
import java.util.HashSet;

public class TwoSum {
    public static boolean hasTwoSum(int[] nums, int target){
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            int complement=target-num;
            if(seen.contains(complement)){
            
        return true;
    }
    seen.add(num);
}
return false;
    }
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 9;
        if (hasTwoSum(nums, target)){
            System.out.println("There are two numbers that add up to the target.");
        }
        else{
            System.out.println("There are no two numbers that add up to the target.");
        }
        }
    }
        
