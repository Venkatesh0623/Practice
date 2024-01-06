package Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,-20,100,67,52,23};
        System.out.println(secondlarge2(nums));
    }
    public static int secondlarge2(int[] nums){
        if(nums.length<2){
            return -1;
        }
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>large){
                second_large=large;
                large=nums[i];
            }
            else if(nums[i]>second_large && nums[i]!=large){
                second_large=nums[i];
            }
        }
        return second_large;
    }




    public static int secondlarge1(int[] nums){
        if(nums.length<2){
            return -1;
        }
        int large=0;
        int second_large=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>large){
                large=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>second_large && nums[i]!=large){
                second_large=nums[i];
            }
        }
        return second_large;
    }
}
