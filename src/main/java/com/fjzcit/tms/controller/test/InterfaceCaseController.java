package com.fjzcit.tms.controller.test;

import com.fjzcit.tms.service.test.InterfaceCaseService;
import com.fjzcit.tms.service.test.InterfaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@RequestMapping(value = "/interfaceCase")
@RestController
@Api(value = "Swagger2接口测试")
public class InterfaceCaseController {

    @Resource
    InterfaceService interfaceSvc;
    @Resource
    InterfaceCaseService interfaceCaseSvc;

    // 查询所有的接口测试用例
    @PostMapping(value = "/findAll")
    @ApiOperation(value = "列出所有接口测试用例！", httpMethod = "POST")
    public Object findAll() {
        return this.interfaceCaseSvc.findAll();
    }

    @RequestMapping(value = "/execute/{iterationId}", method = RequestMethod.GET)
    @ApiOperation(value = "执行接口测试用例！", httpMethod = "GET")
    public Object executeCase(@PathVariable("iterationId") String iterationId) {
        this.interfaceSvc.executeCase(Integer.valueOf(iterationId));
        return iterationId;
    }

}
