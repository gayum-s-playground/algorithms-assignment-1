import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            System.out.print("Input a Positive Integer number: ");
            int inputNum = scanner.nextInt();
            scanner.nextLine();

            if(!(inputNum>0)){
                System.out.println("This number is not positive number...");
                continue;
            }

            

        }while(true);

    }
    
}