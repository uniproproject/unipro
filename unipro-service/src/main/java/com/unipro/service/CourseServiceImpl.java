package com.unipro.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.common.dao.CourseDao;
import com.unipro.model.Course;
import com.unipro.service.common.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	private Map<Integer, Course> courseMap = new ConcurrentHashMap<>();

	@Override
	public Course getCourse(Integer courseId) {
		return this.searchForCourseInstance(courseId);
	}

	private Course searchForCourseInstance(Integer courseId) {
		Course searchedCourse = null;
		if(this.courseMap.containsKey(courseId)) {
			searchedCourse = courseMap.get(courseId);
		} else {
			searchedCourse =  this.courseDao.getCourse(courseId);
			this.courseMap.put(searchedCourse.getId(), searchedCourse);
		}
		
		return searchedCourse;
	}

}
