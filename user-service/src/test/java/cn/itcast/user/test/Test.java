package cn.itcast.user.test;

import cn.itcast.user.UserApplication;
import cn.itcast.user.web.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = UserApplication.class)
public class Test {
    @Autowired
    private ApplicationContext applicationContext;

//    private WebApplicationContext webApplicationContext;

    @org.junit.jupiter.api.Test
    void soutApplicationcontext(){
        UserController bean1 = applicationContext.getBean(UserController.class);
//        UserController bean = ContextLoaderListener.getCurrentWebApplicationContext().getBean(UserController.class);
//        System.out.println(bean.equals(bean1));
    }
}
