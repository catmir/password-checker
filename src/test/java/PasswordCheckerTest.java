import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PasswordCheckerTest {
    @Test
    @DisplayName("Checks if password is not empty")
    void checksPasswordEmptiness(){
        Assertions.assertTrue(PasswordChecker.isPasswordEmpty("abc"));
        Assertions.assertFalse(PasswordChecker.isPasswordEmpty(""));
    }

    @Test
    @DisplayName("Checks if password has 8 characters minimum")
    void checksPasswordLength(){
        Assertions.assertTrue(PasswordChecker.hasMinimumLength("12345678"));
        Assertions.assertFalse(PasswordChecker.hasMinimumLength("1234567"));
    }

    @Test
    @DisplayName("Checks if password has at least one letter and one digit")
    void checksLetterAndDigitExistence(){
        Assertions.assertTrue(PasswordChecker.hasLetterAndDigit("a234567b"));
        Assertions.assertFalse(PasswordChecker.hasLetterAndDigit("12345678"));
    }

}