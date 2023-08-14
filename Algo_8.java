public class Algo_8 {
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        /*------------------------PART01---------------------------- */

        System.out.print("\nnumA \u2229 numB : ");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                                
                if(numA[i]==numB[j]){
                    System.out.print(numA[i] + " ,");
                    continue;
                }
            }
        }
        System.out.print("\b\b  \n");

        /*------------------------PART02---------------------------- */

        int[] absArray = new int[numA.length + numB.length];
        int index = 0;

        for (int i = 0; i < numA.length; i++) {
            boolean flag = false;
            for (int j = 0; j < index; j++) {
                if(absArray[i]==numA[i]){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                absArray[index++]=numA[i];
            }
            
        }

        for (int i = 0; i < numB.length; i++) {
            boolean flag = false;
            for (int j = 0; j < index; j++) {
                if(absArray[i]==numB[i]){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                absArray[index++]=numB[i];
            }
            
        }

        for (int i = 0; i < index; i++) {
            System.out.print(absArray[i] + " ,");
        }
       
        //        error here

    }
    
}
