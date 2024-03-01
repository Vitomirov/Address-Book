import javax.swing.*;

class PersonInfo {
    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    PersonInfo(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    void display() {
        JOptionPane.showMessageDialog(null, "Name: " + this.name +
                "\nAddress: " + this.address +
                "\nPhone number: " + this.phoneNumber +
                "\nemail address: " + this.emailAddress);
    }
}