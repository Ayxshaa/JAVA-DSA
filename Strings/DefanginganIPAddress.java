public class DefanginganIPAddress {
    public static void main(String[] args) {
String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);  // get each character
            if (c == '.') {
                sb.append("[.]");  // replace '.' with "[.]"
            } else {
                sb.append(c);      // keep the digit as it is
            }
        }
        return sb.toString();  // convert StringBuilder back to String
    }
}
