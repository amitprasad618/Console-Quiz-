import java.util.Scanner;

public class QuestionService {

    // Declare and initialize the array
    Question questions[] = new Question[5];
    String selection[] = new String[5];
    String actualAnswer[] = new String[5];

    // Constructor to initialize the array elements
    public QuestionService() {
        questions[0] = new Question(1,"What is your name?","Amit","Jyoti","Karan","Suman","Amit");
        questions[1] = new Question(2,"What is your favorite color?","Red","Yellow","Pink","Blue","Pink");
        questions[2] = new Question(3,"What is your hobby?","Playing","Study","Drwaing","Dancing","Playing");
        questions[3] = new Question(4,"What is your age?","28","29","30","31","29");
        questions[4] = new Question(5,"What is your favorite food?","Chicken","Kerela","Bhindi","Gobi","Chicken");
    }
    
    public void showQuestion() {
        int i = 0;
        int k = 0;
        for(Question q : questions) {
            System.out.println("Question No: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("a) "+q.getOpt1()+ " b) "+q.getOpt2());
            System.out.println("c) "+q.getOpt3()+ " d) "+q.getOpt4());
            actualAnswer[k++] = q.getAnswer();
            System.out.println("Please write your Answer: ");

            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }
    }

    public void showAnswer() {
        System.out.println("Below Answer you had selected:");
        for(String i : selection) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void yourScore() {
        int score = 0;
        System.out.println(" ");
        for(int i=0;i<5;i++){
            if(selection[i] != null && selection[i].equals(actualAnswer[i])) {
                score++;
            }
        }

        System.out.println("Your Final Score is: "+ score);

    }
}
