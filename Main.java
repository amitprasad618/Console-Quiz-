class Main {

    public static void main(String str[]) {
        System.out.println("Welocome to the World of Quiz!!");

        QuestionService que = new QuestionService();
        que.showQuestion();
        que.showAnswer();
        que.yourScore();
    }
}