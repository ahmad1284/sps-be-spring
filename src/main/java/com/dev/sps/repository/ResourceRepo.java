package com.dev.sps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.dev.sps.models.Resource;

public interface ResourceRepo extends 
PagingAndSortingRepository<Resource, Integer>,
CrudRepository<Resource, Integer>{
    
}
