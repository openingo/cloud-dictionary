/*
 * MIT License
 *
 * Copyright (c) 2021 OpeningO Co.,Ltd.
 *
 *    https://openingo.org
 *    contactus(at)openingo.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.openingo.cloud.dictionary.core.service.base;

import org.openingo.boot.mybatisplus.service.IBaseService;
import org.openingo.cloud.dictionary.core.entity.base.BaseDO;
import org.openingo.cloud.dictionary.vo.resp.PutResultRespVO;
import org.openingo.jdkits.lang.BeanKit;
import org.openingo.jdkits.lang.ThreadShareKit;

/**
 * ICloudDictionaryService
 *
 * @author Qicz
 * @since 2021/7/26 15:35
 */
public interface ICloudDictionaryService<VO, DO extends BaseDO<DO>> extends IBaseService<VO, DO, PutResultRespVO> {

	/**
	 * put之后的工作
	 * @param vo 某对象vo
	 * @param aDo 某对象do
	 */
	@Override
	default void afterPut(VO vo, DO aDo) {
		ThreadShareKit.put(aDo);
	}

	/**
	 * 获取afterPut放的数据
	 *
	 * @return afterPut放入的数据
	 */
	@Override
	default PutResultRespVO getAfterPut() {
		final DO aDo = ThreadShareKit.getRemove();
		return BeanKit.copy(aDo, PutResultRespVO.class);
	}
}
