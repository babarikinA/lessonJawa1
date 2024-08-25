package autorisation;

public class Lesson {

    public static boolean method(String login, String password, String confirmPassword) {
        if (login.length() <= 20) {
            System.out.println("Логин введен верно.");
            System.out.println("Введите пароль.");

            if (password.length() <= 20) {
                if (password.equals(confirmPassword)) {
                    System.out.println("Пароль введен верно.");
                    System.out.println("Добро пожаловать!");
                    return true;
                } else {

                    try {

                        throw new WrongPasswordException();

                    } catch (WrongPasswordException e) {
                        System.out.println("Неверный пароль.");

                    } finally {
                        System.out.println("Попробуйте ввести пароль снова!");
                    }
                    return false;
                }
            } else {
                System.out.println("Пароль должен содержать меньше символов.");
            }

        } else {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Неверный логин.");
            } finally {
                System.out.println("Попробуйте ввести логин снова!");
            }
        }

        return false;

    }
}


