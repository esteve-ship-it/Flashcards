import java.util.ArrayList;

public class Datalist {
    private ArrayList<String> notes;
    private ArrayList<Vocabulary> wordsToKnow;
    private ArrayList<Question> questionList;

    public ArrayList<String> getNotes(){
        return notes;
    }

    public ArrayList<Vocabulary> getWordsToKnow(){
        return wordsToKnow;
    }
}
