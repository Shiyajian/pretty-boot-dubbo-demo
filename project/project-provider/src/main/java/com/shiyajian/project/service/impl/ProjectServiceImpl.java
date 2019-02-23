package com.shiyajian.project.service.impl;

import com.shiyajian.project.dto.ProjectDTO;
import com.shiyajian.project.service.IProjectService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


/**
 * 项目管理实现类
 * @author shiyajian
 * <p>
 * 全局application.properties 配置大于  @Service中的配置，可以通过@Service中修改部分参数，实现局部优化
 * <p>
 * 已经使用了dubbo的@Service注解，所以使用Spring的@Component将本类加载到Spring容器中
 */

@Service(interfaceClass = IProjectService.class)
@Component
public class ProjectServiceImpl implements IProjectService {

    public ProjectDTO getProjectById(String id) {
        ProjectDTO project = new ProjectDTO();
        project.setProjectId("JB-201807050001");
        project.setProjectName("新项目1");
        return project;
    }
}
