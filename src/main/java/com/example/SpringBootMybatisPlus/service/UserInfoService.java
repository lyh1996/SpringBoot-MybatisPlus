package com.example.SpringBootMybatisPlus.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.SpringBootMybatisPlus.domain.UserInfoEntity;

/**
 * @author 633805 LYH
 * @version V1.0
 * @description 用户业务接口
 * @create 2019-08-28 10:25
 * @since 1.7
 */

public interface UserInfoService extends IService<UserInfoEntity> {
    /**
     * 查询大于该分数的学生
     * @Author Sans
     * @CreateTime 2019/6/9 14:27
     * @Param  page  分页参数
     * @Param  fraction  分数
     * @Return IPage<UserInfoEntity> 分页数据
     */
    IPage<UserInfoEntity> selectUserInfoByGtFraction(IPage<UserInfoEntity> page, Long fraction);


    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    UserInfoEntity getUserInfo(Long id);
}
