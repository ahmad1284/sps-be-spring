package com.dev.sps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.sps.models.Project;

public interface ProjectRepo extends 
PagingAndSortingRepository<Project, Integer>,
CrudRepository<Project, Integer>
{
    
}
