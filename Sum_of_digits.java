public class Sum_of_digits {
    public static void main(String[] args){
        int[] arr ={23,456,78,9};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            while(num!=0){
                int digit = num % 10;  // last digit nikalo
                sum = sum + digit;     // digit ko add karo
                num = num / 10;        // last digit hatao
            }
        }
        System.out.println("Sum of the numbers = "+sum);
    }
}
