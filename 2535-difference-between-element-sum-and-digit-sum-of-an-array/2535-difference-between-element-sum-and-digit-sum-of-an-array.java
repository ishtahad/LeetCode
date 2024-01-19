
class Solution {
    public int differenceOfSum(int[] nums) {
        int sumOfNums = 0;
        int sumOfDigits = 0;
        int difference = 0; 
        for(int i = 0 ; i < nums.length ; i++){
            sumOfNums = nums[i] + sumOfNums;
            sumOfDigits =  sumOfDigits +  String.valueOf(nums[i]).chars().map(Character::getNumericValue).sum();
        } 
      difference = sumOfNums - sumOfDigits;
      return difference;
    }
}