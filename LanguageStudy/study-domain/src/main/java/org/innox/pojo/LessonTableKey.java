package org.innox.pojo;

public class LessonTableKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesson_table.book_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Long bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesson_table.lesson_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    private Integer lessonId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesson_table.book_id
     *
     * @return the value of lesson_table.book_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesson_table.book_id
     *
     * @param bookId the value for lesson_table.book_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesson_table.lesson_id
     *
     * @return the value of lesson_table.lesson_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public Integer getLessonId() {
        return lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesson_table.lesson_id
     *
     * @param lessonId the value for lesson_table.lesson_id
     *
     * @mbg.generated Mon Apr 19 03:23:44 JST 2021
     */
    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }
}