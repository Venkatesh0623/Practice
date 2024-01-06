package Easy;

import java.util.HashMap;

public class NumberAppearsOnce{
    public static void main(String[] args) {
        int[] nums={3,5,2,3,2,6,6,5,23};
        System.out.println(appearsOnce4(nums));
    }
    public static int appearsOnce4(int[] arr){
        int n = arr.length;
        int ans=0;
        for (int i = 0; i <n ; i++) {
            ans=arr[i]^ans;
        }
        return ans;
    }
    public static int appearsOnce3(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
        for (HashMap.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }


    public static int appearsOnce2(int[] arr){
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
    public static int appearsOnce1(int[] arr){
        int n = arr.length;
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]=hash[arr[i]]+1;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1;

    }
}
