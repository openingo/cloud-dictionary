package org.openingo.cloud.dictionary.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.openingo.cloud.dictionary.core.entity.DictionaryDO;

/**
 * <p>
 * 词典 DictionaryMapper 接口
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Mapper
public interface DictionaryMapper extends BaseMapper<DictionaryDO> {

}
