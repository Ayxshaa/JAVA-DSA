public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command)); // Expected output: "Goal"
    }

    public static String interpret(String command) {
        StringBuilder gp = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);

            if (c == 'G') {
                gp.append('G');
            }
            else if (c == '(') {
                if (command.charAt(i + 1) == ')') { // Case: "()"
                    gp.append('o');
                    i++; // Skip ')'
                }
                else if (command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l') { // Case: "(al)"
                    gp.append("al");
                    i += 3; // Skip "al)"
                }
            }
        }
        return gp.toString();
    }
}
