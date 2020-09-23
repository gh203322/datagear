/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

/**
 * 
 */
package org.datagear.management.domain;

/**
 * {@linkplain AnalysisProject}关联实体类。
 * 
 * @author datagear@163.com
 *
 */
public interface AnalysisProjectAwareEntity<ID> extends Entity<ID>
{
	/**
	 * {@linkplain AnalysisProject}关联实体类的级联数据权限参数：资源类型，
	 * 参考AnalysisProjectMapper.xml的queryViewIdPermissionForAnalysisProjectAwareEntity
	 */
	String DATA_PERMISSION_PARAM_RESOURCE_TYPE_ANALYSIS_PROJECT = "DP_RESOURCE_TYPE_ANALYSIS_PROJECT";

	AnalysisProject getAnalysisProject();

	void setAnalysisProject(AnalysisProject analysisProject);
}
