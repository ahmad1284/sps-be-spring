package com.dev.sps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.dev.sps.models.Status;


public interface StatusRepo extends 
PagingAndSortingRepository<Status, Integer>,
CrudRepository<Status, Integer> {
    
}
