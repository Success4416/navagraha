package io.renren.modules.content.service;

import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * @author: success
 * @create: 2019-03-09 13:35:01
 **/
public interface ContentTalentService {
    /**
     * 查询所有的人才招聘信息
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);
}
