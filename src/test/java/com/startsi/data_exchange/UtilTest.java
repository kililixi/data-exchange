package com.startsi.data_exchange;

import com.startsi.data_exchange.mysql.entity.RcsEquipOfMysql;
import com.startsi.data_exchange.postgres.entity.RcsEquipOfPostgres;
import com.startsi.data_exchange.util.ConvertMapper;
import org.junit.jupiter.api.Test;

/**
 * @package: com.startsi.data_exchange
 * @className: UtilTest
 * @author: hubinchang
 * @description: TODO
 * @date: 2024/09/19 11:14
 * @version: 1.0
 */
public class UtilTest {

    @Test
    public void testConvert() {
        RcsEquipOfPostgres post = new RcsEquipOfPostgres();
        post.setEquipId("123");

        RcsEquipOfMysql post2 = ConvertMapper.INSTANCES.toRcsEquipOfMysql(post);

        System.out.println(post.getEquipId());
    }
}
