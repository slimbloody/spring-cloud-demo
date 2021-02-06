package slimcomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = "slimcomp.dao")
@EnableEurekaClient
public class ProviderApplication {
    public static void main( String[] args ) {
    	SpringApplication.run(ProviderApplication.class, args);
    }
}
