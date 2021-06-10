import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sliceArray(new int[]{4, 3, 8, 4, 2, 5, 6, 5, 7, 9, 2})));
        System.out.println(Arrays.toString(sliceArray(new int[]{9, 8, 4, 9, 6, 1, 2, 0, 2, 1})));
        System.out.println(Arrays.toString(sliceArray(new int[]{2, 4, 2, 5, 8, 2, 5, 6, 5, 7})));
        System.out.println(hasOneAndFour(new int[]{1, 1, 1, 1, 4, 4, 4, 4, 1, 4, 4}));
        System.out.println(hasOneAndFour(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(hasOneAndFour(new int[]{1, 1, 1, 1, 4, 4, 3, 4, 4, 1, 4, 4}));
    }

     static int[] sliceArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("В данном массиве нет цифры 4!");
    }

     static boolean hasOneAndFour(int[] arr) {
        boolean arg1 = false;
        boolean arg2 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arg1 = true;
            else if (arr[i] == 4) arg2 = true;
            else throw new RuntimeException( arr[i] + " не должна находится в массиве!");
        }
        return arg1 && arg2;
    }
}


