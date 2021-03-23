
##### 1. 完善 my dependency-injection 模块
脱离 web.xml 配置实现 ComponentContext 自动初始化使用独立模块并且能够在 user-web 中运行成功

> ListComponents.java
> /list GET测试，获取所有 注册的 Components

##### 2. 完善 my-configuration 模块
Config 对象如何能被 my-web-mvc 使用
可能在 ServletContext 获取
如何通过 ThreadLocal 获取

> FrontControllerServlet#init 方法, sout 测试
```
        // servlet 获取
        configRepository = (ConfigRepository) servletConfig.getServletContext().getAttribute(ServletContextConfigInitializer.CONFIG_REPOSITORY);

        System.out.println("Config Repository get curModel : " + configRepository.get("curModel", this.getClass().getClassLoader(), String.class));

        // ThreadLocal 获取
        System.out.println("Config ThreadLocal get curModel : " + ConfigRepositoryThreadLocal.get("curModel", String.class));
```