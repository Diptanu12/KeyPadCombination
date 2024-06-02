public class printKeypadCombination {
    public static void main(String[] args) {
        String str = "0";
        printCombo(str, 0, "");
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombo(String str, int idx, String combinatuion) {
        if (idx == str.length()) {
            System.out.println(combinatuion);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombo(str, idx + 1, combinatuion + mapping.charAt(i));

        }
    }
}
