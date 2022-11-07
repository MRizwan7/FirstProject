package pragra;
public class Test {
    public static void main(String[] args) {
greater();
    }
    public static void greater(){
        int[] marks= {3,5,8,2,67};
        int AssumedGreater=marks[0];
        for(int i=0;i<marks.length;i
                ++){
                if(AssumedGreater<marks[i])
                {
                    AssumedGreater=marks[i];


            }

        }
        System.out.println(AssumedGreater);
    }
}