import java.util.Arrays;

public class RecursiveReview {

    public static void main(String[] args) {
//        System.out.println(power(2,4));
//        System.out.println(factorial(4));

//        int arr [] = {1, 2, 3, 4};
//        System.out.println(productofArray(arr, arr.length));
//        System.out.println(recursiveRange(6));
//        System.out.println(fib(4));
//        System.out.println(reverse("java"));
//        System.out.println(isPalindrome("tacocat"));
        System.out.println(first("jaVa"));
        System.out.println(capitalizeWord("i love java"));
    }

    public static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * power(base, exponent-1) ;
    }

    public static int factorial(int num){
        if(num <= 1 ){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static int productofArray(int A[], int N){
        if (N <= 0)
            return 1;
        return (productofArray(A, N - 1) * A[N - 1]);
    }

    public static int recursiveRange(int num){
        if( num == 0){
            return 0;
        }
        return (num + recursiveRange(num - 1));
    }

    public static int fib(int n){
        if (n<0) {
            return -1;
        }
        if ( n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n -2);
    }

    public  static String reverse(String str)
    {
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);  // kemal => emal k e m a l
    }

    public static  boolean isPalindrome(String str)
    { // if length is 0 or 1 then String is palindrome
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;

    }

    public static boolean someRecursive(int[] arr, OddFunction odd) {
        if (arr.length == 0 ) {
            return false;
        } else if (odd.run(arr[0]) == false) {
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }

    public static char first(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first(str.substring(1, str.length()));
        }
    }

    public static String capitalizeWord(String str) {

        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0,str.length()-1))+ Character.toString(chr);
    }
}
class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0) {
            return false; }
        else {
            return true;
        }
    }
}