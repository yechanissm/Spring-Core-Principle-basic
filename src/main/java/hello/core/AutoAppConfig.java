package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
        //AppConfig가 스프링빈에 들어가기에, 중복 방지
        //Configuration 어노테이션안에 component가 들어간다.
)
public class AutoAppConfig {
}
