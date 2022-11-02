package pragra;

public class servant {
    public static void main(String[] args) {
    int result = ServentSum(3,5);
        System.out.println(result);
        System.out.println("bye");
        int resul = ServentSub(3,5);
        System.out.println(resul);
        System.out.println("bye");
        int resu = ServentMul(3,5);
        System.out.println(resu);
        System.out.println("bye");
        int res = ServentDiv(3,5);
        System.out.println(res);
        System.out.println("bye");


}
    public static int ServentSum(int a, int b){
        return a+b;}
        public static int ServentSub(int a, int b){
            return a-b;}
            public static int ServentMul(int a, int b){
                return a*b;}
                public static int ServentDiv(int a, int b){
                    return a/b;




    }
}
