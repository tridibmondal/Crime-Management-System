package com.crime.branch.crimesystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.crime.branch.crimesystem.model.UserInfo;

public interface UserRepository extends JpaRepository <UserInfo,Integer>{
	@Query("select u from user_table u where u.user_id=:userid")
	public UserInfo getUserbyUserid(@Param("userid")String userid );
	

}
