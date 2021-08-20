import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    public final int SCREEN_WIDTH = 700;
    public final int SCREEN_HEIGHT  = 500;

    JLayeredPane layeredPane;
    JPanel contentPane;
    JButton loginPageBtn;
    LoginWindow loginWindow;

    MyFrame(){
        layeredPane = new JLayeredPane();
        contentPane = new JPanel();
        loginPageBtn = new JButton("login");
        loginWindow = new LoginWindow();

        loginPageBtn.setBounds(0,0,150, 25);
        loginPageBtn.addActionListener(this);

        layeredPane.setBounds(200,0,500,500);

        contentPane.add(loginPageBtn);
        contentPane.add(layeredPane);
        contentPane.setLayout(null);

        this.setTitle("Java Login Application");
        this.setContentPane(contentPane);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginPageBtn){
            layeredPane.removeAll();
            loginWindow.setLocation(0,0);
            layeredPane.add(loginWindow);
            layeredPane.repaint();
            layeredPane.revalidate();
            System.out.println("you're in the login page");
        }
    }
}
