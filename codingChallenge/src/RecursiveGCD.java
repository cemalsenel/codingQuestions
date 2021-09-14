public class RecursiveGCD {
    public static void main(String[] args) {
        System.out.println(gcd(18, 30));
    }

    public static int gcd(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b, a%b); // Euclidean Algorithm => 48, 18 => 48/18 = 2 remainder 12, 18/12 = 1 remainder 6, 12/6 = 2 remainder 0
                               // Euclidean Algorithm => gcd(a, 0) = a, gcd(a, b) = gcd(b, a mod b)
    }

}
