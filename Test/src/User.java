public class User {
    private String login;
    private  String password;

    User(String log,String pass){
        login = log;
        password = pass;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword(){
        return password;
    }
    public  void setPassword(String pass){
        password=pass;
    }
}
