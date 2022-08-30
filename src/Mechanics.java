import java.util.ArrayList;

public class Mechanics extends Datalist{

    public ArrayList<String> getNotes(){
        return notes;
    }

    public ArrayList<Vocabulary> getWordsToKnow(){
        return wordsToKnow;
    }

    public Mechanics(){
        /*
        Initializes dataset with information relating to physics - mechanics. Not complete but enough to show functionality.
         */
        notes = new ArrayList<String>();
        wordsToKnow = new ArrayList<Vocabulary>();
        questionList = new ArrayList<Question>();
        questionList.add(new Question("An arrow is shot straight up in the air at an initial speed of 15.0 m/s. After " +
                "how much time is the arrow moving downward at a speed of 8.00m/s? " +
                "Assume gravity is 9.8 m/s^2 and remember sig. figs","0.714 s", "1.24 s", "2.35 s", "3.22 s", "c"));
        wordsToKnow.add(new Vocabulary("Scalar quantities", "quantities that have only a numerical value and no associated direction"));
        wordsToKnow.add(new Vocabulary("Vector quantities", "have both magnitude and direction and obey the laws of vector addition"));
        notes.add("When two or more vectors are added together, they must have the same units and they all must be the same type of quantity");
        wordsToKnow.add(new Vocabulary("displacement vector", "for a particle is the difference between its final position between its final position vector and its initial position vector"));
        wordsToKnow.add(new Vocabulary("average velocity", "of a particle during the time interval dt is defined to as the displacement of the particle divided by the time interval"));
        notes.add("A particle in uniform circular motion undergoes a radial acceleration a, because the direction of v changes over time");
        questionList.add(new Question("A cannon shell is fired straight up from the ground at an initial speed of 225m/s. After how much\n"
                        + "time will the shell at a height of 6.20 X 10^2 m above the ground and moving downward?", "2.96 s", "25.4 s", "33.6 s", "43.0 s", "d"));
        questionList.add(new Question("What is the magnitude of the vector (10i-10k)m/s?", "0", "10 m/s", "-10 m/s", "14.1 m/s", "d"));
        wordsToKnow.add(new Vocabulary("inertial frame", "An inertial frame is a frame in which an object that does not interact with other objects experiences zero acceleration"));
        wordsToKnow.add(new Vocabulary("force", "force as that which causes a change in motion of an object"));
        notes.add("Newton's first law states that it is possible to find an inertial frame in which an object that does not interact with other objects experiences zero acceleration");
        notes.add("Newton's second law states that the acceleration of an object of an object is directly proportional to the net force acting on it and inversely proportional to the net force and\n" +
                " acting on it and inversely proportional to its mass");
        questionList.add(new Question("The driver of a speeding empty truck slams on the brakes and skids to a stop through a distance d.\n" +
                "On a second trial, the truck carries a load that doubles its mass. What will now be the truck's 'skidding distance'?", "4d", "2d", "d", "d/2", "c"));
    }
}
