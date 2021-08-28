package com.fjzcit.tms.req;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class InterfaceCaseReq extends PageReq{
    // 用例名称
    private String name;
}
