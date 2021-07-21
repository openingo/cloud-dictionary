package org.openingo.cloud.dictionary.core.service.impl;

import org.openingo.cloud.dictionary.core.entity.BusinessDO;
import org.openingo.cloud.dictionary.core.mapper.BusinessMapper;
import org.openingo.cloud.dictionary.core.service.IBusinessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业务信息 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, BusinessDO> implements IBusinessService {

}