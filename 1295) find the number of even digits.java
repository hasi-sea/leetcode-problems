class Solution {
    public static int findNumbers(int[] nums)
     {
          int count = 0;

        for (int num : nums) {
            int digits = String.valueOf(Math.abs(num)).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }
}
