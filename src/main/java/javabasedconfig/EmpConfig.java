package javabasedconfig;
import org.springframework.context.annotation.*;
@Configuration
public class EmpConfig {
	@Bean
	public Employee emp() {
		return new Employee();
	}
}
