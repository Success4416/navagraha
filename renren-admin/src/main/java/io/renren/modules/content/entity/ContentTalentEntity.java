/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 人才招聘
 *
 * @author Success
 */
@Data
@TableName("content_talent")
public class ContentTalentEntity {
	@TableId
	private Long id;
	private String talentTitle;
	private Integer talentNumber;
	private String talentPlace;
	private String talentFunctions;
	private String talentQualification;
	private String talentPay;
	private String talentEducation;
	private String remark;
	private Byte deleteFlag;

}
