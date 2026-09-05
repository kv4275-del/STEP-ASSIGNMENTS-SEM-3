import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(
            int[] nums,
            int k) {

        if (nums == null
                || nums.length == 0) {

            return nums;
        }


        int n = nums.length;

        k = k % n;


        int[] newArray =
                new int[n];


        for (int i = 0;
             i < n;
             i++) {

            newArray[
                    (i + k) % n
            ] = nums[i];
        }


        System.arraycopy(newArray, 0, nums, 0, n);


        return nums;
    }


    public static void main(String[] args) {

        int[] arr1 =
                {1, 2, 3, 4, 5, 6, 7};

        System.out.println(
                Arrays.toString(
                        rotateArray(
                                arr1,
                                3
                        )
                )
        );


        int[] arr2 =
                {1, 2};

        System.out.println(
                Arrays.toString(
                        rotateArray(
                                arr2,
                                3
                        )
                )
        );
    }
}