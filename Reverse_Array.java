public class Reverse_Array {
    public static void main(String[] args) {
       int[] arr = {10,-5,20,0,40,7,3};
       int left = 0;
       int right = arr.length - 1;

       while (left<right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }
       for(int num : arr){
        System.out.println(num+" ");
       }
    }
}
