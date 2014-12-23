package com.shinowit.dao.mapper;

import com.shinowit.entity.Teacher;
import com.shinowit.entity.TeacherCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int countByExample(TeacherCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int deleteByExample(TeacherCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int deleteByPrimaryKey(Integer teacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    List<Teacher> selectByExample(TeacherCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    Teacher selectByPrimaryKey(Integer teacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 16:44:45 CST 2014
     */
    int updateByPrimaryKey(Teacher record);
}