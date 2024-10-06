//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Roses ros = new Roses("Amsterdam", 10, 10);
        System.out.println(ros);
        Tulips tul = new Tulips("Belgium", 7, 8);
        System.out.println(Flowers.total);
        SunFlower sun = new SunFlower("Belarus", 4, 20);
        System.out.println(sun);

        int[] data = new int[3];
        data[0] = 10;
        data[1] = 7;
        data[2] = 4;

        int result = data[0] + data[1] + data[2];
        System.out.println(result);
        System.out.println(data[2]);


        Flowers[] data1 = new Flowers[3];
        data1[0] = ros;
        data1[1] = tul;
        data1[2] = sun;
        System.out.println(Flowers.total);
    }

}