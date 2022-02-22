package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.*;

/**
 * @author Nguyen Nam Pham
 * @version 1.5
 * @since 2022
 * main AddressBookApplication: the purpose is to invoke some methods of the Menu class
 */
public class AddressBookApplication {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        try {
            addressBook.readFromFile("AddressInputDataFile.txt");
            addressBook.list();
        }

        catch (FileNotFoundException missing) {
            System.out.println("Cannot find file " + missing.getMessage());
        }

        catch (IOException except) {
            System.out.println("File I/O error occurred: " + except.getMessage());
        }

        // initAddressBookExercise(addressBook);

        /*
        // Create an instance of Menu
        Menu myMenu = new Menu();

        // Display all the Menu prompts to standard output
        System.out.println(myMenu.prompt_FirstName());
        System.out.println(myMenu.prompt_LastName());
        System.out.println(myMenu.prompt_Street());
        System.out.println(myMenu.prompt_City());
        System.out.println(myMenu.prompt_State());
        System.out.println(myMenu.prompt_Zip());
        System.out.println(myMenu.prompt_Telephone());
        System.out.println(myMenu.prompt_Email());
        */
    }

    /**
     * initAddressBookExercise adds AddressEntry objects to the AddressBook ab
     * @param ab is the instance of the AddressBook class
     */
    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry firstEntry = new AddressEntry("Christine", "Wheelock", "8160 Garden Avenue", "Southfield", "MI", "48034", "248-208-4777", "christine.wheelock89@yahoo.com");
        AddressEntry secondEntry = new AddressEntry("Herbert", "Garnett", "62 Grant Drive", "Vernon Hills", "IL", "60061", "708-350-1142", "herbert.garnett77@gmail.com");

        ab.add(firstEntry);
        ab.add(secondEntry);

        ab.list();
    }
}
