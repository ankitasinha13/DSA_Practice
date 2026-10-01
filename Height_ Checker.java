class Solution {
    public int heightChecker(int[] heights) {
        
        int[] expected = heights.clone();

        // Sort the copied array
        Arrays.sort(expected);

        int count = 0;

        // Compare original with sorted array
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
        
    }
}