package Demo;

public class WhiteCloud implements Cloud {

	@Override
	public void color(String color) {
		System.out.println(color);
	}

	@Override
	public void say(String str) {
		System.out.println("say "+str);
		
	}

}
