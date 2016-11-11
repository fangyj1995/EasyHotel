package com.nju.easyhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
/*SpringApplication是Spring Boot框架中描述Spring应用的类,它的run()方法会创建一个Spring应用上下文
 * （Application Context）扫描当前应用类路径上的依赖，例如本例中发现spring-webmvc
 * （由 spring-boot-starter-web传递引入）在类路径中，那么Spring Boot会判断这是一个Web应用，
并启动一个内嵌的Servlet容器（默认是Tomcat）用于处理HTTP请求。*/
/*
 * Spring WebMvc框架会将Servlet容器里收到的HTTP请求根据路径分发给对应的@Controller类进行处理，
 * @RestController是一类特殊的@Controller，它的返回值直接作为HTTP Response的Body部分返回给浏览器。
 * */
public class TestApplication {
	@RequestMapping("/")
    /*
     * @RequestMapping注解表明该方法处理那些URL对应的HTTP请求，也就是我们常说的URL路由（routing)，
     * 请求的分发工作是由Spring完成的。
     *  "/"用来匹配url请求
     */
    public String greeting() {
        return "Hello World!";//返回值直接作为HTTP Response的Body部分返回给浏览器
    }
    @RequestMapping("/fang")
    public String fang(){
    	return "hello fang!";
    }
    /*URL中的变量可以用{variableName}来表示，同时在方法的参数中加上@PathVariable("variableName")，
         那么当请求被转发给该方法处理时，对应的URL中的变量会被自动赋值给被@PathVariable注解的参数（能够自动根据参数类型赋值，例如上例中的int）
    */
    @RequestMapping("/users/{username}")
    public String userProfile(@PathVariable("username") String username) {//这个注解表明username参数是url中的变量uesrname
        return String.format("welcome user %s", username);
    }
    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id) {
        return String.format("this is post %d", id);
    }
    //支持HTTP方法
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet() {
        return "this is Login Page";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost() {
        return "Login Post Request";
    }
    /*
     * Spring MVC最新的版本中提供了一种更加简洁的配置HTTP方法的方式，增加了四个标注：

    @PutMapping
    @GetMapping
    @PostMapping
    @DeleteMapping

          在Web应用中常用的HTTP方法有四种：

    PUT方法用来添加资源
    GET方法用来获取已有的资源
    POST方法用来对资源进行状态转换
    DELETE方法用来删除已有的资源
     * */

}
