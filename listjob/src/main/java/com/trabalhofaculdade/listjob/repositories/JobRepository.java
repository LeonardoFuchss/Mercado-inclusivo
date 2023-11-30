package com.trabalhofaculdade.listjob.repositories;

import com.trabalhofaculdade.listjob.entities.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository <Jobs, Long> {

}
