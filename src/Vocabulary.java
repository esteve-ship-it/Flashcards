public class Vocabulary {
    private String word;
    private String definition;

    public Vocabulary(String word, String definition){
        setWord(word);
        setDefinition(definition);
    }
    public void setWord(String word){
        this.word = word;
    }
    public void setDefinition(String definition){
        this.definition = definition;
    }
    public String getWord(){
        return word;
    }

    public String getDefinition(){
        return definition;
    }
}
