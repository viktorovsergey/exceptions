
public class Main {

    public static void main(String[] args) {
        try {
            accountInput("Login1ваааааа", "password", "password");
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("блок finnaly выполнен");
        }

    }
    private static void  accountInput (String login, String password, String confirmPassword){
        if (!login.matches("[a-zA-Z0-9_]+"))
            throw new WrongLoginException();
        if (login.length()>=20){
            throw new WrongLoginException();
        }
        if (password.length()>20||!password.equals(confirmPassword)){
            throw new WrongPasswordException();
        }
    }
}
