package com.one.demo.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.one.demo.entity.SysUser;
import com.one.demo.mapper.SysUserMapper;
import com.one.demo.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pwl
 * @since 2019-06-20
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
