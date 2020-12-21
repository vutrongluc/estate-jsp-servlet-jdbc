package com.laptrinhjavaweb.repository.custom.imlp;

import com.laptrinhjavaweb.entity.CustormerEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.custom.UserRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserEntity> findAll() {
        String sql = "select * from custormer";
        Query query= entityManager.createNativeQuery(sql, CustormerEntity.class);
        return query.getResultList();

    }
}
