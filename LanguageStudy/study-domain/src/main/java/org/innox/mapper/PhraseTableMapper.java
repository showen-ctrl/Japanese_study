package org.innox.mapper;

import org.innox.pojo.PhraseTable;

public interface PhraseTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phrase_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int deleteByPrimaryKey(Long phraseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phrase_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int insert(PhraseTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phrase_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int insertSelective(PhraseTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phrase_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    PhraseTable selectByPrimaryKey(Long phraseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phrase_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int updateByPrimaryKeySelective(PhraseTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phrase_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int updateByPrimaryKey(PhraseTable record);
}