package pe.gob.susalud.seguridad.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@Configuration
public class SecurityConfig implements WebMvcConfigurer{

    public void addCorsMapping(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }

}
