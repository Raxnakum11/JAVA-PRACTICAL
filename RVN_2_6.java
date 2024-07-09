
public class RVN_2_6 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String str = sc.nextLine();
        // sc.close();
        String str = "Hello";
        String revStr = "";
        System.out.println(str.length());
        System.out.println("String in upper case:" + str.toUpperCase());
        System.out.println("String in lower case:" + str.toLowerCase());

        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }

        System.out.println("Reversed string: " + revStr);
    }
}
