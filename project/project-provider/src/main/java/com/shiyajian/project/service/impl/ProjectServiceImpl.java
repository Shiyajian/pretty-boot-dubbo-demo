package com.shiyajian.project.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shiyajian.project.dto.ProjectDTO;
import com.shiyajian.project.service.IProjectService;
import org.springframework.stereotype.Component;


/**
 * 项目管理实现类
 *
 * @author shiyajian
 * <p>
 * Service from com.alibaba.dubbo.config.annotation.Service. NOT org.springframework.stereotype.Service
 * <p>
 * 全局application.properties 配置大于  @Service中的配置，可以通过@Service中修改部分参数，实现局部优化
 * <p>
 * 已经使用了dubbo的@Service注解，所以使用Spring的@Component将本类加载到Spring容器中
 */
@Service
@Component
public class ProjectServiceImpl implements IProjectService {
    @Override
    public ProjectDTO getProjectById( String id ) {
        ProjectDTO project = new ProjectDTO();
        project.setProjectId("JB-201807050001");
        project.setProjectName("新项目1");
        return project;

    }
}
