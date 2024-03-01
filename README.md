Address Book

This Java project represents a simple address book application. It allows the user to input, search, and delete person information including name, address, phone number, and email address.
How to Use

    Adding a Person:
        Select option 1 to add a new person.
        Enter the name, address, phone number, and email address when prompted.

    Searching for a Person:
        Select option 2 to search for a person.
        Enter the name of the person you want to find.
        The application will display information about the found person, if they exist.

    Deleting a Person:
        Select option 3 to delete a person.
        Enter the name of the person you want to delete.
        The person will be removed from the address book.

    Exiting the Application:
        Select option 4 to exit the application.
        All entered information will be saved to the persons.txt file.

Classes
1. PersonInfo

    Stores information about a person such as name, address, phone number, and email address.
    The display() method shows the person's information in a dialog box.

2. AddressBookManager

    Manages persons in the address book.
    Methods:
        addPerson(): Adds a new person to the address book.
        searchPerson(String personName): Searches for a person by name and displays information if found.
        deletePerson(String personName): Deletes a person from the address book.
        saveToFile(): Saves person information to the persons.txt file.
        loadFromFile(): Loads person information from the persons.txt file when the application starts.

3. Test

    Main class of the application.
    Allows user interaction with the address book through a graphical user interface.
    Users are presented with a menu to add, search, delete, and exit the application.

Running the Application

To run the application:

    Compile all files using the javac command.
    Run the Test class.


Notes

    All entered person information will be saved to the persons.txt file.
    If the persons.txt file does not exist when the application starts, it will be automatically created.
    In case of errors or incorrect input, the application will notify the user.
