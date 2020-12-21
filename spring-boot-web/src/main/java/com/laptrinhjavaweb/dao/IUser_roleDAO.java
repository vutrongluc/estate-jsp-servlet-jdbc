package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.User_roleDTO;

import java.util.List;

public interface IUser_roleDAO {
    List<User_roleDTO> findByUserId(Integer ID);
    void save(Long userid, Long roleid);
    void delete(Long userid);
}
