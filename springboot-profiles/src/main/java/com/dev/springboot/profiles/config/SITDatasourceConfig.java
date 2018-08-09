/**
 * 
 */
package com.dev.springboot.profiles.config;

/**
 * @author devenand.g
 *
 */
public class SITDatasourceConfig implements DatasourceConfig {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
