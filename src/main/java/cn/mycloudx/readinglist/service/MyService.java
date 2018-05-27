package cn.mycloudx.readinglist.service;

import cn.mycloudx.readinglist.condition.JdbcTemplateCondition;
import org.springframework.context.annotation.Conditional;

/**
 * @author zhanghao
 * @date 2018/05/26
 */
@Conditional(value = JdbcTemplateCondition.class)
public class MyService  {
}
