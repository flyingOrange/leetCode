package text;
/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
		
		for(int i=0;i<nums.length;i++)
		{
			int num1 = nums[i];
			int num2 = target - num1;
			for(int j=i+1;j<nums.length;j++)
			{
				if(num2 == nums[j])
				{
					//找到了
					res[0] = i;
					res[1] = j;
					
				}
				
			}
			
		}
		System.out.print(res[0]+","+res[1]);
        return res;
    }
	
	public static void main(String[] args) {
		int nums[] = {2, 15 , 11, 7}; 
		int target = 9;
		
		twoSum(nums,target);
		
	}

}
