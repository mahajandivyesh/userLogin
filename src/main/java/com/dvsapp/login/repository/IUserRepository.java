package com.dvsapp.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.dvsapp.login.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Integer>{


	@Query("SELECT user FROM UserEntity user WHERE user.email = :email AND user.password = :password")
	UserEntity findByEmailAndPassword(@Param("email")  String email, @Param("password") String password);

}
