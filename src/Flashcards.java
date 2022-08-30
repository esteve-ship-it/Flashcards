import java.util.Scanner;

public class Flashcards {
    private static int accuracyReport(String sample1, String sample2) {
        String[] split1 = sample1.split(" ");
        String[] split2 = sample2.split(" ");
        int same = 0;
        int length = 0;
        if (split1.length > split2.length) {
            length = split2.length;
        } else {
            length = split1.length;
        }
        for (int i = 0; i < length; i++) {
            if (split1[i].equals(split2[i])) {
                same++;
            }
        }
        return same;
    }

    private static void lines(Datalist lesson, Scanner input) {
        String report;
        int numberCorrect = 0;
        for (String notes : lesson.getNotes()) {
            System.out.println(notes);
            report = input.nextLine();
            numberCorrect += accuracyReport(notes, report);
            //System.out.printf("Words correct equals %d\n", numberCorrect);
        }
        System.out.println("Number of words typed correctly is " + numberCorrect + "\n");
    }

    private static void mcq(Datalist lesson, Scanner input){
        int numberCorrect = 0;
        for (Question question : lesson.questionList){
            System.out.println(question.getQuestion());
            System.out.println("a) " + question.getA());
            System.out.println("b) " + question.getB());
            System.out.println("c) " + question.getC());
            System.out.println("d) " + question.getD());
            //compares using the first character
            if(input.nextLine().toLowerCase().charAt(0)==question.getAnswer().charAt(0)){
                numberCorrect++;
                System.out.println("\nCorrect\n");
            }else{
                System.out.println("\nTry harder\n");
            }
        }
        System.out.println("Number of questions answered correctly is " + numberCorrect);
    }

    private static void definitions(Datalist lesson, Scanner input){
        String report;
        int numberCorrect = 0;
        for (Vocabulary vocab : lesson.getWordsToKnow()) {
            System.out.println(vocab.getWord() + " - " + vocab.getDefinition());
            report = input.nextLine();
            numberCorrect += accuracyReport(vocab.getWord() + " - " + vocab.getDefinition(), report);
            //System.out.printf("Words correct equals %d\n", numberCorrect);
        }
        System.out.println("Number of words typed correctly is " + numberCorrect + "\n");
    }
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(System.in);
            boolean notDone = true;
            Datalist lesson = new Mechanics();
            int mode;
            do {
                System.out.println("Please select a mode to continue\n"
                        + "1) Lines\n"
                        + "2) Multiple Choice questions\n"
                        + "3) Definitions\n"
                        + "4) Get me out of here\n"
                        + "5) Help me");
                mode = input.nextInt();
                input.nextLine();
                switch (mode) {
                    case 1:
                        lines(lesson, input);
                        break;
                    case 2:
                        mcq(lesson, input);
                        break;
                    case 3:
                        definitions(lesson, input);
                        break;
                    case 4:
                        notDone = false;
                        break;
                    case 5:
                        System.out.println("\nLines you copy the printed string until you get to the end of the list");
                        System.out.println("You can select timed or untimed multiple choice questions");
                        System.out.println("Definitions similar to the lines but with just vocabulary");
                        System.out.println("Get me out here simply exits the program properly");
                        System.out.println("Prints the previous message\n");
                        break;
                    default:
                        System.out.println("Input does not match an option!\n");
                }

            } while (notDone);
        }catch (Exception e){
            System.out.println("Something unexpected happened?");
        }
    }
}
