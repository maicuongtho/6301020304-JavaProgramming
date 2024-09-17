
public class Apps {
	public static void main(String[] args) {
		Citizen c1 = new Citizen();
		c1.setId("007");
		c1.setName("Jame Bond");
		c1.setGender("male");
		c1.setNation("US");
		c1.setYear((short)1934);
		System.out.println(c1.toString());
		
		Citizen c2 = new Citizen("008","Jerry",(short)1945,"female","EN");
		System.out.println(c2.toString());
		
	}

}
