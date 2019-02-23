package com.shiyajian.project.controller;

import com.shiyajian.entity.ResponseObject;
import com.shiyajian.project.dto.ProjectDTO;
import com.shiyajian.project.service.IProjectService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Reference
    IProjectService projectService;

    @GetMapping("test")
    public ResponseObject getTest() {
        ProjectDTO project = projectService.getProjectById("1234");
        return ResponseObject.ok(project);
    }
}
