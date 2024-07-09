
public class RVN_2_5 {

    public static void main(String[] args) {

        String str = "To be or not to be ";
        // String str = " ";
        String[] arr = str.split(" ");
        int n = arr.length;
        String result = "";

        for (int i = 0; i < n; i++) {
            String stored = "";
            result = "";
            stored = arr[i];
            for (int j = 0; j < stored.length(); j++) {

                result = stored.charAt(j) + result;

            }
            System.out.print(result + " ");
        }
    }
}
