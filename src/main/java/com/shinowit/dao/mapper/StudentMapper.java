package com.shinowit.dao.mapper;

import com.shinowit.entity.Student;
import com.shinowit.entity.StudentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int countByExample(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int deleteByExample(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int deleteByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    List<Student> selectByExample(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    Student selectByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByPrimaryKey(Student record);
}