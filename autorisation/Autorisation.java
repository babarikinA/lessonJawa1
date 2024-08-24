package autorisation;

public class Autorisation {

 LoginPassword passwordCorrect = LoginPassword.QWERTY;
 LoginPassword loginCorrect = LoginPassword.ALEXANDR;
 LoginPassword passwordIncorrect = LoginPassword.ABC;
 LoginPassword loginIncorrect = LoginPassword.MIKHAIL;

    public Autorisation(LoginPassword passwordCorrect, LoginPassword loginCorrect, LoginPassword passwordIncorrect, LoginPassword loginIncorrect) {
        this.passwordCorrect = passwordCorrect;
        this.loginCorrect = loginCorrect;
        this.passwordIncorrect = passwordIncorrect;
        this.loginIncorrect = loginIncorrect;
    }

    public static boolean a (LoginPassword loginCorrect, LoginPassword loginIncorrect) {
        if (loginCorrect == loginIncorrect) {
            return true;
        } else {
            return false;
        }
    }
}
