public class FreqChar {
    public static void main(String[] args) {
        // Input string
        String text = "hello world";

        text = text.replace(" ", "");

        System.out.println("Character frequencies:");

        // Outer loop to process each character
        for (int i = 0; i < text.length();) {
            char ch = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + ": " + count);
            text = text.replace(String.valueOf(ch), "");
        }
    }
}
