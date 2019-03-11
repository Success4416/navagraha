/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

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
	
//
//	/**
//	 * 配置信息
//	 */
//	@RequestMapping("/info/{id}")
//	@RequiresPermissions("sys:config:info")
//	@ResponseBody
//	public R info(@PathVariable("id") Long id){
//		SysConfigEntity config = sysConfigService.getById(id);
//
//		return R.ok().put("config", config);
//	}
//
	/**
	 * 保存配置
	 */
	@SysLog("保存配置")
	@RequestMapping("/save")
	@RequiresPermissions("content:talent:save")
	public R save(@RequestBody ContentTalentEntity contentTalent){
//		ValidatorUtils.validateEntity(contentTalent);

		contentTalentService.saveContentTalent(contentTalent);

		return R.ok();
	}
//
//	/**
//	 * 修改配置
//	 */
//	@SysLog("修改配置")
//	@RequestMapping("/update")
//	@RequiresPermissions("sys:config:update")
//	public R update(@RequestBody SysConfigEntity config){
//		ValidatorUtils.validateEntity(config);
//
//		sysConfigService.update(config);
//
//		return R.ok();
//	}
//
//	/**
//	 * 删除配置
//	 */
//	@SysLog("删除配置")
//	@RequestMapping("/delete")
//	@RequiresPermissions("sys:config:delete")
//	public R delete(@RequestBody Long[] ids){
//		sysConfigService.deleteBatch(ids);
//
//		return R.ok();
//	}

}
