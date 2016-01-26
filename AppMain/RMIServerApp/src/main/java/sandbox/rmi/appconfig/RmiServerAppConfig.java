package sandbox.rmi.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import sandbox.rmi.service.AccountService;
import sandbox.rmi.service.IAccountService;

@Configuration
public class RmiServerAppConfig {
	
	@Bean
	public IAccountService accountService() {
		return new AccountService();
	}

	@Bean
	public RmiServiceExporter rmiServiceExporter(AccountService accountService) {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setServiceName("AccountService");
		rmiServiceExporter.setService(accountService);
		rmiServiceExporter.setServiceInterface(IAccountService.class);
		rmiServiceExporter.setRegistryPort(1199);
		return rmiServiceExporter;
	}
}
