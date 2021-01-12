package com.schwab.eam.service;

import com.schwab.eam.entity.ReachedContact;

import java.util.List;
import java.util.Optional;

public interface ReachedContactService {
    public ReachedContact addReachedContact(ReachedContact contact);
    public List<ReachedContact> getAllReachedContacts();
    public Optional<ReachedContact> getById(Long id);
}
