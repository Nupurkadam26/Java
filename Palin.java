public class Palin {
    public static void main(String[] args) {

        String text = "radar";

        for (int i = 0; i < text.length(); i++) {

            System.out.print(text.charAt(i) + " ");
        }

        System.out.println();
        System.out.println("Reverse chars of the text");

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
        boolean isPalindrome = true;
        for (int i = 0; i < text.length(); i++) {
            int reverseChar = text.length() - 1 - i;
            if (text.charAt(i) != text.charAt(reverseChar)) {
                isPalindrome = false;
                break;
            }

        }
        System.out.println("Is this a palindrome? : " + isPalindrome);

    }
}
