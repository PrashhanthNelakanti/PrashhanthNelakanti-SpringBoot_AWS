package com.schwab.eam.service;

import com.schwab.eam.entity.ReachedContact;
import com.schwab.eam.repo.ReachedContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReachedContactServiceImpl implements ReachedContactService {

    @Autowired
    ReachedContactRepo reachedContactRepo;

    @Override
    public ReachedContact addReachedContact(ReachedContact contact) {
        return reachedContactRepo.save(contact);
    }

    @Override
    public List<ReachedContact> getAllReachedContacts() {
        return reachedContactRepo.findAll();
    }

    @Override
    public Optional<ReachedContact> getById(Long id) {
        return reachedContactRepo.findById(id);
    }
}
