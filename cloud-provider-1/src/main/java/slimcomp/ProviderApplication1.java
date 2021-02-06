package slimcomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = "slimcomp.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderApplication1 {
    public static void main( String[] args ) {
    	SpringApplication.run(ProviderApplication1.class, args);
    }
}
