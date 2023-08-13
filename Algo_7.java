import java.util.Scanner;
public class Algo_7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do{
            System.out.print("\nEnter a sentence : ");
            String txt = scanner.nextLine().strip();
            int longestWordCount = 0;
            String longestWord ="";
            

            if(txt.length()==0) continue;

            String[] words = txt.split(" ");

            for (int i = 0; i < words.length; i++) {
                if(words[i].length()>longestWord.length()){

                    longestWord = words [i];
                    longestWordCount = words [i].length();

                }
            }

            System.out.println("Longest word of the sentence : "+longestWord );
            System.out.println("Length of Longest word : " + longestWordCount);

            int shortestWordCount = 0;
            String shorestWord = words[0];

            for (int i = 0; i < words.length; i++) {
                if(shorestWord.length()>words[i].length()){
                    shorestWord = words[i];
                    shortestWordCount = words[i].length();
                }
            }

            System.out.println("Shortest word of the sentence : "+ shorestWord );
            System.out.println("Length of Shortest word : " + shortestWordCount);

        }while(true);
        
    }
    
}
