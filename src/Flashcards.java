import java.util.Scanner;

public class Flashcards {
    private static int accuracyReport(String sample1, String sample2){
        String[] split1 = sample1.split(" ");
        String[] split2 = sample2.split(" ");
        int same = 0;
        int length = 0;
        if (split1.length> split2.length){
            length = split2.length;
        }else{
            length = split1.length;
        }
        for(int i=0; i<length; i++){
            if (split1[i].equals(split2[i])){
                same++;
            }
        }
        return same;
    }
    public static void main(String[] args){
        /*File config = new File(".config");
        try {

        }catch (IOException e){
            System.out.println("oops closing");
            return;();
        }*/
        Scanner input = new Scanner(System.in);
        String report;
        int numberCorrect = 0;
        Datalist lesson = new Mechanics();
        while (numberCorrect<1024) {
            for (String notes : lesson.getNotes()) {
                System.out.println(notes);
                report = input.nextLine();
                numberCorrect += accuracyReport(notes, report);
                //System.out.printf("Words correct equals %d\n", numberCorrect);
            }
            for (Vocabulary vocab : lesson.getWordsToKnow()) {
                System.out.println(vocab.getWord() + " - " + vocab.getDefinition());
                report = input.nextLine();
                numberCorrect += accuracyReport(vocab.getWord() + " - " + vocab.getDefinition(), report);
                //System.out.printf("Words correct equals %d\n", numberCorrect);
            }
        }
    }
}
