package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int k=14;
        int[] ans;
        ans=findsum2(arr,k);
        System.out.println(Arrays.toString(ans));

    }
    // hash method
    public static int[] findsum2(int[] nums,int k){
        int[] ans={-1,-1};
        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int rem=k-nums[i];
            if(list.containsKey(rem)){
                ans[0]=i;
                ans[1]=list.get(rem);
            }
            list.put(nums[i],i);
        }
        return ans;
    }


    //brute force
    public static int[] findsum1(int[] nums,int k){
        int[] list={-1,-1};
        for (int i = 0; i <nums.length ; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k){
                    list[0]=i;
                    list[1]=j;
                }
            }
        }
        return list;
    }
}

