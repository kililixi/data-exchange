package com.startsi.data_exchange;

import com.startsi.data_exchange.mysql.entity.RcsEquipOfMysql;
import com.startsi.data_exchange.mysql.repository.RcsEquipOfMysqlRepository;
import com.startsi.data_exchange.postgres.entity.RcsEquipOfPostgres;
import com.startsi.data_exchange.postgres.repository.RcsEquipOfPostgresRepository;
import com.startsi.data_exchange.util.ConvertMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class DataExchangeApplicationTests {

	@Autowired
	RcsEquipOfMysqlRepository rcsEquipOfMysqlRepository;

	@Autowired
	RcsEquipOfPostgresRepository rcsEquipOfPostgresRepository;

	@Test
	@Transactional(transactionManager = "postgresTransactionManager")
	void contextLoads() {
		RcsEquipOfPostgres equipTemp = rcsEquipOfPostgresRepository.getById("1765191848203993090");
		System.out.println(equipTemp);
		RcsEquipOfMysql equipTemp2 = ConvertMapper.INSTANCES.toRcsEquipOfMysql(equipTemp);
		System.out.println(equipTemp2);
		rcsEquipOfMysqlRepository.save(equipTemp2);

	}

	@Test
	@Transactional
//	@Transactional(transactionManager = "mysqlTransactionManager")
	public void search2() {
//		RcsEquipOfPostgres equipTemp = rcsEquipOfPostgresRepository.getById("1765191848203993090");
//		System.out.println(equipTemp);
//		RcsEquipOfMysql equipTemp2 = ConvertMapper.INSTANCES.toRcsEquipOfMysql(equipTemp);

//		RcsEquipOfMysql equipTemp3 = new RcsEquipOfMysql();
//		equipTemp3.setEquipId("111");
//		System.out.println(equipTemp3);
//		rcsEquipOfMysqlRepository.save(equipTemp3);

		RcsEquipOfPostgres equipTemp3 = new RcsEquipOfPostgres();
		equipTemp3.setEquipId("111");
		System.out.println(equipTemp3);
		rcsEquipOfPostgresRepository.save(equipTemp3);
	}

	@Transactional(transactionManager = "postgresTransactionManager")
	public RcsEquipOfMysql search() {
		RcsEquipOfPostgres equipTemp = rcsEquipOfPostgresRepository.getById("1765191848203993090");
		System.out.println(equipTemp);
		RcsEquipOfMysql equipTemp2 = ConvertMapper.INSTANCES.toRcsEquipOfMysql(equipTemp);
		return equipTemp2;
	}

	@Transactional(transactionManager = "mysqlTransactionManager")
	public void insert(RcsEquipOfMysql equip) {
		rcsEquipOfMysqlRepository.save(equip);
	}

	@Test
	void searchAndInsert() {
		RcsEquipOfMysql equip = search();
		insert(equip);

	}

}
