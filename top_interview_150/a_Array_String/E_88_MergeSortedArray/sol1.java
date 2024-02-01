package top_interview_150.a_Array_String.E_88_MergeSortedArray;

public class sol1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        int current_size = m;
        while(index1 != m && index2 != n){
            int compare = nums1[index1+index2] - nums2[index2];
            if (compare >= 0){
                current_size += 1;
                for(int i = current_size-1; i > (index1 + index2); i--){
                    nums1[i] = nums1[i-1];
                }
                nums1[index1+index2] = nums2[index2];
                index2 += 1;
            }
            else index1 += 1;
        }
        if(index1 == m && index2 < n){
            while(index2 < n){
                nums1[m + index2] = nums2[index2];
                index2++;
            }
        }
    }

    // for testing the solution
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1}; 
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println();
        for (int i = 0; i < m + n; i++){
            System.out.print(nums1[i]);
        }
    }
}
