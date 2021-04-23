package org.innox.pojo;

import java.util.Date;

public class SentenceTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.sentence_seq
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Long sentenceSeq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.book_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Long bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.lesson_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Integer lessonId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.sentence_type
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private String sentenceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.line_no
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Long lineNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.sentence_name_translate
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private String sentenceNameTranslate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.sentence_name_orignal
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private String sentenceNameOrignal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.description
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.creater
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.create_time
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.updater
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sentence_table.update_time
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.sentence_seq
     *
     * @return the value of sentence_table.sentence_seq
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Long getSentenceSeq() {
        return sentenceSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.sentence_seq
     *
     * @param sentenceSeq the value for sentence_table.sentence_seq
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setSentenceSeq(Long sentenceSeq) {
        this.sentenceSeq = sentenceSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.book_id
     *
     * @return the value of sentence_table.book_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.book_id
     *
     * @param bookId the value for sentence_table.book_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.lesson_id
     *
     * @return the value of sentence_table.lesson_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Integer getLessonId() {
        return lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.lesson_id
     *
     * @param lessonId the value for sentence_table.lesson_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.sentence_type
     *
     * @return the value of sentence_table.sentence_type
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public String getSentenceType() {
        return sentenceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.sentence_type
     *
     * @param sentenceType the value for sentence_table.sentence_type
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setSentenceType(String sentenceType) {
        this.sentenceType = sentenceType == null ? null : sentenceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.line_no
     *
     * @return the value of sentence_table.line_no
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Long getLineNo() {
        return lineNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.line_no
     *
     * @param lineNo the value for sentence_table.line_no
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.sentence_name_translate
     *
     * @return the value of sentence_table.sentence_name_translate
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public String getSentenceNameTranslate() {
        return sentenceNameTranslate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.sentence_name_translate
     *
     * @param sentenceNameTranslate the value for sentence_table.sentence_name_translate
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setSentenceNameTranslate(String sentenceNameTranslate) {
        this.sentenceNameTranslate = sentenceNameTranslate == null ? null : sentenceNameTranslate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.sentence_name_orignal
     *
     * @return the value of sentence_table.sentence_name_orignal
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public String getSentenceNameOrignal() {
        return sentenceNameOrignal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.sentence_name_orignal
     *
     * @param sentenceNameOrignal the value for sentence_table.sentence_name_orignal
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setSentenceNameOrignal(String sentenceNameOrignal) {
        this.sentenceNameOrignal = sentenceNameOrignal == null ? null : sentenceNameOrignal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.description
     *
     * @return the value of sentence_table.description
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.description
     *
     * @param description the value for sentence_table.description
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.creater
     *
     * @return the value of sentence_table.creater
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.creater
     *
     * @param creater the value for sentence_table.creater
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.create_time
     *
     * @return the value of sentence_table.create_time
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.create_time
     *
     * @param createTime the value for sentence_table.create_time
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.updater
     *
     * @return the value of sentence_table.updater
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.updater
     *
     * @param updater the value for sentence_table.updater
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sentence_table.update_time
     *
     * @return the value of sentence_table.update_time
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sentence_table.update_time
     *
     * @param updateTime the value for sentence_table.update_time
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}