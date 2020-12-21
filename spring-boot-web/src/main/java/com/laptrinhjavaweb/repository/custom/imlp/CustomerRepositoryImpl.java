package com.laptrinhjavaweb.repository.custom.imlp;

import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.entity.CustormerEntity;
import com.laptrinhjavaweb.repository.custom.CustomerRepositoryCustom;
import com.laptrinhjavaweb.util.CreateSqlSearchBuilding;
import com.laptrinhjavaweb.util.CreateSqlSearchCustomer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CustormerEntity> findSearch(CustormerDTO custormerDTO) {
        String sql = CreateSqlSearchCustomer.CreatSQLSearch(custormerDTO);
        Query query= entityManager.createNativeQuery(sql, CustormerEntity.class);
        return query.getResultList();

    }

    @Override
    public List<CustormerEntity> findAll() {
        String sql="SELECT * FROM test.custormer";
        Query query= entityManager.createNativeQuery(sql, CustormerEntity.class);
        return query.getResultList();
    }


    @Override
    public void saveCustomer(CustormerEntity custormerEntity) {
        entityManager.persist(custormerEntity);
    }
}
