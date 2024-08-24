package autorisation;

public class Test {

    public static void main(String[] args)throws RuntimeException {
        try {
            throw new WrongLoginException();
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин");
        }finally {
            System.out.println("Хорошего дня");
        }
        throw new WrongPasswordException("Вы ввели не праильный пароль");

}
    }



