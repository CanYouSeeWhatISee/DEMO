package com.one.demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.one.demo.entity.SysUser;
import com.one.demo.entity.UserVoDetail;
import com.one.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Wrapper<SysUser> query = new EntityWrapper<>();
        query.eq("user_name",s);
        SysUser sysUser = sysUserService.selectOne(query);
        if(sysUser==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return new UserVoDetail(sysUser.getUserId(),sysUser.getUserName(),sysUser.getPassword());
    }

}
