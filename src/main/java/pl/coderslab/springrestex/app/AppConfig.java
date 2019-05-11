package pl.coderslab.springrestex.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"pl.coderslab.springrestex"})
@EnableWebMvc
public class AppConfig {

}
