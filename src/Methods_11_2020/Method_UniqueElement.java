package Methods_11_2020;

public class Method_UniqueElement {

    public static void main(String[] args) {


        int[] a1 = {1, 3, 4, 6, 4, 2, 78, 43, 6, 5, 55, 5, 13, 3, 13};
        arrayUniqueElement(a1);

        int[] a2 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 1, 11, 11};
        arrayUniqueElement(a2);

        int[] a3 = {1, 5, 6, 7, 8, 8, 5, 8, 5, 9, 0, 1};
        arrayUniqueElement(a3);

        int[] a4 = {8, 8, 5, 8, 5, 3, 4, 6, 4, 2, 78, 43, 6, 5, 55, 5, 13};
        arrayUniqueElement(a4);

    }


    public static void arrayUniqueElement(int[] arr) {

        for (int each : arr) {
            int count = 0;

            for (int each2 : arr) {
                if (each == each2) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.print(each + " ");

            }


        }

        System.out.println();
    }


}