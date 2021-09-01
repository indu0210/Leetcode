class binarySearch {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int i = 0;
        while(i < size){
            int mid = (size + i)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                size = mid;
            }else {
                i = mid + 1;
            }
        }
        return -1;
    }
}