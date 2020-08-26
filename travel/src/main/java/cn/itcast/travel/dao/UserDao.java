package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    //根据用户名查询用户信息
    public User findByUsername(String username);
    //用户添加
    public void save(User user);
}
