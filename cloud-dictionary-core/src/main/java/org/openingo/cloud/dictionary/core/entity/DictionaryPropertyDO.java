package org.openingo.cloud.dictionary.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import org.openingo.boot.mybatisplus.extension.ModelX;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 词典属性
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_dictionary_property")
public class DictionaryPropertyDO extends ModelX<DictionaryPropertyDO> {

    private static final long serialVersionUID=1L;
    

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父节点id
     */
    private Integer parentId;

    /**
     * 父节点code
     */
    private String parentCode;

    /**
     * 词典id
     */
    private Integer dictionaryId;

    /**
     * 词典编码
     */
    private String dictionaryCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    @TableField(fill = FieldFill.INSERT)
    private String code;

    /**
     * 取值
     */
    private String value;

    /**
     * 扩展信息
     */
    private String extra;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
