package com.startsi.data_exchange.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @package: com.startsi.data_exchange.configuration
 * @className: MysqlJpaConfig
 * @author: hubinchang
 * @description: TODO
 * @date: 2024/09/18 17:14
 * @version: 1.0
 */
@Configuration
@EnableJpaRepositories(
        basePackages = "com.startsi.data_exchange.mysql.repository",
        entityManagerFactoryRef = "mysqlEntityManagerFactory",
        transactionManagerRef = "mysqlTransactionManager"
)
public class MysqlJpaConfig {
}
