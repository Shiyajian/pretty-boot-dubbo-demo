# springboot2-dubbo

## 启动
```
project能启动使用
```
- 安装zookeeper 默认地址 127.0.0.1:2181
- 启动 project-provider中的application.class
- 启动 project-server中的application.class
- 访问 localhost:8200/project/test

## 监控

- 下载dubbo-admin项目，url: https://github.com/apache/incubator-dubbo-ops.git;
- cd 到 incubator-dubbo-ops 下的 admin 文件夹下面,调用出命令行界面，执行： mvn package , 打包结果是个 runable jar;
- 调用命令行界面，执行： java - jar dubbo-admin-0.0.1-SNAPSHOT.jar
- 进入监控页面： localhost:7001 , 账户名：root ，密码： root 。
