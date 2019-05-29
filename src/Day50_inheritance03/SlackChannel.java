package Day50_inheritance03;

public class SlackChannel {

	public static void main(String[] args) {
		SlackUser slack = new SlackUser("Nadir");
		AdminUser admin = new AdminUser("Florian");

		slack.sendAMessage(
				"This Thursday, we will summarize Jira management tool, "
				+ "and focus on Jira Xray plug in / add on. Please prepare your questions on Jira. Also, we will continue "
				+ "reviewing testing types, and specifically go over smoke test suite and see the example.");
		admin.sendAMessage("Florian is sneding message, saying Thank you");

	}
    public static void main ( String[ ] args) {

        int[ ]  arr = { 1,  2,  3,  4,  5 };

         arr[0]  = arr[ arr.length-1];

        arr[ arr.length-1]  = arr[0];

System.out.println( Arrays.toString( arr) );

}
}
