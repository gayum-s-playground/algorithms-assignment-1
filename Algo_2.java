public class Algo_2 {
    public static void main(String[] args) {

        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        int maximumNum = 0;
        int minimumNum = nums[1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i<j)continue;
                if(nums[i]<nums[j]){
                    maximumNum = nums[j];
                }
            }
        }

        System.out.println("Maximum Number is : " + maximumNum);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i<j)continue;
                if(minimumNum>nums[j]){
                    minimumNum = nums[j];
                }
            }
        }

        System.out.println("Minimum Number is : " + minimumNum);
        
    }
    
}
