package com.smlearning.infrastructure.dao;

import com.smlearning.domain.entity.userCourseNote;
import com.smlearning.domain.entity.userCourseNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userCourseNoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int countByExample(userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int deleteByExample(userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int insert(userCourseNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int insertSelective(userCourseNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    List<userCourseNote> selectByExampleWithBLOBs(userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    List<userCourseNote> selectByExample(userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    userCourseNote selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") userCourseNote record, @Param("example") userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") userCourseNote record, @Param("example") userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") userCourseNote record, @Param("example") userCourseNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(userCourseNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(userCourseNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_course_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(userCourseNote record);
}