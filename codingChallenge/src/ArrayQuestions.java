public class ArrayQuestions {
    public static void main(String[] args) {
        //1.Question:Find the missing number in the array
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20};
        missingNumber(intArray);



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
}
