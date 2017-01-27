package com.apress.prospring3.ch18.web.view;

import com.apress.prospring3.ch18.domain.Contact;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ershov-V-V on 25.11.2016.
 */
public class ContactListBean implements Serializable {
    private List<Contact> contacts;
    private Contact selectedContact;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Contact getSelectedContact() {
        return selectedContact;
    }

    public void setSelectedContact(Contact selectedContact) {
        this.selectedContact = selectedContact;
    }
}
