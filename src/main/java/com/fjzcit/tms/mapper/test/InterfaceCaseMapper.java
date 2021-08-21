package com.fjzcit.tms.mapper.test;

import com.fjzcit.tms.model.test.InterfaceCase;
import com.fjzcit.tms.req.InterfaceCaseReq;

import java.util.List;

public interface InterfaceCaseMapper {

    List<InterfaceCase> find(InterfaceCaseReq interfaceCaseReq);
    
    void save(InterfaceCase interfaceCase);

    void insert(InterfaceCase interfaceCase);
}
