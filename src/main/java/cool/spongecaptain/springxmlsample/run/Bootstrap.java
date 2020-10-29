package cool.spongecaptain.springxmlsample.run;

import cool.spongecaptain.springxmlsample.config.MyApplicationConfig;
import cool.spongecaptain.springxmlsample.config.MyServiceBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:spongecaptain.xml"})
@SpringBootApplication
public class Bootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Bootstrap.class, args);
        MyServiceBean serviceBean = applicationContext.getBean(MyServiceBean.class);
        System.out.println(serviceBean.getName());
        MyApplicationConfig applicationConfig = applicationContext.getBean(MyApplicationConfig.class);
        System.out.println(applicationConfig.getName());
    }
}
