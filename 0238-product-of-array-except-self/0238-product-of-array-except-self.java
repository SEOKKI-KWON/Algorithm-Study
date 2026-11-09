class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int n = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = n;
            n *= nums[i];
        }

        n = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= n;
            n *= nums[i];
        }

        return answer;
    }
}