package sandbox.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sandbox.rmi.appconfig.RmiServerAppConfig;

public class RmiServerApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RmiServerAppConfig.class);
	}
}
