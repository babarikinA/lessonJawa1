public class MassiveCopy {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        int[] array2 = array1;
        array2[0] = 10;
        System.out.println(array1[0]);


        int x = 7;
        int y = x;
        y = 0;

        System.out.println(x);
    }


}
