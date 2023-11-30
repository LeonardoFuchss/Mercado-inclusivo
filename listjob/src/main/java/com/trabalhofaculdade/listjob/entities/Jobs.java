package com.trabalhofaculdade.listjob.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_job")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
@Column(columnDefinition = "TEXT")
    private String descriptionJob;

    private BigDecimal salary;
    private String typeOfCandidate;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jobs jobs = (Jobs) o;
        return Objects.equals(id, jobs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
