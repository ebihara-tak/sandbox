package sandbox.rmi.client;

import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import sandbox.rmi.service.IAccountService;
import sandbox.rmi.struct.IAccount;

public class RmiCallClientApp {

	public static void main(String[] args) {
		new RmiCallClientApp().doMain();
	}

	private void doMain() {
		RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
		rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1199/AccountService");
		rmiProxyFactoryBean.setServiceInterface(IAccountService.class);
		rmiProxyFactoryBean.afterPropertiesSet();
		IAccountService accountService = (IAccountService) rmiProxyFactoryBean.getObject();
		getAccount(accountService, "test1");
		getAccount(accountService, "test2");
		getAccount(accountService, "test3");
	}

	private IAccount getAccount(IAccountService accountService, String name) {
		IAccount account1 = accountService.getAccount(name);
		System.out.println(account1);
		return account1;
	}

}
