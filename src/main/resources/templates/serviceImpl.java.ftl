package ${package.ServiceImpl};

import ${package.Service}.${table.serviceName};
import org.springframework.stereotype.Service;

/**
 * <p>
 * ${table.comment!}服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
<#if kotlin>
open class ${table.serviceImplName} , ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} implements ${table.serviceName} {

}
</#if>
