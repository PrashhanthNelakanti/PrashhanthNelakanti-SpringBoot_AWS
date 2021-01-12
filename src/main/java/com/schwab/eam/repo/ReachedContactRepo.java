package com.schwab.eam.repo;

import com.schwab.eam.entity.ReachedContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReachedContactRepo extends JpaRepository<ReachedContact,Long> {

}
