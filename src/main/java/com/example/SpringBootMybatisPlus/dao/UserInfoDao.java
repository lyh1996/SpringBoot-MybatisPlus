package com.example.SpringBootMybatisPlus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.SpringBootMybatisPlus.domain.UserInfoEntity;

import java.util.Optional;

/**
 * @author 633805 LYH
 * @version V1.0
 * @description 用户信息DAO
 * @create 2019-08-28 10:23
 * @since 1.7
 */

public interface UserInfoDao extends BaseMapper<UserInfoEntity> {

    /**
     * 查询大于该分数的学生
     * @Author lyh
     * @CreateTime 2019-08-28 10:29
     * @Param  page  分页参数
     * @Param  fraction  分数
     * @Return IPage<UserInfoEntity> 分页数据
     */
    IPage<UserInfoEntity> selectUserInfoByGtFraction(IPage<UserInfoEntity> page, Long fraction);

    /**
     * 根据id进行查找
     * @param id
     * @return
     */
    Optional<UserInfoEntity> getUserInfo(Long id);
 }
