package org.GraceLearningJava.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	private Map<Long, Course> courseList = new HashMap<>();

	public CourseRepository() {
		Course java = new Course(1L, "Java", "Java Description");
		Course javascript = new Course(2L, "Javascript", "JavaScript Description");
		Course spring = new Course(3L, "Spring", "Spring Description");

		courseList.put(java.getid(), java);
		courseList.put(javascript.getid(), javascript);
		courseList.put(spring.getid(), spring);
	}

	// constructor for testing purposes
	public CourseRepository(Course... courses) {
		for (Course course : courses) {
			courseList.put(course.getid(), course);
		}
	}

	public Course findOne(long id) {
		return courseList.get(id);
	}

	public Collection<Course> findAll() {
		return courseList.values();
	}
}
