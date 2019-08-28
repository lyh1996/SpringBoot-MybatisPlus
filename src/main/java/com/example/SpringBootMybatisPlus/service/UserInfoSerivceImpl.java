package com.example.SpringBootMybatisPlus.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.SpringBootMybatisPlus.dao.UserInfoDao;
import com.example.SpringBootMybatisPlus.domain.UserInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 633805 LYH
 * @version V1.0
 * @description 用户业务实现
 * @create 2019-08-28 10:25
 * @since 1.7
 */

@Service
@Transactional
public class UserInfoSerivceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService {

    /**
     * 查询大于该分数的学生
     * @Author lyh
     * @CreateTime 2019-08-28 10:29
     * @Param  page  分页参数
     * @Param  fraction  分数
     * @Return IPage<UserInfoEntity> 分页数据
     */
    @Override
    public IPage<UserInfoEntity> selectUserInfoByGtFraction(IPage<UserInfoEntity> page, Long fraction) {
        return this.baseMapper.selectUserInfoByGtFraction(page,fraction);
    }


    @Override
    public UserInfoEntity getUserInfo(Long id) {
        return this.baseMapper.getUserInfo(id).orElseThrow(() ->new IllegalArgumentException("该用户不存在，请检查信息准确性"));
    }


}
