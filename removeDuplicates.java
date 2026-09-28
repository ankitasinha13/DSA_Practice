class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0;
      int j=1;
      while(j<nums.length){
        if(nums[i]==nums[j]){
            j++;
        }else if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
        }
    }
        for(int k=0;k<i;k++){
            System.out.println(nums[k]);
        }
        return i+1;
    }
}
