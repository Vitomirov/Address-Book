import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

class AddressBookManager {
    ArrayList<PersonInfo> personList = new ArrayList<>();

    public AddressBookManager() {
        this.loadFromFile();
    }

    void addPerson() {
        String name = JOptionPane.showInputDialog("Enter name:");
        String address = JOptionPane.showInputDialog("Enter address");
        String phoneNo = JOptionPane.showInputDialog("Enter phone number:");
        String emailAddress = JOptionPane.showInputDialog("Enter email address:");
        PersonInfo personInfo = new PersonInfo(name, address, phoneNo, emailAddress);
        this.personList.add(personInfo);
    }

    void searchPerson(String personName) {
        for (PersonInfo person : this.personList) {
            if (personName.equals(person.name)) {
                person.display();
            }
        }
    }

    void deletePerson(String personName) {
        personList.removeIf(person -> personName.equals(person.name));
    }

    void saveToFile() {
        try {
            FileWriter fileWriter = new FileWriter("persons.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (PersonInfo person : this.personList) {
                String line = person.name + "," + person.address + "," +
                              person.phoneNumber + "," + person.emailAddress;
                printWriter.println(line);
            }

            printWriter.flush();
            printWriter.close();
            fileWriter.close();
        } catch (IOException IoExc) {
            System.out.println(IoExc);
        }
    }

    void loadFromFile() {
        try {
            FileReader fileReader = new FileReader("persons.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                String[] tokens = line.split(",");
                String name = tokens[0];
                String address = tokens[1];
                String phoneNumber = tokens[2];
                String emailAddress = tokens[3];
                PersonInfo info = new PersonInfo(name, address, phoneNumber, emailAddress);
                this.personList.add(info);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException IoExc) {
            System.out.println(IoExc);
        }
    }
}
