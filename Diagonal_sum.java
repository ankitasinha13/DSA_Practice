public class Diagonal_sum {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {-2, -7, -8},
            {10, 8, 3}
        };

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < arr.length; i++) {
            firstSum += arr[i][i];
            secondSum += arr[i][arr.length - i - 1];
        }

        int totalSum = firstSum + secondSum;

        System.out.println("Total diagonal sum: " + totalSum);
    }
}
