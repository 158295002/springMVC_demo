springmvc-servlet.xml这个是spring2.5之前的版本，实现controller接口
配置文件的引入查看默认的spring配置文件

spring-servlet.xml2.5是2.5之后的版本能支持注解的方式
@Controller：用于标识是处理器类；
@RequestMapping：请求到处理器功能方法的映射规则；
@RequestParam：请求参数到处理器功能处理方法的方法参数上的绑定；
@ModelAttribute：请求参数到命令对象的绑定；
@SessionAttributes：用于声明session级别存储的属性，放置在处理器类上，通常列出模型
