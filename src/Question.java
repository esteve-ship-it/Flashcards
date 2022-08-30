public class Question {
    private String question;
    private String a, b, c, d;
    private String answer;

    public Question(String question, String a, String b, String c, String d, String answer){
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
    }

    public void setQuestion(String question){
        this.question = question;
    }
    public String getQuestion(){
        return question;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public String getAnswer(){
        return answer;
    }
    public String getA(){
        return a;
    }
    public String getB(){
        return b;
    }
    public String getC(){
        return c;
    }
    public String getD(){
        return d;
    }
}
