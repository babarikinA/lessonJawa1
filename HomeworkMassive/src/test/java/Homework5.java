public class Homework5 {
    public static void main(String[] args) {
        long a = Math.round(Math.random() * 150 + 5);//не получается перевести в раунд
        if (a >= 25) {
            if (a <= 100) {
                System.out.println("Число содержиться в интервале");
            } else {
                System.out.println("число не содержиться в интервале");
            }
        } else {
            System.out.println("число не содержиться в интервале");
        }//решил за 30 минут иду пушить
        System.out.println(a);
    }

}
