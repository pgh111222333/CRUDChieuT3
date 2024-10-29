package crudjavac.nothing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.IStorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class) // thêm cấu hình storage

public class NothingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NothingApplication.class, args);
	}
	// thêm cấu hình storage
	@Bean
	CommandLineRunner init(IStorageService storageService) {
	return (args -> {
	storageService.init();
	});
	}
}
