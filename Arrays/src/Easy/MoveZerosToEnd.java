package Easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums={23,0,0,0,12,34,-10,0,0,100};
        zeroend(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void zeroend(int[] nums){
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }else{
                count++;
            }
        }
        if(count>0){
            for(int k=i;k<nums.length;k++){
                nums[k]=0;
            }
        }
    }
}
