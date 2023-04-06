package com.FischbachFoundation.listing;
import com.FischbachFoundation.listing.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListingApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
			new Student(
					1L,
					"Mariam",
					"mariam.jamal@gmail.com",

			)
        );
	}

}
