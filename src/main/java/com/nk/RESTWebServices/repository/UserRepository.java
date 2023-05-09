package com.nk.RESTWebServices.repository;

import com.nk.RESTWebServices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
