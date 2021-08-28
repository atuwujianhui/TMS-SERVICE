package com.fjzcit.tms.service.test;

import com.fjzcit.tms.mapper.test.InterfaceCaseMapper;
import com.fjzcit.tms.model.test.InterfaceCase;
import com.fjzcit.tms.model.test.InterfaceCaseExample;
import com.fjzcit.tms.repository.test.IInterfaceCaseRepository;
import com.fjzcit.tms.req.InterfaceCaseReq;
import com.fjzcit.tms.resp.PageResp;
import com.fjzcit.tms.util.SnowFlake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class InterfaceCaseService {

    private static final Logger LOG = LoggerFactory.getLogger(InterfaceCase.class);

    @Resource
    IInterfaceCaseRepository interfaceCaseRepository;

    @Resource
    InterfaceCaseMapper interfaceCaseMapper;

    @Resource
    SnowFlake snowFlake;

    /**
     * 查询接口测试用例（带分页）
     * @param interfaceCaseReq
     * @return
     */
    public PageResp<InterfaceCase> find(InterfaceCaseReq interfaceCaseReq) {
        // 取得分页信息
        InterfaceCaseReq icReq = Optional.ofNullable(interfaceCaseReq).orElse(new InterfaceCaseReq());
        Integer current = icReq.getCurrent();
        Integer pageSize = icReq.getPageSize();

        // 只对第一个SQL起作用，所以需要尽量放在最终查询的上方，另外，兼顾不分页的情况
        if (!StringUtils.isEmpty(current) && !StringUtils.isEmpty(pageSize)) {
            PageHelper.startPage(current, pageSize);
        }
        // 查询接口测试用例
        InterfaceCaseExample interfaceCaseExample = new InterfaceCaseExample();
        InterfaceCaseExample.Criteria criteria = interfaceCaseExample.createCriteria();
        if (!ObjectUtils.isEmpty(interfaceCaseReq.getName())) {
            // criteria.andNameEqualTo(interfaceCaseReq.getName());
            criteria.andNameLike("%" + interfaceCaseReq.getName() + "%");
        }
        List<InterfaceCase> list = interfaceCaseMapper.selectByExample(interfaceCaseExample);

        PageInfo<InterfaceCase> pageInfo = new PageInfo<>(list);
        LOG.info("总行数：{}", pageInfo.getTotal());

        // 返回分页对象
        PageResp<InterfaceCase> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;
    }

    /**
     * 新增或保存
     * @param interfaceCase
     */
    public void save(InterfaceCase interfaceCase) {
        // ID值存在为保存，不存在则新增
        if(ObjectUtils.isEmpty(interfaceCase.getId())) {
            interfaceCase.setId(snowFlake.nextId());
            this.interfaceCaseMapper.insert(interfaceCase);
        } else {
            this.interfaceCaseMapper.updateByPrimaryKeySelective(interfaceCase);
        }
    }

    /**
     * 删除接口测试用例
     */
    public void delete(Long id) {
        this.interfaceCaseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询所有用例
     *
     * @return
     */
    public List<InterfaceCase> findAll() {
        return this.interfaceCaseRepository.findAll();
    }

    /**
     * 根据ID查询用例
     *
     * @param id
     * @return
     */
    public Optional<InterfaceCase> findById(Integer id) {
        return this.interfaceCaseRepository.findById(id);
    }

    /**
     * 根据systemID，查询所有可执行的用例
     * @param iterationId
     * @return
     */
    public List<InterfaceCase> findByIterationId(Integer iterationId) {
//        return this.interfaceCaseRepository.findByIterationIdId(iterationId);
        return this.interfaceCaseRepository.findByIterationIdAndState(iterationId, 1);
    }

    public static void main(String[] args) {
        // int i = 0;
        // Integer j = null;
        // System.out.println(StringUtils.isEmpty(i));
        // System.out.println(StringUtils.isEmpty(j));
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        Integer c = -128;
        Integer d = -128;
        System.out.println(c == d);
    }
}