public class RVN_2_3 {
    public static boolean array_front9(int[] num) {
        // Set the upper limit to 4 or the length of the array, whichever is smaller
        int end = Math.min(num.length, 4);
        // Check the first 4 elements (or less if the array length is less than 4)
        for (int i = 0; i < end; i++) {
            if (num[i] == 9) {
                return true;
            }
        }
     
        return false;
    }

    public static void main(String[] args) {
    
        System.out.println(array_front9(new int[]{1, 2, 9, 3, 4})); // true
        System.out.println(array_front9(new int[]{1, 2, 3, 4, 9})); // false
        System.out.println(array_front9(new int[]{1, 2, 3, 4, 5})); // false
    }
}
