package pragra;

public class Main {
    public static void main(String[] args) {
        int result = Sum(3,5);
        System.out.println(result);

        int resul = Sub(3,5);
        System.out.println(resul);

        int resu = Mul(3,5);
        System.out.println(resu);

        float res = Div(504,3);
        System.out.println(res);
        
        double modulus = mod(19, 5);
        System.out.println(modulus);



    }
    public static int Sum(int a, int b){
        return a+b;}
    public static int Sub(int a, int b){
        return a-b;}
    public static int Mul(int a, int b){
        return a*b;}
    public static float Div(int a, int b){
        return a/b;
    public static double mod(int a, int b){
        return a%b;

    }
}
