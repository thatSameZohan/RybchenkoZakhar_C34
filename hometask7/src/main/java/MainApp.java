import org.tms.project.domain.User;
import org.tms.project.impl.*;
import org.tms.project.interfaces.UserDataService;
import org.tms.project.interfaces.UserRegistrationHandler;
import org.tms.project.interfaces.UserValidationService;

public class MainApp {
    public static void main(String[] args) {

        User user = new User("Zhigalo", "12345", 19);
        System.out.println("user " + user.getLogin() + " age: " + user.getAge());
        UserRegistrationHandler handler =
                new UserRegistrationHandlerImpl(
                        new UserValidationServiceImpl(),
                        new UserDataServiceImpl(),
                        new SmsNotificationService()
                );

        handler.registerUser(user);
    }
}

