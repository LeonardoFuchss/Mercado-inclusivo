package com.trabalhofaculdade.listjob.controller;

import com.trabalhofaculdade.listjob.dtos.JobsDto;
import com.trabalhofaculdade.listjob.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jobs")
public class JobController {
    @Autowired
    private JobsService jobsService;

    @GetMapping
    public List<JobsDto> findAll() {
        List<JobsDto> result = jobsService.buscarTodos();
        return result;
    }
}
