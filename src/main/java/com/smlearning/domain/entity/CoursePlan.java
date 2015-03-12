package com.smlearning.domain.entity;

public class CoursePlan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.image_url
     *
     * @mbggenerated
     */
    private String imageUrl;

    private long gradeId = 0;
    
    
    public long getGradeId() {
      return gradeId;
    }

    public void setGradeId(long gradeId) {
      this.gradeId = gradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.id
     *
     * @return the value of course_plan.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.id
     *
     * @param id the value for course_plan.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.name
     *
     * @return the value of course_plan.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.name
     *
     * @param name the value for course_plan.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.image_url
     *
     * @return the value of course_plan.image_url
     *
     * @mbggenerated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.image_url
     *
     * @param imageUrl the value for course_plan.image_url
     *
     * @mbggenerated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}