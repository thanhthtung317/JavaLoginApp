import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppController {
    private final LoginWindow loginView;
    private final RegisterWindow registerView;
    private final AppModel appModel;

    public AppController(AppModel appModel ,LoginWindow loginView, RegisterWindow registerView) {
        this.loginView = loginView;
        this.registerView = registerView;
        this.appModel = appModel;
        System.out.println("Controller is active");

        this.loginView.addLoginListener(new LoginListener());
        this.registerView.addSummitListener(new SummitListener());
    }

    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            appModel.login(loginView.getUserName(), loginView.getPassword());
            System.out.println("login action");
        }
    }

    class SummitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userName = registerView.getUserName();
            String password = registerView.getPassword();
            String firstName = registerView.getFirstName();
            String lastName = registerView.getLastName();
            String gender = registerView.getGender();
            String email = registerView.getEmail();
            int phoneNumber = registerView.getPhoneNumber();
            String address = registerView.getAddress();

            appModel.register(userName, password,firstName,lastName,gender,email,phoneNumber,address);
            System.out.println("register action");

            //increase the user id every time new user added so every user have a unique id
            AppModel.userId++;
        }
    }
}
