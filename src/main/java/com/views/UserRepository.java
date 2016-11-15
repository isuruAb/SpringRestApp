package com.views;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.models.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Long>{
 
	List<User> findAllUserById(long id);
}
