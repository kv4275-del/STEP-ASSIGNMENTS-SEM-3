import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(
            int[] arr1,
            int[] arr2) {

        int[] result =
                new int[
                        arr1.length
                                + arr2.length
                ];

        int p1 = 0;
        int p2 = 0;
        int k = 0;


        while (p1 < arr1.length
                && p2 < arr2.length) {

            if (arr1[p1] <= arr2[p2]) {

                result[k++] =
                        arr1[p1++];

            } else {

                result[k++] =
                        arr2[p2++];
            }
        }


        while (p1 < arr1.length) {

            result[k++] =
                    arr1[p1++];
        }


        while (p2 < arr2.length) {

            result[k++] =
                    arr2[p2++];
        }


        return result;
    }


    public static void main(String[] args) {

        int[] a1 = {1, 3, 5};
        int[] b1 = {2, 4, 6};

        System.out.println(
                Arrays.toString(
                        mergeSortedArrays(
                                a1,
                                b1
                        )
                )
        );


        int[] a2 = {1};
        int[] b2 = {2, 3};

        System.out.println(
                Arrays.toString(
                        mergeSortedArrays(
                                a2,
                                b2
                        )
                )
        );
    }
}