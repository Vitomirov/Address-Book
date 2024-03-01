import javax.swing.JOptionPane;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        AddressBookManager addressBookManager = new AddressBookManager();

        while (true) {
            String input = JOptionPane.showInputDialog("""
                            Enter 1 to Add
                            Enter 2 for Search
                            Enter 3 for Delete
                            enter 4 to Exit
                            """);

            try {
                int ch = Integer.parseInt(input);
                switch (ch) {
                    case 1:
                        addressBookManager.addPerson();
                        break;
                    case 2:
                        String searchPerson = JOptionPane.showInputDialog("Enter name for a search: ");
                        addressBookManager.searchPerson(searchPerson);
                        break;
                    case 3:
                        String deletePerson = JOptionPane.showInputDialog("Enter name for delete: ");
                        addressBookManager.deletePerson(deletePerson);
                        break;
                    case 4:
                        addressBookManager.saveToFile();
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Invalid option. Please enter a valid option (1-4).");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a number (1-4).");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "An error occurred: " + e.getMessage());
            }
        }
    }
}
