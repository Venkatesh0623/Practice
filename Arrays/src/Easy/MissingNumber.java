package Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,3};
        System.out.println(missing(arr));
    }
    public static int missing(int[] nums){
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            ans=ans^i;
            ans=ans^nums[i];
        }
        return ans;
    }
}
