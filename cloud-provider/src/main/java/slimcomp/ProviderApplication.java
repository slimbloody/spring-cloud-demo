package slimcomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "slimcomp.dao")
public class ProviderApplication {
    public static void main( String[] args ) {
    	SpringApplication.run(ProviderApplication.class, args);
    }
}
