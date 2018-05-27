package cn.mycloudx.readinglist.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhanghao
 * @date 2018/05/26
 */
@Component
@ConfigurationProperties(prefix = "amazon")
@Data
public class AmazonProperties {
    private String associateId;
}
