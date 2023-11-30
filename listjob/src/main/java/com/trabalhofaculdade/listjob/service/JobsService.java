package com.trabalhofaculdade.listjob.service;

import com.trabalhofaculdade.listjob.dtos.JobsDto;
import com.trabalhofaculdade.listjob.entities.Jobs;
import com.trabalhofaculdade.listjob.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class JobsService {
    @Autowired
    private JobRepository jobRepository;
public List<JobsDto> buscarTodos(){ //
    List<Jobs> result = jobRepository.findAll(); //Buscando todos os dados com findAll do jobRepository
    return result.stream().map(JobsDto::new).toList(); //Passando os dados do resultado para retornar um DTO.
}

}
