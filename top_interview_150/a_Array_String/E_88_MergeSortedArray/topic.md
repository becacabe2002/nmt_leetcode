* Two integer array `nums1`, `nums2` (sorted in increasing order).
* Two int `m`, `n` representing the number of elements in those arrays.

**Require:**
* Merge `nums1`, `nums2` into single array sorted increasing order.
* The final sorted array is stored inside `nums1` arr (whose size = m + n)

**Idea:**
* Have two index for each array.
* Compare arr1[index1] arr2[index2] 
    -> if arr1[index1] > arr2[index2]: insert arr2[index2] to before arr1[index1]; index2++
    else: index1++
* Stop when index1 == m || index2 == n
