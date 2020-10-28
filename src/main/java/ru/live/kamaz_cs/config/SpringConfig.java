package ru.live.kamaz_cs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"ru.live.kamaz_cs.service", "ru.live.kamaz_cs.dao"})
public class SpringConfig {

//    @Bean
//    public TestBean getTestBean() {
//        return new TestBean("hello");
//    }

    @Bean
    public JdbcTemplate getJdbsTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/vebinar?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

//    @Bean
//    public UserDao getUserDao() {
//        return new UserDaoImpl(getJdbsTemplate());
//    }

//    @Bean
//    public UserService getUserService() {
//        return new UserServiceImpl();
//    }

}
