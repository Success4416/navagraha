package io.renren.modules.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.content.dao.ContentTalentDao;
import io.renren.modules.content.entity.ContentTalentEntity;
import io.renren.modules.content.service.ContentTalentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: success
 * @create: 2019-03-09 13:39:20
 **/
@Service("contentTalentService")
public class ContentTalentServiceImpl extends ServiceImpl<ContentTalentDao, ContentTalentEntity> implements ContentTalentService {
    /**
     * 人才招聘List 条件查询
     * @param params
     * @return
     */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String paramKey = (String)params.get("paramKey");

        IPage<ContentTalentEntity> page = this.page(
                new Query<ContentTalentEntity>().getPage(params),
                new QueryWrapper<ContentTalentEntity>()
                        .like(StringUtils.isNotBlank(paramKey),"talent_title", paramKey)
                        .eq("delete_flag", 0)
        );

        return null;
    }
}
