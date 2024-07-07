package com.sample.sample_docker_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sample_docker_application.entity.SampleEntity;
import com.sample.sample_docker_application.service.SampleService;

@RestController
@RequestMapping("/samples")
public class SampleController {

    @Autowired
    private SampleService sampleService;
    
    @PostMapping
    public SampleEntity addSample(@RequestParam String name) {
        return sampleService.addSample(name);
    }
}
