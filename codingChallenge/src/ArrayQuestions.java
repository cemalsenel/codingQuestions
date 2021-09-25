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
//        System.out.println(Arrays.toString(result));

        //3.Question: Finding a number in an Array
        int[] array = {1, 2, 3, 4, 5, 6};
//        linearSearch(array, 8);

        //4.Question:Max product of two integers
        int[] product = {10, 20, 30, 40, 50};
        String pairs = maxProduct(product);
//        System.out.println(pairs);

        //5.Question: check array unique or not
        int[] check = {1, 2, 3, 4, 4};
//        System.out.println("Is array unique : " + isUnique(check));

        //6.Question : Permutation
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 2, 3, 6};
        System.out.println("Are arrays permutation : " + permutation(array1, array2));
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

    public static void linearSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                System.out.println("Value is found at the index of "+ i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }

    public static String maxProduct(int[] product){
        int maxProduct = 0;
        String pairs = "";

        for(int i = 0 ; i < product.length; i++){
            for(int j = i+1 ; j < product.length; j++){
                if(product[i] * product[j] > maxProduct){
                    maxProduct = product[i]*product[j];
                    pairs = Integer.toString(product[i]) + "," + Integer.toString(product[j]);
                }
            }
        }
        return pairs;
    }

    public static boolean isUnique(int[] check) {
        for (int i = 0; i < check.length; i++){
            for (int j = i+1; j < check.length; j++){
                if(check[i] == check[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean permutation(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        int sum1= 0;
        int sum2= 0;
        int mul1= 1;
        int mul2= 1;

        for(int i = 0; i<array1.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array1[i];
        }
        if(sum1 == sum2 && mul1 == mul2){
            return true;
        }

        return false;

    }
}
