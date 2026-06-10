class User {

    String name;
    String password;

    User(String name, String password) {

        this.name = name;
        this.password = password;
    }

    boolean login(String pass) {

        return this.password.equals(pass);
    }
}