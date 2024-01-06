package Easy;

public class LeftRotatebyK {
    public static void main(String[] args) {

    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums, int first, int last){
        int start=first;
        int end=last;
        while(start<=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
