package com.dev.sps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.dev.sps.models.Feedback;


public interface FeedbackRepo extends 
PagingAndSortingRepository<Feedback, Integer>,
CrudRepository<Feedback, Integer> {
    
}
