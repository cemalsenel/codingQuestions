public class RecursiveSumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(522));
    }

    public static int sumOfDigits(int num){
        if (num == 0 || num < 0){
            return 0;
        }
        return num%10 + sumOfDigits(num/10);
    }
}
