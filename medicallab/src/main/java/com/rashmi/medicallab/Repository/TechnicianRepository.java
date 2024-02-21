package com.rashmi.medicallab.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rashmi.medicallab.Entity.Technician;

@Repository
public interface TechnicianRepository extends MongoRepository<Technician,String> {
    Technician findByUsername(String username);

    
} 