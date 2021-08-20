import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JPanel implements ActionListener {
    JLabel loginLbl;
    JTextField userNameField;
    JPasswordField passwordField;
    JButton loginBtn;

    LoginWindow(){
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        loginBtn = new JButton("Login");
        loginLbl = new JLabel("Login");

        userNameField.setText("user name");
        userNameField.setBounds(150, 100,200,25);

        passwordField.setBounds(150, 150,200,25);

        loginBtn.setBounds(150, 200,200,25);
        loginBtn.addActionListener(this);

        loginLbl.setBounds(100, 0,300,70);
        loginLbl.setForeground(Color.WHITE);
        loginLbl.setFont(new Font("MV Boli", Font.BOLD, 40));
        loginLbl.setHorizontalAlignment(JLabel.CENTER);

        this.add(loginLbl);
        this.add(userNameField);
        this.add(passwordField);
        this.add(loginBtn);

        this.setLayout(null);
        this.setBounds(0,0,500,500);
        this.setBackground(Color.pink);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn){
            System.out.println(passwordField.getPassword());
        }
    }
}
