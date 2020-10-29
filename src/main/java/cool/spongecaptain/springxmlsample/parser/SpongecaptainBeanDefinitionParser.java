package cool.spongecaptain.springxmlsample.parser;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class SpongecaptainBeanDefinitionParser implements BeanDefinitionParser {

    private final Class<?> beanClass;

    public SpongecaptainBeanDefinitionParser(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    private static BeanDefinition parse(Element element, ParserContext parserContext, Class<?> beanClass) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanClass);
        beanDefinition.setLazyInit(false);
        String name = element.getAttribute("name");
        beanDefinition.getPropertyValues().addPropertyValue("name", name);
        parserContext.getRegistry().registerBeanDefinition(name, beanDefinition);
        return beanDefinition;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        return parse(element, parserContext, beanClass);
    }
}

