package Lesson2;

import java.net.SocketOption;

public class l2 {
    public static void main(String args[]) {

    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 1, 1, 1};
        int i = 0;
        while (i <= arr.length) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            i++;
        }
    }


    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    public static void changArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] + 6;
            } else arr[i] = arr[i];
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i = j || i += j = 4) {
                    System.out.println(1);
                } else System.out.println(0);
            }
        }
    }
    public  static  void test(){
        int[] m = {9,19,10,7,6};
        int ii = 0;
        int i = 1;
        int pop = 0;
        while (pop < m.length) {
            while (m[ii] > m[i]) {
                i++;
            }
            ii = i;
            i++;
            System.out.println(m[ii] + "");
            pop++;
        }
    }
    private static boolean checkBalance(int[] arrParam) {
        int lSum, rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    }
    private static void shiftNum(int[] arrParam, int n) {
        //вывод массива
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("\r\n");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
                //просмотр сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length - 1] = buf;
                // после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }
}