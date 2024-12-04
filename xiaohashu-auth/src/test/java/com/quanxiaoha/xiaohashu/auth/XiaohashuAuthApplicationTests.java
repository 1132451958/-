package com.quanxiaoha.xiaohashu.auth;

import com.quanxiaoha.framework.common.util.JsonUtils;
import com.quanxiaoha.xiaohashu.auth.domain.dataobject.UserDO;
import com.quanxiaoha.xiaohashu.auth.domain.mapper.UserDOMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
@Slf4j
@SpringBootTest
class XiaohashuAuthApplicationTests {
    @Resource
    private UserDOMapper userDOMapper;
    @Test
    void testInsert() {
        UserDO userDO = UserDO.builder()
                .username("犬小哈")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        userDOMapper.insert(userDO);
    }
    @Test
    void testSelect() {
        // 查询主键 ID 为 4 的记录
        UserDO userDO = userDOMapper.selectByPrimaryKey(4L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }
    @Test
    void testDelete() {
        // 删除主键 ID 为 4 的记录
        userDOMapper.deleteByPrimaryKey(4L);
    }

}
