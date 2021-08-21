public class Main {
    public static void main(String[] args) {
        new AppController(new AppModel(), new LoginWindow(), new RegisterWindow());
        new MyFrame();
    }
}
