import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterWindow extends JPanel implements ActionListener {
    JLabel welcomeLbl;
    JTextField userNameField;
    JTextField passwordField;
    JTextField emailField;
    JTextField firstNameField;
    JTextField lastNameField;
    JComboBox genderBox;
    JTextField phoneNumberField;
    JTextField addressField;
    String gender;
    String[] genderList = {"Male", "Female", "Other"};
    JButton summitBtn;

    RegisterWindow(){
        welcomeLbl = new JLabel("SIGN UP");
        firstNameField = new JTextField("First name");
        lastNameField = new JTextField("Last name");
        emailField = new JTextField("Email");
        userNameField = new JTextField("User name");
        passwordField = new JTextField("Password ");
        genderBox = new JComboBox(genderList);
        phoneNumberField = new JTextField("Phone number (< 10 number)");
        addressField = new JTextField("address");
        summitBtn = new JButton("Summit");

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
        genderBox.addActionListener(this);

        addressField.setBounds(150, 400,200,25);

        summitBtn.setBounds(210, 433,80,25);

        this.add(welcomeLbl);
        this.add(firstNameField);
        this.add(lastNameField);
        this.add(emailField);
        this.add(userNameField);
        this.add(passwordField);
        this.add(phoneNumberField);
        this.add(genderBox);
        this.add(addressField);
        this.add(summitBtn);

        this.setLayout(null);
        this.setBackground(new Color(0x123456));
        this.setBounds(0,0,500,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == genderBox){
            gender = (String) genderBox.getSelectedItem();
        }
    }

    public void addSummitListener(ActionListener actionListener){
        summitBtn.addActionListener(actionListener);
        System.out.println("listening to summit button");
    }

    public String getUserName() {
        return userNameField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getFirstName() {
        return firstNameField.getText();
    }

    public String getLastName() {
        return lastNameField.getText();
    }

    public int getPhoneNumber() {
        return Integer.parseInt(phoneNumberField.getText());
    }

    public String getAddress() {
        return addressField.getText();
    }

    public String getGender() {
        return gender;
    }
}
