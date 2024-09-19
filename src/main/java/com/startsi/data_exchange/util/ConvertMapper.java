package com.startsi.data_exchange.util;

import com.startsi.data_exchange.mysql.entity.RcsEquipOfMysql;
import com.startsi.data_exchange.postgres.entity.RcsEquipOfPostgres;
import com.startsi.data_exchange.postgres.repository.RcsEquipOfPostgresRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * <h3>data-exchange</h3>
 *
 * @author hubinchang
 * @description <p></p>
 * @date 2024-09-19 11:10
 **/
@Mapper(componentModel = "spring")
public interface ConvertMapper {

    ConvertMapper INSTANCES = Mappers.getMapper(ConvertMapper.class);

    @Mappings({})
    RcsEquipOfPostgres toRcsEquipOfPostgres(RcsEquipOfMysql equip);

    @Mappings({})
    RcsEquipOfMysql toRcsEquipOfMysql(RcsEquipOfPostgres equip);
}
