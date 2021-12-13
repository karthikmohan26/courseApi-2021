package io.karthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Step -4 

@EnableSwagger2
@SpringBootApplication
public class CourseApi {

	public static void main(String[] args) {

		SpringApplication.run(CourseApi.class, args);
	}

	
	  @Bean 
	  public Docket swaggerConfiguration() {
	  return new
	  Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"))
	  .build(); }
	 

}
