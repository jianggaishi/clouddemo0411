package cn.itcast.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
//@ConfigurationProperties(prefix = "pattern")
public class Pattern {
    @Value("${pattern.datefomat}")
    private String datefomat;
}
