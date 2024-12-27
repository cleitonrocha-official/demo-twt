package br.com.twt.rest.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class RestDocConfig implements WebMvcConfigurer {

    @Bean
    OpenAPI openApiConfig() {
    return new OpenAPI()
                .info(new Info()
                        .title("Cleiton Rocha - Pro")
                        .version("1.0")
                        .description("API Cleiton Rocha")
                        .contact(new Contact()
                                .name("Cleiton Rocha")
                                .email("cleiton.devcode@gmail.com"))

                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}