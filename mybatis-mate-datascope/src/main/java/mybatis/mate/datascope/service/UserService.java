package mybatis.mate.datascope.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatis.mate.datascope.entity.User;
import mybatis.mate.datascope.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void dataScope() {
        Page page = new Page<User>(1, 20);
        userMapper.selectTestList(page, 1L, "Jack").forEach(System.out::println);
    }
}
