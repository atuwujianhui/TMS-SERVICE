package com.fjzcit.tms.repository.test;

import com.fjzcit.tms.model.test.TestCaseRefData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITestCaseRefDataRepository extends JpaRepository<TestCaseRefData, Integer> {
}
