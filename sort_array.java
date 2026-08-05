/*public class sort_array {
    public static void main(String[] args) {
        int[] arr={0,2,2,1,0,2,1,0};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        int index=0;
        while (count0 > 0) {
            arr[index]=0;
            index++;
            count0--;
        }
        while (count1 > 0){
            arr[index]=1;
            index++;
            count1--;
        }
        while (count2 > 0){
            arr[index] = 2;
            index++;
            count2--;
        }
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+" "); 
        }
    }
}*/

//Dutch National Flag Problem
public class sort_array{
    public static void main(String[] args) {
        int[] arr={0,2,2,1,0,2,1,0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if (arr[mid] == 1){
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
