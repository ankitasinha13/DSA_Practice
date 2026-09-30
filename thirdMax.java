class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == max || num == secondmax || num == thirdmax) {
                continue;
            }

            if (num > max) {
                thirdmax = secondmax;
                secondmax = max;
                max = num;
            }
            else if (num > secondmax) {
                thirdmax = secondmax;
                secondmax = num;
            }
            else if (num > thirdmax) {
                thirdmax = num;
            }
        }

        if (thirdmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) thirdmax;
    }
}
