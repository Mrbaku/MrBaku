package Day50_inheritance03;

public class AppFactory {
	public static void main(String[] args) {
		
	
	IphoneApp iApp = new IphoneApp(null);
	IphoneApp iApp1 = new IphoneApp("Uber");
	
	AndroidApp andrApp = new AndroidApp();
	AndroidApp andrApp1 = new AndroidApp("Lyft");
	
	System.out.println(iApp.getName());
	System.out.println(iApp1.getName());
	
	System.out.println(andrApp.getName());
	System.out.println(andrApp1.getName());
	
	App.count= 33;
	System.out.println(iApp.count);
	
	AndroidApp.count= 100;
	System.out.println(App.count);
	System.out.println(IphoneApp.count);
	System.out.println(AndroidApp.count);
	
	App.build("Swift");
	IphoneApp.build("Objective C");
	AndroidApp.build("Java");
	
	
	
	
	
	}
}
