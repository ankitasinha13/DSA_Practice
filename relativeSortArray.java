class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int num:arr1){
            freq[num]++;
        }
        int index=0;
        for(int num:arr2){
            while(freq[num]>0){
                arr1[index]=num;
                index++;
                freq[num]--;
            }
        }
        for(int num=0;num<freq.length;num++){
            while(freq[num]>0){
                arr1[index]=num;
                index++;
                freq[num]--;
            }
        }
        return arr1;
    }
}
