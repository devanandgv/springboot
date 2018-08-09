package com.dev.springboot.profiles.config;

public class DevDatasourceConfig implements DatasourceConfig {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
