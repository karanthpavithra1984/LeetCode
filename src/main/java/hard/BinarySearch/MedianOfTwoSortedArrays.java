package hard.BinarySearch;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        int total = nums1.length + nums2.length;
        int half = (total + 1) / 2;

        //Make sure u choose the less longer array for the left partition
        if (B.length < A.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }
        //Find the partitions
        //Now find the left partition of smaller nums i.e A
        int l = 0, r = A.length;
        while (l <= r) {
            int midA = (l + r) / 2;
            //Mid B is half - left partition length, since indexes start with 0
            //We are considering them as well
            int midB = half - midA;
            //Aleft is end of the left partition , Aright is the beginning of right partition
            int Aleft = midA > 0 ? A[midA - 1] : Integer.MIN_VALUE;
            int Aright = midA < A.length ? A[midA] : Integer.MAX_VALUE;
            int Bleft = midB > 0 ? B[midB - 1] : Integer.MIN_VALUE;
            int Bright = midB < B.length ? B[midB] : Integer.MAX_VALUE;

            if (Aleft <= Bright && Bleft <= Aright) {
                if (total % 2 != 0) {
                    return Math.max(Aleft, Bleft);
                }
                //Even
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;

            } else if (Aleft > Bright) {
                r = midA - 1;
            } else {
                l = midA + 1;
            }
        }

        return -1;
    }
}
