package Day45_encapsulation_practice;

public class EtsyDotCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EtsyAccount acct = new EtsyAccount();
		System.out.println(acct.toString());

		acct.setEmail("sultan-ov@hotmail.com");
		acct.setFirstName("Orhan");
		acct.setPassWord("bulgaria123");

		System.out.println(acct.toString());

		EtsyAccount acct1 = new EtsyAccount();
		acct1.setEmail("orhahd.info");
		acct1.setFirstName("helivera123");
		acct1.setPassWord("abc12");

		System.out.println(acct1.toString());

		EtsyAccount acct2 = new EtsyAccount("orhahd@info.com", "helivera", "abc1234");
		System.out.println(acct2.toString());

		EtsyAccount acct3 = new EtsyAccount("Woodenspoon@gmail.com", "WdSpoon");
		System.out.println(acct3.toString());

	}

}
