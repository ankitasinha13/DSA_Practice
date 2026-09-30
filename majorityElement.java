class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate; 
    }
}

//Another solution
public class majorityElement{
  public static void main(String[] args){
    int[] arr={1,1,2,2,1,1,1,2};
    for(int i=0;i<arr.length;i++){
      int count==0;
      for(int j=0;j<arr.length;j++){
        if(arr[i]==arr[i]){
          count++;
        }
      }
      if(count>arr.length/2){
        System.out.println(arr[i]);
        break;
      }
    }
  }
}
