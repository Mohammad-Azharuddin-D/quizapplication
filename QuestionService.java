public class QuestionService {


    Question[] questions = new Question[5];

    public QuestionService() {

        questions[0] = new Question(1,"what is the powerful tool in program?","java","C","Python","C++","Ruby","java");
        questions[1] = new Question(2,"what is the best backend coding?","java","C","Python","C++","Ruby","java");
        questions[2] = new Question(1,"which language was taken by oracle?","java","C","Python","C++","Ruby","java");
        questions[3] = new Question(1,"which is the more oops language?","java","C","Python","C++","Ruby","java");
        questions[4] = new Question(1,"which language has more develpor?","java","C","Python","C++","Ruby","java");
    }

    public void questionDisplay() {

        for(int i = 0;i < questions.length;i++) {
            System.out.println(questions[i]);


        }
        

    }
    
}
