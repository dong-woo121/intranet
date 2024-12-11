package bizwiz.intranet.common.config;

import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {

    @Bean
    public HibernatePropertiesCustomizer hibernatePropertiesCustomizer() {
        return hibernateProperties -> {
            hibernateProperties.put("hibernate.physical_naming_strategy", "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
            hibernateProperties.put("hibernate.implicit_naming_strategy", "org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl");
        };
    }
}