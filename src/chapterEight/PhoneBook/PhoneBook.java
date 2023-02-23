package chapterEight.PhoneBook;

import javax.swing.*;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.InputMismatchException;

public class PhoneBook {

    private final ArrayList<Contact> contacts = new ArrayList<>();


    public void createContact(String firstName, String lastName, String phoneNumber, String mobileNumber, String emailAddress) {
        String name = firstName + " " + lastName;
        if (contacts.size() > 0) {
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    throw new DuplicateFormatFlagsException("THIS NAME ALREADY EXIST");
                }
            }
        }
        Contact contact = new Contact(name, phoneNumber, mobileNumber, emailAddress);
        contacts.add(contact);
    }

    public int getTotalNumberOfContacts() {
        return contacts.size();
    }

    public Contact viewContactWith(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        throw new IllegalArgumentException("Contact does not exist");
    }


    public void editContact(String name, String editName, String editPhoneNumber, String editMobileNumber, String editedEmail) {
        Contact contact = viewContactWith(name);
        if (contact.getName().equalsIgnoreCase(name)) {
            for (Contact newContact : contacts) {
                if (!newContact.getName().equalsIgnoreCase(editName)) {

                    contact.setName(editName);
                    contact.setMobileNumber(editMobileNumber);
                    contact.setEmail(editedEmail);
                    contact.setPhoneNumber(editPhoneNumber);
                }
                else throw new IllegalArgumentException("Contact already exist");
            }
        }
        else throw new IllegalArgumentException("Wrong Contact Name");
    }



        public void deleteContact (String name){
            validateId(name);
            contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        }

        public void validateId (String name){
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    return;
                } else throw new InputMismatchException("The name does not exist");
            }
        }

        private static void display (String prompt){
            JOptionPane.showMessageDialog(null, prompt);
        }


    }



