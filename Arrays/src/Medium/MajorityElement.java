package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};

        System.out.println(majority1(nums));

    }
    public int majorityElement1(int[] v) {
        //size of the given array:
        int n = v.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }


    //my solution
    public static int majority1(int[] nums){
        int count=1;
        int maxcount=0;
        int value=0;
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if(nums[i]==nums[j]){
                count++;
                if(maxcount<count){
                    maxcount=count;
                    value=nums[i];
                }
            }else{
                count=1;
            }
            i++;
        }
        return value;
    }
}
