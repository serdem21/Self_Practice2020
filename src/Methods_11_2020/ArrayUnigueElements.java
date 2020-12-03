package Methods_11_2020;

public class ArrayUnigueElements {

    public static void main(String[] args) {
        int[] a1 = {100, -200, 300, 50, 40, 59, 700, 0, 1, 2, 3, 2, 6, 50, 40};
        arrayUniqueElements(a1);

    }

    public static void arrayUniqueElements(int[] arr) {

        for (int each : arr) {
            int count = 0;

            for (int each2 : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each+ " ");

            }


        }

    }
    }


