package org.jiangwen.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author name：JiangWen
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PhraseTable extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long phraseId;

    private String phraseType;

    private String phraseNameTranslate;

    private String phraseNameOrignal;

    private String description;


}