package com.startsi.data_exchange.mysql.repository;

import com.startsi.data_exchange.mysql.entity.RcsEquipOfMysql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <h3>data-exchange</h3>
 *
 * @author hubinchang
 * @description <p></p>
 * @date 2024-09-14 17:07
 **/
@Repository
public interface RcsEquipOfMysqlRepository extends JpaRepository<RcsEquipOfMysql, String> {
}
