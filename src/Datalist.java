import java.util.ArrayList;

public class Datalist {
    protected ArrayList<String> notes;
    protected ArrayList<Vocabulary> wordsToKnow;
    protected ArrayList<Question> questionList;

    public ArrayList<String> getNotes(){
        return notes;
    }

    public ArrayList<Vocabulary> getWordsToKnow(){
        return wordsToKnow;
    }
}
