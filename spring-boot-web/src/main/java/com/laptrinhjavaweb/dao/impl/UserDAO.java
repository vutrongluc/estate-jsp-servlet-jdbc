package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IRentareaDAO;
import com.laptrinhjavaweb.dao.IUsersDAO;
import com.laptrinhjavaweb.dto.RentareaDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.mapper.UsersMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO extends AbstractDAO<UserDTO> implements IUsersDAO {
    @Override
    public List<UserDTO> findUserByStatusAndRole() {
        String sql="SELECT user.id, user.email, user.full_name, user.password, user.phone, user.status, user.user_name FROM user\n" +
                "                LEFT JOIN user_role on user.id = user_role.user_id\n" +
                "                LEFT JOIN role on role.id= user_role.role_id\n" +
                "                WHERE role.code = 'STAFF' and user.status =1";

                List<UserDTO>cc = query(sql, new UsersMapper());
        return cc;
    }

    @Override
    public List<UserDTO> findAll() {
        String sql ="select * from user";
        return query(sql, new UsersMapper());
    }
}
