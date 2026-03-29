package config;

import dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoAliasConfig {

   // @Bean(name = "dao")
    public IDao daoAlias() {
        return new DaoImpl2(); // change ici
    }
}