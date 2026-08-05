public class sort_neg_pos_array {
    public static void main(String[]args){
        int[] arr={-3,3,-10,14,-16,0,7};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high) {
            if(arr[mid] < 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if (arr[mid] == 0){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
