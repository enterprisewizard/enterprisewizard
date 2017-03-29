package dwz.framework.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContainer implements ApplicationContextAware {

	private static ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		SpringContainer.ctx = ctx;
	}
	public static Object getBean(String beanName){
		return ctx.getBean(beanName);
	}

}
