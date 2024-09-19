package com.startsi.data_exchange.postgres.repository;

import com.startsi.data_exchange.postgres.entity.RcsEquipOfPostgres;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <h3>data-exchange</h3>
 *
 * @author hubinchang
 * @description <p></p>
 * @date 2024-09-14 17:08
 **/
@Repository
public interface RcsEquipOfPostgresRepository extends JpaRepository<RcsEquipOfPostgres, String> {

}
