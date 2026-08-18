public class print2D_array{
    public static void main(String[]args){
        int[][]arr ={
            {10, 20,30},
            {-2, -7, -8},
            {10, 8, 3}
        };
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
