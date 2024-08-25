package autorisation;

public class Lesson {

    public static boolean method(String login, String password, String confirmPassword) {
        if (login.length() <= 20) {
            return true;
        } else {
            try {
                throw new WrongLoginException();
            }catch (WrongLoginException e){
                System.out.println("Неверный логин.");
            }finally {
                System.out.println("Попробуйте ввести логин снова!");
            }
        }
        if (password.length() <= 20) {
            if (password == confirmPassword) {
                return true;
            } else {

                    try {

                        throw new WrongPasswordException();

                    }catch (WrongPasswordException e) {
                        System.out.println("Неверный пароль.");

                    }finally {
                        System.out.println("Попробуйте ввести пароль снова!");
                    }
                }
            }
        return false;
    }
    }


