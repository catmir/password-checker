/* Password Checker: checks, if password
* 1) is not empty
* 2) has at least 8 characters
* 3) has at least 1 letter and 1 digit */
public class PasswordChecker {
    String password;

    static boolean isPasswordEmpty (String password){
        if (password.isEmpty()) {
            return false;
        } return true;
    }

    static boolean hasMinimumLength(String password){
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    static boolean hasLetterAndDigit(String password){
        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++){
            if (Character.isLetter(password.toCharArray()[i])){
                hasLetter = true;
            }
        }

        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.toCharArray()[i])){
                hasDigit = true;
            }
        }

        if (hasLetter && hasDigit){
            return true;
        } else return false;
    }
}
