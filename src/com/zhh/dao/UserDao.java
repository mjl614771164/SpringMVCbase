package com.zhh.dao;

import com.zhh.beans.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
	void add(User user);

    List<User> list();

    void delete(String id);
}
