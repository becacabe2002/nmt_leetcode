package top_interview_150.a_Array_String.E_27_RemoveElement;

public class sol1{
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int k = 0;
        int i = 0;
        while(i < len - k){
            if (nums[i] == val){
                k++;
                for(int m = i; m < len-1; m++){
                    nums[m] = nums[m+1];
                }
                nums[len-k] = 0;
            } else i++;
        }
        return len - k;
    }

    // test solution
    public static void main(String[] args) {
        int[]  nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int res = removeElement(nums, val);
        System.out.println(res);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
        
    }
}