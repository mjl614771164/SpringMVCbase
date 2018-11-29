package com.zhh.service;

import com.zhh.beans.User;

import java.util.List;

public interface UserService {
	public void add(User user);

	public List<User> list();

	void delete(String id);
}
