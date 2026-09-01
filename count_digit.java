public class count_digit {
    public static void main(String[] args) {
        int[] arr = {23,6,98,765,456};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            while(num!=0){
                num=num/10;
                count++;
            }
        }
        System.out.println("Number of digits = "+count);
    }
}
