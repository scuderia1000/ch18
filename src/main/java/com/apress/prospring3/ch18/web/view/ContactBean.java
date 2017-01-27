package com.apress.prospring3.ch18.web.view;

import com.apress.prospring3.ch18.domain.Contact;
import org.primefaces.model.DualListModel;

import java.io.Serializable;

/**
 * Created by Ershov-V-V on 28.11.2016.
 */
public class ContactBean implements Serializable {
    private Contact contact;
    private DualListModel hobbies;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public DualListModel getHobbies() {
        return hobbies;
    }

    public void setHobbies(DualListModel hobbies) {
        this.hobbies = hobbies;
    }
}
