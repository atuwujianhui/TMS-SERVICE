package com.fjzcit.tms.repository.test;

import com.fjzcit.tms.model.test.Iteration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIterationRepository extends JpaRepository<Iteration, Integer> {
}
