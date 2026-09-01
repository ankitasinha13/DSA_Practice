public class Find_odd_no {
    public static void main(String[] args){
        int[] arr = {23,4,678,9786};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int digit=0;
            while(num!=0){
                num=num/10;
                digit++;
            }
            if(digit%2 != 0){
                count++;
            }
        }
        System.out.println("Number of odd no = "+count);
    }
}
