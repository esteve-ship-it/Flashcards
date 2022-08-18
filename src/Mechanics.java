import java.util.ArrayList;

public class Mechanics extends Datalist{
    private ArrayList<String> notes;
    private ArrayList<Vocabulary> wordsToKnow;
    private ArrayList<Question> questionList;

    public ArrayList<String> getNotes(){
        return notes;
    }

    public ArrayList<Vocabulary> getWordsToKnow(){
        return wordsToKnow;
    }

    public Mechanics(){
        notes = new ArrayList<String>();
        wordsToKnow = new ArrayList<Vocabulary>();
        questionList = new ArrayList<Question>();
        questionList.add(new Question("An arrow is shot straight up in the air at an initial speed of 15.0 m/s. After " +
                "how much time is the arrow moving downward at a speed of 8.00m/s? " +
                "Assume gravity is 9.8 m/s^2 and remember sig. figs", "2.35 s"));
        wordsToKnow.add(new Vocabulary("Scalar quantities", "quantities that have only a numerical value and no associated direction"));
        wordsToKnow.add(new Vocabulary("Vector quantities", "have both magnitude and direction and obey the laws of vector addition"));
        notes.add("When two or more vectors are added together, they must have the same units and they all must be the same type of quantity");
        questionList.add(new Question("Is it possible to add a vector quantity to a scalar quantity", "no"));
        wordsToKnow.add(new Vocabulary("displacement vector", "for a particle is the difference between its final position between its final position vector and its initial position vector"));
        wordsToKnow.add(new Vocabulary("average velocity", "of a particle during the time interval dt is defined to as the displacement of the particle divided by the time interval"));
        notes.add("A particle in uniform circular motion undergoes a radial acceleration a, because the direction of v changes over time");
        questionList.add(new Question("True/False: Does a car moving around a circular track with constant speed have zero acceleration?", "False"));
        questionList.add(new Question("True/False: Does a car moving around a circular track with constant speed have an acceleration directed toward the center of its path", "True"));
        questionList.add(new Question("A rubber stopper on the end of a string is swung steadily in a horizontal circle. In one trial, it moves at speed v in a circle of radius r." +
                "In a second trial, it moves at a higher speed 3v in circle of radius 3r. What is the ratio of the acceleration trial 2/trail 1?", "3"));
    }
}
