import java.util.*;

public class OnlineExaminationSystem {

    // Question class
    static class Question {
        String questionText;
        String[] options;
        String correctAnswer;

        // Constructor
        public Question(String questionText, String[] options, String correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        // Method to display the question and options
        public void displayQuestion() {
            System.out.println(questionText);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
        }

        // Method to check the answer
        public boolean checkAnswer(String answer) {
            return answer.equalsIgnoreCase(correctAnswer);
        }
    }

    // Quiz class that contains a list of questions and handles the quiz logic
    static class Quiz {
        List<Question> questions;
        int score;

        public Quiz() {
            questions = new ArrayList<>();
            score = 0;
        }

        // Add a question to the quiz
        public void addQuestion(Question question) {
            questions.add(question);
        }

        // Method to start the quiz
        public void startQuiz() {
            Scanner scanner = new Scanner(System.in);
            for (Question question : questions) {
                question.displayQuestion();
                System.out.print("Enter your answer: ");
                String answer = scanner.nextLine();
                if (question.checkAnswer(answer)) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect! The correct answer was: " + question.correctAnswer + "\n");
                }
            }
            displayResult();
            scanner.close();
        }

        // Method to display the result
        public void displayResult() {
            System.out.println("Quiz Over! Your score is: " + score + "/" + questions.size());
        }
    }

    public static void main(String[] args) {
        // Create a Quiz object
        Quiz quiz = new Quiz();

        // Create some questions
        String[] options1 = {"Java", "Python", "C++", "JavaScript"};
        Question q1 = new Question("Which programming language is used for Android development?", options1, "Java");

        String[] options2 = {"10", "20", "30", "40"};
        Question q2 = new Question("What is 10 + 10?", options2, "20");

        String[] options3 = {"London", "Paris", "Berlin", "Madrid"};
        Question q3 = new Question("What is the capital of France?", options3, "Paris");

        // Add questions to the quiz
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

        // Start the quiz
        quiz.startQuiz();
    }
}
