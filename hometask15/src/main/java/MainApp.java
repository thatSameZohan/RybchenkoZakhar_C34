import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        List<User> userList=List.of(
                new User("login1"),
                new User("login2"),
                new User("login3"));

        Map<String, User> userMap=new HashMap<>();

        for (User user: userList){
            userMap.put(user.getLogin(),user);
        }

        System.out.println(userMap);


        String[] words ={"home", "work", "school"};

        Map<String, Integer> wordMap=new HashMap<>();

        for (String word:words ){
            wordMap.put(word,word.length());
        }

        System.out.println(wordMap);
    }
}
