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

            char[] copyArray = new char[charArray.length];    
            
            for (int i = 0; i < charArray.length; i++) {
                copyArray[i] = charArray[charArray.length-(i+1)];
            }

            boolean flag = true;

            for (int i = 0; i < copyArray.length; i++) {
                if(charArray[i]!=copyArray[i]) flag = false;
            }

            if(flag==false){
                System.out.println("This is not apalindrome");
            }else{
                System.out.println("This is palindrome");
            }

        }while(true);
    }
    
}
