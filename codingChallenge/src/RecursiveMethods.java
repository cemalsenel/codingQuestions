public class RecursiveMethods {
    public static void main(String[] args) {

//        recur(4);
//        System.out.println(fact(-4));
        System.out.println(fibo(6));
    }

    public static void recur(int doll){
        if (doll == 1){
            System.out.println("Doll is one");
        }else{
            System.out.println(doll);
            doll -= 1;
            recur(doll);

        }
    }

    public static int fact(int num){
        if(num < 1){
            return -1;
        }
        if ( num == 0 || num == 1){
            return 1;
        }
        return num * fact(num-1);

    }

    public static int fibo(int num){
        if(num < 0){
            return -1;
        }
        if(num == 0 || num == 1){
            return num;
        }
        return fibo(num-1) + fibo (num-2);
    }
}
