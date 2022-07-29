import java.util.ArrayList;

public class OOP extends Datalist{
    private ArrayList<String> notes;
    private ArrayList<Vocabulary> wordsToKnow;

    public ArrayList<String> getNotes(){
        return notes;
    }

    public ArrayList<Vocabulary> getWordsToKnow(){
        return wordsToKnow;
    }

    public OOP(){
        notes = new ArrayList<String>();
        wordsToKnow = new ArrayList<Vocabulary>();
        wordsToKnow.add(new Vocabulary("Inheritance", "A mechanism in which one object acquires all the properties and behaviors of a parent object"));
        notes.add("The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.");
        wordsToKnow.add(new Vocabulary("Class", "A class is a group of objects which have common properties."));
        wordsToKnow.add(new Vocabulary("Sub Class", "Subclass is a class from which inherits the other class"));
        wordsToKnow.add(new Vocabulary("Super Class", "Superclass is the class from where a subclass inherits the features"));
        notes.add("The extends keyword indicates that you are making a new class that derives from an existing class.");

    }
}
