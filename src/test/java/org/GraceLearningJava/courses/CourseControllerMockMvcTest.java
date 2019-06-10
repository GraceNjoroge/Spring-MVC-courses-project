package org.GraceLearningJava.courses;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collection;

@RunWith(SpringRunner.class)
@WebMvcTest(CourseController.class)
public class CourseControllerMockMvcTest {

@Resource
private MockMvc mvc;

@Test 
public void shouldBeOkForAllCourses() throws Exception {
	mvc.perform(get("/show-courses")).andExpect(status().isOk());

	}
@Test 
public void shouldRouteToAllCoursesView() throws Exception {
	mvc.perform(get("/show-courses")).andExpect(view().name(is("courses")));
}

@Test 
public void shouldPutAllCoursesIntoModel() throws Exception {
	Collection<Course>allCourses =asList(firstCourse,secondCourse);
}
}
