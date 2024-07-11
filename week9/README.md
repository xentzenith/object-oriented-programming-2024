# Simple Address Book Application

## Description
This is a simple address book application written in Java that allows users to store and manage their contacts. The application provides functionalities to add a new contact, delete an existing contact, update contact information, display all contacts, search for a contact by name, and export/import contacts to/from a CSV file.

## How to Compile and Run

1. **Compilation**
   Open a terminal or command prompt and navigate to the directory where the `.java` files are located. Compile the files using the `javac` command:
   ```
   javac Contact.java AddressBook.java AddressBookApp.java
   ```

2. **Running the Application**
   After compilation, run the main application:
   ```
   java AddressBookApp
   ```

## Features
- **Add Contact**: Add a new contact by providing the name, phone number, and email address.
- **Delete Contact**: Delete an existing contact by providing the contact's name.
- **Update Contact**: Update the phone number and email address of an existing contact by providing the contact's name.
- **Display Contacts**: Display all contacts with their details (name, phone number, email address).
- **Search Contact**: Search for a contact by providing the name.
- **Export Contacts**: Export all contacts to a CSV file.
- **Import Contacts**: Import contacts from a CSV file.

## Notes
- The application uses console input/output for user interactions.
- Clear instructions are provided to guide users on how to use the application.
- Proper error handling is implemented to handle invalid inputs and edge cases.