package com.springrest.springrest.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
	list=new ArrayList<>();
	list.add(new Course(100,"Core Java","All concept of core java"));
	list.add(new Course(200,"Spring boot","All concept of Spring boot"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break; 
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;

	}

	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e -> {
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}


	

}
