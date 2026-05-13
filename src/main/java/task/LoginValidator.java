package task;

public class LoginValidator {

    public boolean isValidStudentId(String studentId) {

        if (studentId == null || studentId.isEmpty()) {
            return false;
        }

        return studentId.matches("\\d{9}");
    }

    public boolean isValidPassword(String password) {

        if (password == null || password.isEmpty()) {
            return false;
        }

        return password.length() >= 20;
    }

    public boolean canLogin(String studentId, String password) {

        return isValidStudentId(studentId)
                && isValidPassword(password);
    }
}
