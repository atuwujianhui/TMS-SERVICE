package com.fjzcit.tms.service.test;

import com.fjzcit.tms.model.test.TestData;
import com.fjzcit.tms.repository.test.ITestDataRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestDataService {
    @Resource
    ITestDataRepository dataRepository;

    /**
     * 根据用例查找对应数据
     * @param caseId
     * @return
     */
    public List<TestData> findByCaseId(Long caseId) {
        return this.dataRepository.findByCaseId(caseId);
    }
}
