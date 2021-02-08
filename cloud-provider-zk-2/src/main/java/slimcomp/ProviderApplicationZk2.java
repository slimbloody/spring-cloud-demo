package slimcomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "slimcomp.dao")
@EnableDiscoveryClient
public class ProviderApplicationZk2 {
    public static void main( String[] args ) {
    	SpringApplication.run(ProviderApplicationZk2.class, args);
    }
}
