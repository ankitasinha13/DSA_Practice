public class palindrome {
   public static void main(String [] args){
    int [] arr={121,444,676,988,986};
    
    for(int i=0;i<arr.length;i++){
        int num=arr[i];
        int original = num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(original==reverse){
        System.out.println(original +" is palindrome");
        }
    }
   }
}
