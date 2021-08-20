import javax.swing.*;
import java.awt.*;

public class RegisterWindow extends JPanel {
    JLabel welcomeLbl;
    JTextField userNameField;
    JTextField passwordField;
    JTextField emailField;
    JTextField firstNameField;
    JTextField lastNameField;
    JComboBox genderBox;
    JTextField phoneNumberField;
    JTextField addressField;
    String[] genderList = {"Male", "Female", "Other"};

    RegisterWindow(){
        welcomeLbl = new JLabel("SIGN UP");
        firstNameField = new JTextField("First name");
        lastNameField = new JTextField("Last name");
        emailField = new JTextField("Email");
        userNameField = new JTextField("User name");
        passwordField = new JTextField("Password");
        genderBox = new JComboBox(genderList);
        phoneNumberField = new JTextField("Phone number");
        addressField = new JTextField("address");

        welcomeLbl.setBounds(100, 0,300,70);
        welcomeLbl.setForeground(Color.WHITE);
        welcomeLbl.setFont(new Font("MV Boli", Font.BOLD, 40));
        welcomeLbl.setHorizontalAlignment(JLabel.CENTER);

        firstNameField.setBounds(150, 55,200,25);

        lastNameField.setBounds(150, 100,200,25);

        emailField.setBounds(150, 150,200,25);

        userNameField.setBounds(150, 200,200,25);

        passwordField.setBounds(150, 250,200,25);

        phoneNumberField.setBounds(150, 300,200,25);

        genderBox.setBounds(150, 350,200,25);
        genderBox.setSelectedItem("Other");

        addressField.setBounds(150, 400,200,25);

        this.add(welcomeLbl);
        this.add(firstNameField);
        this.add(lastNameField);
        this.add(emailField);
        this.add(userNameField);
        this.add(passwordField);
        this.add(phoneNumberField);
        this.add(genderBox);
        this.add(addressField);

        this.setLayout(null);
        this.setBackground(new Color(0x123456));
        this.setBounds(0,0,500,500);
    }
}
