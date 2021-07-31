package com.fjzcit.tms.service.system;

import com.fjzcit.tms.mapper.system.UserMapper;
import com.fjzcit.tms.model.system.User;
import com.fjzcit.tms.repository.system.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserRepository userRepository;

    @Resource
    UserMapper userMapper;

    public Object findAll() {
        return this.userMapper.findAll();
    }

    public Object findById(Long id) {
        return this.userMapper.findById(id);
    }

    /**
     * 通过JPA新增
     * @param user
     * @return
     */
    public Object save(User user) {
        return this.userRepository.save(user);
    }

    /**
     * 通过MyBatis新增
     * @param user
     * @return
     */
    public Object saveByMyBatis(User user) {
        return this.userMapper.addUser(user);
    }

    public void deleteById(int id) {
        this.userRepository.deleteById(id);
    }
}
