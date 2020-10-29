package cool.spongecaptain.springxmlsample.handler;

import cool.spongecaptain.springxmlsample.config.MyApplicationConfig;
import cool.spongecaptain.springxmlsample.config.MyServiceBean;
import cool.spongecaptain.springxmlsample.parser.SpongecaptainBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class SpongecaptainNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        //注意，我们这里使用自己的配置类
        super.registerBeanDefinitionParser("myapplication", new SpongecaptainBeanDefinitionParser(MyApplicationConfig.class));
        super.registerBeanDefinitionParser("myservice", new SpongecaptainBeanDefinitionParser(MyServiceBean.class));
    }
}
