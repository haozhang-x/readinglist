package cn.mycloudx.readinglist.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhanghao
 * @date 2018/05/26
 */
public class JdbcTemplateCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        try {
            context.getClassLoader().loadClass("org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
