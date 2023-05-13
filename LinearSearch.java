public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + index);
        }
    }
}
