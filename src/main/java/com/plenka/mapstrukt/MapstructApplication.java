package com.plenka.mapstrukt;


import com.plenka.mapstrukt.mapper.UserMapper;
import com.plenka.mapstrukt.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class MapstructApplication {

	private final UserMapper userMapper;



	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			UserDTO userDTO = new UserDTO(1L,"abdiev21",3);
			System.out.println(userMapper.dtoToObject(userDTO));
		};
	}

}
