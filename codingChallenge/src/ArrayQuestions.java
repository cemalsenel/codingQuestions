import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        //1.Question:Find the missing number in the array
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20};
//        missingNumber(intArray);

        //2.Question: Pairs/Two Sum
        int[] nums = {12, 17, 8, 1};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));


    }

    public static void missingNumber(int[] intArray){
        int sum1 = 0;
        int sum2 = 20*(20+1)/2;;
        for(int i : intArray){
            sum1 +=i;
        }
        int difference = sum2 - sum1;
        System.out.println("Missing number is : " + difference);
    }

    public static int[] twoSum(int[] nums, int target){

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found!");

    }
}
