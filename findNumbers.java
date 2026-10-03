class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            while(num>0){
                num=num/10;
                count++;
            }
            if(count%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
