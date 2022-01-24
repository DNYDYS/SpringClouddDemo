package com.dnydys.service;


import com.dnydys.domain.User;

import java.util.List;

/**
  * @author dnydys
  * @description
  * @updateTime 2022/1/23 19:23
*/
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
