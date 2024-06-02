//Task-6_1

public class LogAndPass {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        test("123456789012345678", "yes1", "yes1");
    }

    public static boolean test(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20){
            throw new WrongLoginException("Длина логина больше допустимой!");
        } else {
            for (int i = 0; i < login.length(); i++){
                if (String.valueOf(login.charAt(i)).equals(" "))
                    throw new WrongLoginException("В логине содержатся недопустимые символы!");
            }
        }
        if (password.length() >= 20){
            throw new WrongPasswordException("Длина пароля больше допустимой!");
        } else {
            for (int i = 0; i < password.length(); i++){
                if (String.valueOf(password.charAt(i)).equals(" ") || !password.matches(".*\\d.*")){
                    throw new WrongPasswordException("Пароль не соответствует требованиям!");
                } else if (!password.equals(confirmPassword)) throw new WrongPasswordException("Пароли не свопадают!");
            }
        }
        return true;
    }
}