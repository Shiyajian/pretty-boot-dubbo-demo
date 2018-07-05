package com.shiyajian.project.service;

import com.shiyajian.project.dto.ProjectDTO;


/**
 * 项目管理接口类
 * @author 史亚健
 */
public interface IProjectService {

    /**
     * 根据id查询项目信息
     * @param id  项目信息
     * @return    项目实体
     */
    ProjectDTO getProjectById( String id );
}