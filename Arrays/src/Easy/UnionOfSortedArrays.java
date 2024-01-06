package Easy;

import java.util.ArrayList;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2={2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> ans=union(nums1,nums2);
        for (int val: ans)
            System.out.print(val+" ");

    }
    public static ArrayList<Integer> union(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m= nums2.length;
        int i=0;int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);

                }
                i++;
            }else{
                if(list.size()==0 || list.get(list.size()-1)!=nums2[j]){
                    list.add(nums2[j]);

                }
                j++;
            }
        }
        while(i<n){
            if(list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);

            }
            i++;

        }
        while(j<m){
            if(list.get(list.size()-1)!=nums2[j]){
                list.add(nums2[j]);

            }
            j++;

        }

        return list;
    }
}
