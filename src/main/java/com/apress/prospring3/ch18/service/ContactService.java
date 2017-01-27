package com.apress.prospring3.ch18.service;

import com.apress.prospring3.ch18.domain.Contact;

import java.util.List;

/**
 * Created by Ershov-V-V on 25.11.2016.
 */
public interface ContactService {
     List<Contact> findAll();

    Contact findById(Long id);

    Contact findByIdWithDetail(Long id);

    Contact save(Contact contact);
}
