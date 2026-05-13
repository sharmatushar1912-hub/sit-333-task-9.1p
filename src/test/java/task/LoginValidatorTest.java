package task;

import org.junit.Assert;
import org.junit.Test;

public class LoginValidatorTest {

    @Test
    public void testValidStudentId() {

        LoginValidator validator =
                new LoginValidator();

        Assert.assertTrue(
                validator.isValidStudentId("225188544")
        );
    }

    @Test
    public void testInvalidStudentIdTooShort() {

        LoginValidator validator =
                new LoginValidator();

        Assert.assertFalse(
                validator.isValidStudentId("12345")
        );
    }

    @Test
    public void testInvalidStudentIdWithLetters() {

        LoginValidator validator =
                new LoginValidator();

        Assert.assertFalse(
                validator.isValidStudentId("225ABC544")
        );
    }

    @Test
    public void testValidPassword() {

        LoginValidator validator =
                new LoginValidator();

        Assert.assertTrue(
                validator.isValidPassword("password123")
        );
    }

    @Test
    public void testInvalidPasswordTooShort() {

        LoginValidator validator =
                new LoginValidator();

        Assert.assertFalse(
                validator.isValidPassword("abc")
        );
    }

    @Test
    public void testSuccessfulLogin() {

        LoginValidator validator =
                new LoginValidator();

        Assert.assertTrue(
                validator.canLogin(
                        "225188544",
                        "password123"
                )
        );
    }
}