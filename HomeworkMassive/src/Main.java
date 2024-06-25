//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int [] data = {1,2,3,4,5,6,7,8,9,10};
int result = data.length;
for (int index = 0;index < 8; index++)
        System.out.println(Math.random());
        System.out.println(data[2]);
        data[2] = 0;
        data[4] = 0;
        data[6] = 0;
        data[8] = 0;
        System.out.println(result);
    }
}