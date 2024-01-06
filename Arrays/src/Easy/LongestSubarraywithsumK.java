package Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithsumK {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        System.out.println(sublen1(a,10));

    }
    public static int sublen1(int[] nums,int k){
        int maxLen=0;
        int sum=nums[0];
        int left=0;
        int right=0;
        while(right<nums.length){
            while(left<=right && sum>k){
                sum=sum-nums[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<nums.length){
                sum=sum+nums[right];
            }

        }
        return maxLen;
    }

    public static int sublen(int[] nums,int K){
        int N=nums.length;
        Map<Integer, Integer> mpp=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=nums[i];

            if(sum==K){
                maxLen=Math.max(maxLen,i+1);
            }

            int rem=sum-K;
            if(mpp.containsKey(rem)){
                int len=i-mpp.get(rem);
                maxLen=Math.max(maxLen,len);
            }

            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
        }
        return maxLen;
    }
}
