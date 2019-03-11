
package io.renren.modules.content.controller;


import io.renren.common.annotation.SysLog;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.modules.content.entity.ContentTalentEntity;
import io.renren.modules.content.service.ContentTalentService;
import io.renren.modules.sys.controller.AbstractController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 内容管理-人才招聘
 *
 * @author Success
 */
@RestController
@RequestMapping("/content/talent")
public class ContentTalentController extends AbstractController {
	@Autowired
	private ContentTalentService contentTalentService;

	/**
	 * 查询所有的人才招聘信息
	 */
	@RequestMapping("/list")
	@RequiresPermissions("content:talent:list")
	public R list(@RequestParam Map<String, Object> params){
		PageUtils page = contentTalentService.queryPage(params);
		return R.ok().put("page", page);
	}
	

	/**
	 * 查询才招聘信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("content:talent:info")
	@ResponseBody
	public R info(@PathVariable("id") Long id){
		ContentTalentEntity contentTalent = contentTalentService.getById(id);

		return R.ok().put("talent", contentTalent);
	}

	/**
	 * 保存人才招聘信息
	 */
	@SysLog("保存人才招聘信息")
	@RequestMapping("/save")
	@RequiresPermissions("content:talent:save")
	public R save(@RequestBody ContentTalentEntity contentTalent){
		ValidatorUtils.validateEntity(contentTalent);

		contentTalentService.saveContentTalent(contentTalent);

		return R.ok();
	}

	/**
	 * 修改人才招聘信息
	 */
	@SysLog("修改人才招聘信息")
	@RequestMapping("/update")
	@RequiresPermissions("content:talent:update")
	public R update(@RequestBody ContentTalentEntity contentTalent){
		ValidatorUtils.validateEntity(contentTalent);
		contentTalentService.update(contentTalent);
		return R.ok();
	}

	/**
	 * 删除才招聘信息
	 */
	@SysLog("删除才招聘信息")
	@RequestMapping("/delete")
	@RequiresPermissions("content:talent:delete")
	public R delete(@RequestBody Long[] ids){
		contentTalentService.deleteBatch(ids);
		return R.ok();
	}

}
