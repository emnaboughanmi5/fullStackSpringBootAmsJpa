package com.sip.ams.configuration;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.*;
public class DataBaseConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
	HikariConfig config = new HikariConfig();
	config.setJdbcUrl(dbUrl);
	return (DataSource) new HikariDataSource(config);
    }
}
