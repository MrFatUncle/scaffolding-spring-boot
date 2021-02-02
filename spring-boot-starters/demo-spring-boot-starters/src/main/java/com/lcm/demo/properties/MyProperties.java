/**
 * FileName: MyProperties
 * Author:   liaocm
 * Date:     2021/2/2 10:34
 * Description:
 * History:
 */
package com.lcm.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
/**
 * 注入的配置前缀，需要配合 @EnableConfigurationProperties使用
 */
@ConfigurationProperties(prefix = "my.demo")
public class MyProperties {

    private String value;
}
