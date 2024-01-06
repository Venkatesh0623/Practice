package Medium;

import java.util.Arrays;

public class SortZeroOnesTwos {
    public static void main(String[] args) {
        int nums[]={1,1,2,0,0,0,0,2,1,1,2};
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors2(int[] nums) {
        int low=0;int mid=0;int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    public static void sortColors1(int[] nums) {
        int cnt1,cnt2,cnt3;
        cnt1=cnt2=cnt3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt1++;
            }else if(nums[i]==1){
                cnt2++;
            }else{
                cnt3++;
            }
        }
        for(int i=0;i<cnt1;i++){
            nums[i]=0;
        }
        for(int i=cnt1;i<cnt1+cnt2;i++){
            nums[i]=1;
        }
        for(int i=cnt1+cnt2;i<nums.length;i++){
            nums[i]=2;
        }
    }

}
