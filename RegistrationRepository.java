package com.userRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userRegistration.Entity.Registration;


public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
