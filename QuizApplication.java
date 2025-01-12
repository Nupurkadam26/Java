import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions and answers
        String[] questions = 
        {
            "1. What is the default value of a boolean variable in Java?",
            "2. Which of the following is not a Java keyword?\nA. class\nB. package\nC. method\nD. interface",
            "3. Which method is used to start a thread in Java?",
            "4. What is the correct syntax to declare a variable in Java?"
        };

        String[] correctAnswers = {
            "false",  // Answer for question 1
            "C",      // Answer for question 2
            "start",  // Answer for question 3
            "int x;"  // Answer for question 4
        };

        int score = 0; // Variable to track the score

        // Iterate through each question
        for (int i = 0; i < questions.length; i++) {
            // Display the question
            System.out.println(questions[i]);

            // Accept the user's answer
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            // Check if the answer is correct
            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                score++; // Increment the score if the answer is correct
            }
        }

        // Display the final score
        System.out.println("\nYour final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
