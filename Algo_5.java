import java.util.Scanner;
public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        
        do{
            System.out.print("\nEnter a text (ASCII only) : ");
            String text = scanner.nextLine().strip();

            if(text.length()==0)continue;

            char[] textChar = text.toCharArray();

            for (int i = 0; i < textChar.length/2; i++) {

                char duplicateChar = textChar[i];
                textChar[i] = textChar[textChar.length-(i+1)];
                textChar[textChar.length-(i+1)] = duplicateChar;

            }

            System.out.print("\nReversed text : ");
            for (int i = 0; i < textChar.length; i++) {
                System.out.print(textChar[i]);
            }
            System.out.println();

        }while(true);

    }
    
}
