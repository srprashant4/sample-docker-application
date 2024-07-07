package com.sample.sample_docker_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.sample_docker_application.entity.SampleEntity;

public interface SampleRepository extends JpaRepository<SampleEntity, Long>{
    
}

