package cn.itcast.user.web;

import cn.itcast.user.pojo.Pattern;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;
//    @Value("${pattern.dateformat}")
//    private String dataformat;
    @Autowired
    private Pattern pattern;
    @GetMapping("/now")
    public String now(){
//        System.out.println(dataformat);
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern.getDatefomat()));
//        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dataformat));

    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }



}
