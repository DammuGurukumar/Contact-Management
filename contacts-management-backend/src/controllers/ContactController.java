package controllers;

import models.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactController {
    private static List<Contact> contacts = new ArrayList<>();

    public static List<Contact> getAllContacts() {
        return contacts;
    }

    public static Contact getContactById(int id) {
        return contacts.stream()
                .filter(contact -> contact.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static boolean addContact(Contact contact) {
        return contacts.add(contact);
    }

    public static boolean updateContact(int id, Contact updatedContact) {
        Contact contact = getContactById(id);
        if (contact != null) {
            contact.setFirstName(updatedContact.getFirstName());
            contact.setLastName(updatedContact.getLastName());
            contact.setEmail(updatedContact.getEmail());
            contact.setPhone(updatedContact.getPhone());
            return true;
        }
        return false;
    }

    public static boolean deleteContact(int id) {
        return contacts.removeIf(contact -> contact.getId() == id);
    }
}
