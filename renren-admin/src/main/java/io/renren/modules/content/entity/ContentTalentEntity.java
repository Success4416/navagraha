

package io.renren.modules.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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
