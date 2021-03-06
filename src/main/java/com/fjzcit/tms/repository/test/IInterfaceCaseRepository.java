package com.fjzcit.tms.repository.test;

import com.fjzcit.tms.model.test.InterfaceCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IInterfaceCaseRepository extends JpaRepository<InterfaceCase, Integer> {

    @Query("select t from InterfaceCase t where t.iterationId = :iterationId " +
            " AND t.state = 1 ")
    List<InterfaceCase> findByIterationIdId(@Param("iterationId") Integer iterationId);

    List<InterfaceCase> findByIterationIdAndState(Integer iterationId, Integer state);

}
