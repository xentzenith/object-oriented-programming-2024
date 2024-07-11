import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddressBookApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    deleteExistingContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    displayAllContacts();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    exportContacts();
                    break;
                case 7:
                    importContacts();
                    break;
                case 0:
                    System.out.println("Quitting program.");
                    break;
                default:
                    System.out.println("This is not a valid option. Please try again.");
            }
        } while (option != 0);
    }

    private static void printMenu() {
        System.out.println("<--- Address Book App --->");
        System.out.println("1. Add new contact");
        System.out.println("2. Delete an existing contact");
        System.out.println("3. Update contact information");
        System.out.println("4. Display all contacts");
        System.out.println("5. Search contact by name");
        System.out.println("6. Export contacts to CSV");
        System.out.println("7. Import contacts from CSV");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addNewContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();
        
        Contact contact = new Contact(name, phone, email);
        addressBook.addContact(contact);
        System.out.println("Contact added!");
    }

    private static void deleteExistingContact() {
        System.out.print("Enter name of the contact to delete: ");
        String name = scanner.nextLine();
        
        addressBook.deleteContact(name);
    }

    private static void updateContact() {
        System.out.print("Enter name of the contact to update: ");
        String name = scanner.nextLine();
        
        Contact contact = addressBook.getContact(name);
        if (contact == null) {
            System.out.println("Contact not found!");
            return;
        }
        
        System.out.print("Enter new phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter new email address: ");
        String email = scanner.nextLine();
        
        contact.setPhoneNumber(phone);
        contact.setEmail(email);
        System.out.println("Contact updated!");
    }

    private static void displayAllContacts() {
        addressBook.displayContacts();
    }

    private static void searchContact() {
        System.out.print("Enter name of the contact to search: ");
        String name = scanner.nextLine();
        
        Contact contact = addressBook.getContact(name);
        if (contact == null) {
            System.out.println("Contact not found!");
        } else {
            System.out.println(contact);
        }
    }

    private static void exportContacts() {
        System.out.print("Enter file name to export to (e.g., contacts.csv): ");
        String fileName = scanner.nextLine();
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Contact contact : addressBook.getAllContacts()) {
                writer.println(contact.getName() + "," + contact.getPhoneNumber() + "," + contact.getEmail());
            }
            System.out.println("Contacts exported!");
        } catch (IOException e) {
            System.err.println("Error exporting contacts: " + e.getMessage());
        }
    }

    private static void importContacts() {
        System.out.print("Enter file name to import from (e.g., contacts.csv): ");
        String fileName = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Contact contact = new Contact(parts[0], parts[1], parts[2]);
                    addressBook.addContact(contact);
                }
            }
            System.out.println("Contacts imported!");
        } catch (IOException e) {
            System.err.println("Error importing contacts: " + e.getMessage());
        }
    }
}