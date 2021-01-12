package com.schwab.eam.repo;

import com.schwab.eam.entity.ApiRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRegistrationRepo extends JpaRepository<ApiRegistration,Long> {
}
