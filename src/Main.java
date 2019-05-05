public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayL mt = new ArrayL();
        System.out.println(mt.myArray1[0]);
        int[] lst = mt.myArray1;

        for(int i=0; i < lst.length; i++){
            System.out.println(lst[i]);
        }

    }
}
