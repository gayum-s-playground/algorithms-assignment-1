public class Algo_3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

        int[] copyOfNums = new int[nums.length];

        for (int i = 0; i < copyOfNums.length; i++) {
            for (int j = nums.length-1; j >= 0; j--) {
                
                copyOfNums[copyOfNums.length-(i+1)]=nums[i];

            }
        }

        nums = copyOfNums;

        System.out.print("\nnums array : {");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ,");
        }
        
        System.out.print("\b}\n");

    }
    
}
