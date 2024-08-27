package com.niladri.SpringDataJPA;

import com.niladri.SpringDataJPA.model.Student;
import com.niladri.SpringDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		Student student1 = context.getBean(Student.class);

		StudentRepo studentRepo = context.getBean(StudentRepo.class);

		student1.setRoll(1);
		student1.setSname("Niladri");
		student1.setMarks(100);

		Student student2 = context.getBean(Student.class);
		student2.setRoll(2);
		student2.setSname("Sourav");
		student2.setMarks(90);

		Student student3 = context.getBean(Student.class);
		student3.setRoll(3);
		student3.setSname("Paramita");
		student3.setMarks(99);


		studentRepo.save(student1);
		studentRepo.save(student2);
		studentRepo.save(student3);

		System.out.println(studentRepo.findAll());

		System.out.println(studentRepo.findById(1));
	}

}
