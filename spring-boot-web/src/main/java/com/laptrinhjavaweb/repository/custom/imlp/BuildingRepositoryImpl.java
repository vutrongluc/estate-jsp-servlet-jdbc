package com.laptrinhjavaweb.repository.custom.imlp;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.custom.BuildingRepositoryCustom;
import com.laptrinhjavaweb.util.CreateSqlSearchBuilding;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BuildingRepositoryImpl implements BuildingRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<BuildingEntity> findAll() {
        String sql = "select * from building";
        Query query= entityManager.createNativeQuery(sql, BuildingEntity.class);
        return query.getResultList();
    }

    @Override
    public List<BuildingEntity> findSearch(BuildingDTO buildingDTO) {
        String sql = CreateSqlSearchBuilding.CreatSQLSearch(buildingDTO);
        Query query= entityManager.createNativeQuery(sql, BuildingEntity.class);
        return query.getResultList();
    }

    @Override
    public void saveBuilding(BuildingEntity buildingEntity) {
        entityManager.persist(buildingEntity);
    }
}
