/**
 * FileName: MyAutoConfiguration
 * Author:   liaocm
 * Date:     2021/2/2 10:08
 * Description:
 * History:
 */
package com.lcm.demo.config;

import com.lcm.demo.properties.MyProperties;
import com.lcm.scaffolding.Demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 配置
 */
@AllArgsConstructor

/**
 * 1.@Configuration相当于XML注入，和@Bean配合使用
 * 2.@Configurable 用于new对象时注入spring容器，配合切面使用
 */
@Configuration

/**
 * 配合 ConfigurationProperties使用，注入配置
 */
@EnableConfigurationProperties(MyProperties.class)

/**
 * 源码解析，当从类路径能找到Demo.class类时，才注入 MyAutoConfiguration
 * @ConditionalOnBean 当容器中有name为XXX的Bean时才注入
 */
@ConditionalOnClass(Demo.class)

/**
 * 1.prefix 前缀
 * 2.value 拼接前缀路径
 * 3.name 完整路径
 * 4.hasValue 有值时才注入
 * 5.matchIfMissing true-缺少值时也可以注入，false-缺少值时不注入，默认为false
 */
@ConditionalOnProperty(prefix = "my.demo", value = "enabled", matchIfMissing = true)
public class MyAutoConfiguration {
}
