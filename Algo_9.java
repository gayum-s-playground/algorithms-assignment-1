import java.util.Scanner;
public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        loop:
        do{
            System.out.print("\nInput single word : ");
            String txt = scanner.nextLine().strip();

            if(txt.length()==0)continue;
            char[] charArray = txt.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                if(charArray[i]==' '){
                    System.out.println("This is not a single word..");
                    continue loop;
                }
            }

            

        }while(true);
    }
    
}
