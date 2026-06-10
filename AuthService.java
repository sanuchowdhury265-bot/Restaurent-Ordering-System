class AuthService {

    boolean login(String username, String password) {

        System.out.println("Checking login...");

        return username.equals("admin") &&
               password.equals("1234");
    }
}
