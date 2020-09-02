package club.codedemo.springjpatestinmemorydatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:student.properties")
public class StudentJpaConfig {

    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(this.environment.getProperty("url"));
        dataSourceBuilder.username(this.environment.getProperty("username"));
        dataSourceBuilder.password(this.environment.getProperty("password"));
        return dataSourceBuilder.build();
    }
}
