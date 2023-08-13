import java.util.Scanner;
public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {

        do{
            System.out.print("\nEnter your mobile number : ");
            String phoneNumber = scanner.nextLine().strip();

            if(phoneNumber.length()==0){
                System.out.print("Telephone number can't be empty.");
                continue;
            }

            char[] array = phoneNumber.toCharArray();

            if( phoneNumber.length()==12 && phoneNumber.startsWith("+94")){
                boolean check = true;

                for (int i = 3; i < 12; i++) {
                    check = Character.isDigit(array[i]);
                }

                if(check==true){
                    System.out.println("Number is validated.");
                }else{
                    System.out.println("Invalid phone number.");
                }
            }else if( phoneNumber.length()==10 && phoneNumber.startsWith("0")){
                boolean check = true;

                for (int i = 3; i < 10; i++) {
                    check = Character.isDigit(array[i]);
                }

                if(check==true){
                    System.out.println("Number is validated.");
                }else{
                    System.out.println("Invalid phone number.");
                }
            }else{
                System.out.println("Invalid phone number.");
            }
            

        }while(true);
        
    }
    
}
