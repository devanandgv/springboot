package com.dev.springboot.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class ProfilesConfiguration{


	@Bean(name="datasource")
	@Profile("dev")
	public DatasourceConfig devDatasource() {
		System.out.println("dev datasource");
		return new DevDatasourceConfig();
	}
	@Bean(name="datasource")
	@Profile("sit")
	public DatasourceConfig SITDatasource() {
		System.out.println("sit datasource");
		return new SITDatasourceConfig();
	}

}
