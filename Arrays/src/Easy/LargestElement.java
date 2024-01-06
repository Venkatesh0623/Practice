package Easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums={20,100,334,-20,1};
        System.out.println(maxnum(nums));
    }
    public static int maxnum(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
