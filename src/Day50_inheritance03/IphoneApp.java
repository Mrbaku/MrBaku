package Day50_inheritance03;

public class IphoneApp extends App {

	private String developer;

	public IphoneApp(String name) {
		super(name);

	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

}
