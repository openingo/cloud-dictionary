package org.openingo.cloud.dictionary.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * 词典
 * </p>
 *
 * @author Qicz
 * @since 2021-07-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_dictionary")
public class DictionaryDO extends ModelX<DictionaryDO> {

    private static final long serialVersionUID=1L;
    

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 应用id
     */
    private Integer applicationId;

    /**
     * 应用编码
     */
    private String applicationCode;

    /**
     * 业务id
     */
    private Integer businessId;

    /**
     * 业务编码
     */
    private String businessCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 类型，1=dictionary，2=tag
     */
    private Integer type;

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
