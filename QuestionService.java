import java.util.Scanner;

public class QuestionService {


    Question[] questions = new Question[5];
     String Selection[] = new String[5];

    public QuestionService() {

        questions[0] = new Question(1,"what is the powerful tool in program?","java","C","Python","C++","R","java");
        questions[1] = new Question(2,"what is the best backend coding?","java","C","Python","C++","by","java");
        questions[2] = new Question(3,"which language was taken by oracle?","java","C","Python","C++","Ruby","java");
        questions[3] = new Question(4,"which is the more oops language?","java","C","Python","C++","Ruby","java");
        questions[4] = new Question(5,"which language has more develpor?","java","C","Python","C++","Ruby","java");
    }

    public void questionDisplay() {

        for(int i = 0;i < questions.length;i++) {
            System.out.print("Question No:" + questions[i].getId());
            System.out.println(questions[i].getQuestion());
            System.out.println("Option 1" + questions[i].getOpt1());
            System.out.println("Option 2" + questions[i].getOpt2());
            System.out.println("Option 3" + questions[i].getOpt3());
            System.out.println("Option 4" + questions[i].getOpt4());
            System.out.println("Option 5" + questions[i].getOpt5());
            Scanner sc = new Scanner(System.in);
            Selection[i] = sc.nextLine();

        }

        for(String q : Selection) {
            System.out.println("The Entered answer from User is :" + q);
        }
    }

    public void scoreDisplay() {
        int score = 0;
        for (int i=0;i < questions.length; i++) {
            String answer = questions[i].getAnswer();
            String enteredAnswer = Selection[i];
            
            if (answer.equals(enteredAnswer)) {
                score++;
            }
        }

        System.out.println("Your Score  :" + score);

    }
    
}
