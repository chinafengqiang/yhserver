package com.smlearning.application.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smlearning.application.service.CoursewareCategoryService;
import com.smlearning.domain.activity.CoursewareCategoryActivity;
import com.smlearning.domain.entity.CoursewareCategory;
import com.smlearning.domain.vo.CoursewareNode;
import com.smlearning.domain.vo.Tree;

/**
 * 课件分类业务方法
 * @author Administrator
 */
@Service
public class CoursewareCategoryServiceImpl implements CoursewareCategoryService{

	static Logger logger = Logger.getLogger(CoursewareCategoryServiceImpl.class.getName());
	
	@Autowired
	private CoursewareCategoryActivity coursewareCategoryActivity;
	
	/**
	 * 创建课件分类
	 * @param name 名称
	 * @param parentId 上级分类编号
	 * @param sortFlag 排序号
	 * @param creator 创建人
	 * @return 课程分类对象
	 * @throws NoParentCourseCategoryException 无上级课程分类
	 */
	public CoursewareCategory createCoursewareCategory(String name, Long parentId, Integer sortFlag, Integer useType, Long creator) throws Exception {
		return coursewareCategoryActivity.createCoursewareCategory(name, parentId, sortFlag, useType, creator);
	}
	
	/**
	 * 修改课件分类
	 * @param courseCategoryId 课件分类编号
	 * @param name 名称
	 * @param sortFlag 排序号
	 * @return 课程件类编号
	 * @throws NoCourseCategoryException 无此课件分类
	 * @throws NonEnoughAccessException 无足够的权限
	 */
	public CoursewareCategory modifyCoursewareCategory(Long coursewareCategoryId, String name, Integer sortFlag) throws Exception{
		return coursewareCategoryActivity.modifyCoursewareCategory(coursewareCategoryId, name, sortFlag);
	}
	
	/**
	 * 删除课件分类
	 * @param courseCategoryId 课件分类编号
	 * @throws NoCourseCategoryException 无此课件分类
	 * @throws NonEmptyCourseCategoryException 此课件分类非空
	 * @throws NonEmptyCouseCategoryException 
	 */
	public void removeCoursewareCategory(Long coursewareCategoryId) throws Exception {
		coursewareCategoryActivity.removeCoursewareCategory(coursewareCategoryId);
	}
	
	/**
	 * 返回数据集
	 * @return
	 */
	public ArrayList<CoursewareNode> createCoursewareNodeList(Integer useType) {
		return coursewareCategoryActivity.createCoursewareNodeList(useType);
	}
	
	
	/**
	 * 获得课件分类
	 * @param courseCategoryId 课件分类编号
	 */
	public CoursewareCategory getCoursewareCategoryByID(Long coursewareCategoryId) throws Exception {
		return coursewareCategoryActivity.getCoursewareCategoryByID(coursewareCategoryId);
	}
	
	/**
	 * 公用树
	 * @return
	 */
	public ArrayList<Tree> createTree(Integer useType) {
		return coursewareCategoryActivity.createTree(useType);
	}
	
	/**
	 * 返回数据集
	 * @return
	 */
	public ArrayList<CoursewareNode> createCoursewareTree(Integer useType) {
		return coursewareCategoryActivity.createCoursewareTree(useType);
	}
	
	public List<CoursewareCategory> getCoursewareCategoryList(int type){
		return coursewareCategoryActivity.getCoursewareCategoryList(type);
	}
	
	
}
