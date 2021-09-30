package io.github.navee.bootifuladmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJdbcRepositories
@EnableTransactionManagement
public class BootifulAdminApplication extends AbstractJdbcConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(BootifulAdminApplication.class, args);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcOperations(JdbcOperations operations) {
        return new NamedParameterJdbcTemplate(operations);
    }

}
