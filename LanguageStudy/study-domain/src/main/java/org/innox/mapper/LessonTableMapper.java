package org.innox.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.innox.pojo.LessonTable;
import org.innox.pojo.LessonTableExample;
import org.innox.pojo.LessonTableKey;

public interface LessonTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    long countByExample(LessonTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int deleteByExample(LessonTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int deleteByPrimaryKey(LessonTableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int insert(LessonTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int insertSelective(LessonTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    List<LessonTable> selectByExample(LessonTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    LessonTable selectByPrimaryKey(LessonTableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int updateByExampleSelective(@Param("record") LessonTable record, @Param("example") LessonTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int updateByExample(@Param("record") LessonTable record, @Param("example") LessonTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int updateByPrimaryKeySelective(LessonTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lesson_table
     *
     * @mbg.generated Wed May 12 16:37:06 JST 2021
     */
    int updateByPrimaryKey(LessonTable record);
}