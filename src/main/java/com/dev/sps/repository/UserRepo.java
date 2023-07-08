package com.dev.sps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.sps.models.User;
public interface UserRepo extends 
PagingAndSortingRepository<User, Integer>,
CrudRepository<User, Integer>{
    
}
