package Day51_inheritance04;

public class AtTheGym {

	public static void main(String[] args) {
		
			
		Exercise exc = new Exercise();
		Running run = new Running();
		Swimming swim = new Swimming();
		Yoga yog = new Yoga();
		JiuJitsu jiu = new JiuJitsu();
		Sprinting sp = new Sprinting();
		
		System.out.println(exc.perform(30));
		System.out.println(run.perform(40));
		System.out.println(swim.perform(45));
		System.out.println(yog.perform(60));
		System.out.println(jiu.perform(60));
		System.out.println(sp.perform(25));
		
		Snowboarding sm = new Snowboarding();
		System.out.println(sm.perform(100));
	}

}
