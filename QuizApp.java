import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer; 

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create a list of questions
        List<Question> quiz = new ArrayList<>();
        quiz.add(new Question("What is the capital of India?",
                new String[]{"1) Mumbai", "2) Delhi", "3) Kolkata", "4) Chennai"}, 2));
        quiz.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"1) this", "2) super", "3) extends", "4) implements"}, 3));
        quiz.add(new Question("Which collection does not allow duplicate elements?",
                new String[]{"1) List", "2) Set", "3) Map", "4) Queue"}, 2));

        int score = 0;

        // Step 2: Loop through questions
        for (int i = 0; i < quiz.size(); i++) {
            Question q = quiz.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);

            // Print options
            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (1-4): ");
            int ans = sc.nextInt();

            // Step 3: Check answer
            if (ans == q.correctAnswer) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was option " + q.correctAnswer);
            }
        }

        // Step 4: Show final score
        System.out.println("\n Quiz Over! Your Score: " + score + "/" + quiz.size());
        sc.close();
    }
}
