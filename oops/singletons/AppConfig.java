package oops.singletons;

public class AppConfig {
	
	private AppConfig(){
		
	}
	
	private static AppConfig obj = null;			//By this, every time a new object will not be initializing
	
	public static AppConfig getInstance() {
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
		
	}

}
