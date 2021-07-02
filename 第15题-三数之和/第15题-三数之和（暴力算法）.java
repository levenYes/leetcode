//时间超过限制
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> threeSums = new ArrayList<>();
      if(nums.length < 3) {
        return threeSums;
      }
      Set<Integer> firstNum = new HashSet<Integer>();
      for(int i=0; i < nums.length-2; i++) {
          if(!firstNum.add(nums[i])){
            continue;
          }
          Set<Integer> secondNum = new HashSet<Integer>();
        for(int j=i+1; j < nums.length-1; j++) {
          if(!secondNum.add(nums[j])){
            continue;
          }
            Set<Integer> thirdNum = new HashSet<Integer>();
          for(int k=j+1; k < nums.length; k++) {
            if(!thirdNum.add(nums[k])){
              continue;
            }
            if(nums[i]+nums[j]+nums[k]==0) {
              List<Integer> threeSum = new ArrayList<Integer>();
              threeSum.add(nums[i]);
              threeSum.add(nums[j]);
              threeSum.add(nums[k]);
              threeSums.add(threeSum);
            }
          }
        }
      }

      return threeSums;
    }
}
