import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JPanel implements ActionListener {
    JTextField userNameField;
    JPasswordField passwordField;
    JButton loginBtn;

    LoginWindow(){
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        loginBtn = new JButton("Login");

        userNameField.setText("user name");
        userNameField.setBounds(150, 100,200,25);

        passwordField.setBounds(150, 150,200,25);

        loginBtn.setBounds(150, 200,200,25);
        loginBtn.addActionListener(this);

        this.add(userNameField);
        this.add(passwordField);
        this.add(loginBtn);

        this.setLayout(null);
        this.setBounds(0,0,500,500);
        this.setBackground(Color.pink);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn){
            System.out.println(passwordField.getPassword());
        }
    }
}
