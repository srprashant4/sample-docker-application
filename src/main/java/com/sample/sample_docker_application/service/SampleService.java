package com.sample.sample_docker_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.sample_docker_application.entity.SampleEntity;
import com.sample.sample_docker_application.repository.SampleRepository;

@Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public SampleEntity addSample(String name) {
        SampleEntity entity = new SampleEntity();
        entity.setName(name);
        return sampleRepository.save(entity);
    }
}
