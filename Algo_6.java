import java.util.Scanner;
public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            System.out.print("\nEnter a sentence (Using ASCII) : ");
            String text = scanner.nextLine().strip();

            if(text.length()==0) continue;

            char[] textToChar = text.toCharArray();

            for (int i = 0; i < textToChar.length/2; i++) {

                char duplicateChar = textToChar[i];
                textToChar[i] = textToChar[textToChar.length-(i+1)];
                textToChar[textToChar.length-(i+1)] = duplicateChar;
            }

            System.out.print("\nReversed  sentence  : ");
            for (int i = 0; i < textToChar.length; i++) {
                System.out.print(textToChar[i] + " ");
            }

        }while(true);
    }
    
}
