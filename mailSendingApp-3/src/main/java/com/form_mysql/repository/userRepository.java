package com.form_mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form_mysql.entity.UserDtls;

public interface userRepository extends JpaRepository<UserDtls, Integer>{

}
