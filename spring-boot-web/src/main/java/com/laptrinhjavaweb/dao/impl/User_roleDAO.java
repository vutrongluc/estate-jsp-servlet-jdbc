package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IUser_roleDAO;
import com.laptrinhjavaweb.dao.IUsersDAO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.dto.User_roleDTO;
import com.laptrinhjavaweb.mapper.User_roleMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class User_roleDAO extends AbstractDAO<User_roleDTO> implements IUser_roleDAO {
    @Override
    public List<User_roleDTO> findByUserId(Integer id) {
        String sql ="Select * from user_role where user_id = ?";
        return query(sql, new User_roleMapper(),id);
    }

    @Override
    public void save(Long userid, Long roleid) {
        String sql = "INSERT INTO user_role (user_id, role_id) value(?,?)";
        insert(sql,userid,roleid );
    }

    @Override
    public void delete(Long userid) {
        String sql = "Delete from user_role where user_id = ?";
        delete(sql,userid);
    }
}
