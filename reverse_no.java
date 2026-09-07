public class reverse_no {
    public static void main(String[] args){
        int [] arr = {234,567,546,97869};
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int reverse = 0;
            while(num!=0){
              int digit = num % 10;
              reverse = reverse * 10 + digit;
              num = num / 10;  
            }
            System.out.println("Reversed no is:"+ reverse);
        }
    }
}
