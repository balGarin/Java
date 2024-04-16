import java.util.HashMap;

public class DataBaseUsers {
    private HashMap<String, User> map = new HashMap<>();



    public void add(User user) {
        if(map.containsKey(user.getLogin())){
            System.out.println("This user in already registered");
        }
        map.put(user.getLogin(),user);
    }

    public User getUser(String log){
        return map.get(log);
    }

    public boolean isContains(String log){
        return map.containsKey(log);
    }
}
