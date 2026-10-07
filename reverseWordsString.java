class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left=0;
        for(int i=0; i <= arr.length;i++){
            if(i==arr.length||arr[i]==' '){
                int right=i-1;
                while(left<right){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
                left=i+1;
            }
        }
        return new String(arr);
    }
}
