package cn.itcast.user.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private Long id;
    private String username;
    private String address;
}