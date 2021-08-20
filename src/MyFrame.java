import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    public final int SCREEN_WIDTH = 700;
    public final int SCREEN_HEIGHT  = 500;

    JLayeredPane layeredPane;
    JPanel contentPane;
    JButton loginPageBtn;
    JButton registerBtn;

    MyFrame(){
        layeredPane = new JLayeredPane();
        contentPane = new JPanel();
        loginPageBtn = new JButton("login");
        registerBtn = new JButton("Sign up");

        loginPageBtn.setBounds(0,0,200, 25);
        loginPageBtn.addActionListener(this);

        registerBtn.setBounds(0,25,200, 25);
        registerBtn.addActionListener(this);

        layeredPane.setBounds(200,0,500,500);

        contentPane.add(registerBtn);
        contentPane.add(loginPageBtn);
        contentPane.add(layeredPane);
        contentPane.setLayout(null);

        this.setTitle("Java Login Application");
        this.setContentPane(contentPane);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginPageBtn){
            layeredPane.removeAll();
            layeredPane.add(new LoginWindow());
            layeredPane.repaint();
            layeredPane.revalidate();
            System.out.println("you're in the login page");
        }
        if (e.getSource() == registerBtn){
            layeredPane.removeAll();
            layeredPane.add(new RegisterWindow());
            layeredPane.repaint();
            layeredPane.revalidate();
            System.out.println("you're in the register page");
        }
    }
}
