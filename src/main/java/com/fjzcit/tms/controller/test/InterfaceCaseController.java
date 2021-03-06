package com.fjzcit.tms.controller.test;

import com.fjzcit.tms.model.test.InterfaceCase;
import com.fjzcit.tms.req.InterfaceCaseReq;
import com.fjzcit.tms.resp.CommonResp;
import com.fjzcit.tms.resp.PageResp;
import com.fjzcit.tms.service.test.InterfaceCaseService;
import com.fjzcit.tms.service.test.InterfaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Map;

@RequestMapping(value = "/interfaceCase")
@RestController
@Api(value = "Swagger2接口测试")
public class InterfaceCaseController {

    @Resource
    InterfaceService interfaceSvc;
    @Resource
    InterfaceCaseService interfaceCaseSvc;

    /**
     * 查询所有的接口测试用例
     * @return
     */
    @PostMapping(value = "/findAll")
    @ApiOperation(value = "列出所有接口测试用例！", httpMethod = "POST")
    public Object findAll() {
        return this.interfaceCaseSvc.findAll();
    }

    /**
     * 查询接口测试用例
     * @param interfaceCaseReq
     * @return
     */
    @PostMapping(value = "/find")
    @ApiOperation(value = "列出所有接口测试用例！", httpMethod = "POST")
    public Object find(@RequestBody @Valid InterfaceCaseReq interfaceCaseReq) {
        CommonResp<PageResp<InterfaceCase>> resp = new CommonResp<>();
        PageResp<InterfaceCase> list = this.interfaceCaseSvc.find(interfaceCaseReq);
        resp.setContent(list);
        return resp;
    }

    /**
     * 保存接口测试用例
     * @param interfaceCase
     * @return
     */
    @PostMapping(value = "/save")
    public Object save(@RequestBody @Valid InterfaceCase interfaceCase) {
        CommonResp resp = new CommonResp<>();
        this.interfaceCaseSvc.save(interfaceCase);
        return resp;
    }

    /**
     * 删除接口测试用例
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete/{id}")
    public Object delete(@PathVariable("id") Long id) {
        CommonResp resp = new CommonResp<>();
        this.interfaceCaseSvc.delete(id);
        return resp;
    }

    @RequestMapping(value = "/execute/{iterationId}", method = RequestMethod.GET)
    @ApiOperation(value = "执行接口测试用例！", httpMethod = "GET")
    public Object executeCase(@PathVariable("iterationId") String iterationId) {
        this.interfaceSvc.executeCase(Integer.valueOf(iterationId));
        return iterationId;
    }

}
