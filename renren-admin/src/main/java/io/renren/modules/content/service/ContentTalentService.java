package io.renren.modules.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.content.entity.ContentTalentEntity;

import java.util.Map;

/**
 * @author: success
 * @create: 2019-03-09 13:35:01
 **/
public interface ContentTalentService extends IService<ContentTalentEntity> {
    /**
     * 查询所有的人才招聘信息
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存人才招聘信息
     * @param contentTalent
     * @return
     */
    void saveContentTalent(ContentTalentEntity contentTalent);

    /**
     * 修改人才招聘信息
     * @param contentTalent
     * @return
     */
    void update(ContentTalentEntity contentTalent);

    /**
     * 删除人才招聘信息
     * @param ids
     * @return
     */
    void deleteBatch(Long[] ids);


}
