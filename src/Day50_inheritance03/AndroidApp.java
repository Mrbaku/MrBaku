package Day50_inheritance03;

public class AndroidApp extends App {

		private String developer;
		
		public AndroidApp(String name) {
			super(name);
		}
		public AndroidApp() {
			super("AndroidApp - unknown");
		}

		public String getDeveloper() {
			return developer;
		}

		public void setDeveloper(String developer) {
			this.developer = developer;
		}
		
		
}
