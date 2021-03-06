package com.sdh.service;

import com.sdh.pojo.UserSdh;
import com.sdh.vo.UserRoleVo;

/**
 * @ClassName UserSdhService
 * @Description TODO
 * @Author SDH
 * @CreateDate 2019/11/1 15:24
 * @Version 1.0
 */
public interface UserSdhService {
    void insertUser(UserRoleVo userRoleVo);

    UserSdh queryUserSdhByUsername(String username);

    void updateStudent(UserRoleVo userRoleVo);
}
