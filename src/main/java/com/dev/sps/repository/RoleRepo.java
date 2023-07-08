package com.dev.sps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.sps.models.Role;


public interface RoleRepo extends 
PagingAndSortingRepository<Role, Integer>,
CrudRepository<Role, Integer>{
    
}
