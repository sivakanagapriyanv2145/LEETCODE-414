class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,i,c=1;//The count=1 because we already takes the max element in array
        int max=nums[n-1];
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<max){
                
                max=nums[i];
                c++;
            }
            if(c==3){
                break;
            }
        }
        if(c<3){
            max=nums[n-1];
        }
return max;

        
    }
}
