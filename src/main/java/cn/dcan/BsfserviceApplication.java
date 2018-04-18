package cn.dcan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.dcan.mapper")
public class BsfserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsfserviceApplication.class, args);
	}
}
