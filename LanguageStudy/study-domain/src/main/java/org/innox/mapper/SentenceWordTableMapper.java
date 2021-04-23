package org.innox.mapper;

import org.innox.pojo.SentenceWordTable;
import org.innox.pojo.SentenceWordTableKey;

public interface SentenceWordTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sentence_word_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int deleteByPrimaryKey(SentenceWordTableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sentence_word_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int insert(SentenceWordTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sentence_word_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int insertSelective(SentenceWordTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sentence_word_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    SentenceWordTable selectByPrimaryKey(SentenceWordTableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sentence_word_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int updateByPrimaryKeySelective(SentenceWordTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sentence_word_table
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    int updateByPrimaryKey(SentenceWordTable record);
}