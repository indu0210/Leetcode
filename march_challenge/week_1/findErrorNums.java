class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int n1 = -1, n2 = 1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                n1 = nums[i];
            }
            else if (nums[i] > nums[i - 1] + 1)
                n2 = nums[i - 1] + 1;
        }
        if (nums[nums.length - 1] != nums.length){
            n2 = nums.length;
        }
        //Arrays.sort(arr);
        return new int[] {n1, n2};
    }
}
