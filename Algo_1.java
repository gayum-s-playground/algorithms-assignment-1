import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            System.out.print("Input a Positive Integer number: ");
            int inputNum = scanner.nextInt();
            scanner.nextLine();
            String dispay = "Fibonacci sequence upto ";
            int x = 0;
            int y = 1;
            int z = 0;
            boolean flag = true;

            if(!(inputNum>0)){
                System.out.println("This number is not positive number...");
                continue;
            }

            System.out.print(dispay + inputNum + " : " );
            System.out.print(x + " ,");
            System.out.print(y + " ,");

            do{
                                
                z = x + y ;
                
                if(z>inputNum){
                    flag = false;
                    System.out.println("\b\b  \n");
                }else{
                    System.out.print(z + " ,");
                    x = y;
                    y = z;
                }

            }while(flag);


        }while(true);

    }
    
}