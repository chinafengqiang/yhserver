package com.smlearning.infrastructure.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smlearning.domain.entity.classBook;
import com.smlearning.domain.entity.classBookExample;

public interface classBookMapper {
	
	/**
	 * 分页查询
	 * @param example
	 * @return
	 */
	List<classBook> selectByExamplePaging(classBookExample example);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int countByExample(classBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int deleteByExample(classBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int insert(classBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int insertSelective(classBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    List<classBook> selectByExample(classBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    classBook selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") classBook record, @Param("example") classBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") classBook record, @Param("example") classBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(classBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(classBook record);
}