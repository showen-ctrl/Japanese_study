package org.innox.mapper;

import org.innox.pojo.CodeTable;

public interface CodeTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int deleteByPrimaryKey(Integer codeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int insert(CodeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int insertSelective(CodeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    CodeTable selectByPrimaryKey(Integer codeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int updateByPrimaryKeySelective(CodeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int updateByPrimaryKey(CodeTable record);
}