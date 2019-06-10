package org.GraceLearningJava.courses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

	@RequestMapping("/show-courses")
	public String findAllCourses() {
		return "courses";
	}
}
