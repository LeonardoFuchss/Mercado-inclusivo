package com.trabalhofaculdade.listjob.dtos;

import com.trabalhofaculdade.listjob.entities.Jobs;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

public class JobsDto {
    private Long id;
    private String name;
    private String descriptionJob;

    private BigDecimal salary;
    private String typeOfCandidate;

    public JobsDto (Jobs entity){
       id = entity.getId(); //Dizendo que todos atributos da classe dto é igual a classe da entidade
       name = entity.getName();
       descriptionJob = entity.getDescriptionJob();
       salary = entity.getSalary();
       typeOfCandidate = entity.getTypeOfCandidate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionJob() {
        return descriptionJob;
    }

    public void setDescriptionJob(String descriptionJob) {
        this.descriptionJob = descriptionJob;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getTypeOfCandidate() {
        return typeOfCandidate;
    }

    public void setTypeOfCandidate(String typeOfCandidate) {
        this.typeOfCandidate = typeOfCandidate;
    }
}
