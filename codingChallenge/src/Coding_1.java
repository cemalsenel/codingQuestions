public class Coding_1 {
    public static void main(String[] args) {

        recur(4);
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
}
