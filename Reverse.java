public class Reverse {
    public static void main(String[] args) {
        String sent = "Java is fun";
        String words[] = sent.split(" ");
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence = reversedSentence + words[i];
            if (i != 0) { // Add space between words except for the last word
                reversedSentence = reversedSentence + " ";
            }

        }
        System.out.println(reversedSentence);
    }
}