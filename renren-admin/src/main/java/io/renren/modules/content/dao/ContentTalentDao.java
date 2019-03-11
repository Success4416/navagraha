

package io.renren.modules.content.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.content.entity.ContentTalentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容管理-人才招聘
 *
 * @author Success
 */
@Mapper
public interface ContentTalentDao extends BaseMapper<ContentTalentEntity> {

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] ids);
}
