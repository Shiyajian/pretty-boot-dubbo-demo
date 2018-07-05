package com.shiyajian.project.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 项目实体类
 *
 * @author shiyajian
 */
@Data
@ToString
public class ProjectDTO implements Serializable {


    private String projectId;

    private String projectName;

}
