package com.jdbc.myAssignment;

public class ClintMasterPractice {
	public static void main(String[] args) {
		ClintMaster master = new ClintMaster();
		master.setClint_no("1");
		master.setName("Ivan");
		master.setAddress1("A-1");
		master.setAddress2("film city");
		master.setCity("Bombay");
		master.setState("Maharastra");
		master.setPincode(400054);
		master.setBal_due(15000);
		//ClintMasterp.insert(master);

		master.setClint_no("2");
		master.setName("Vandana");
		master.setAddress1("B-1");
		master.setAddress2("see point");
		master.setCity("Madras");
		master.setState("Tamilnadu");
		master.setPincode(780001);
		master.setBal_due(0);
		ClintMasterp.insert(master);

		master.setClint_no("3");
		master.setName("Pramada");
		master.setAddress1("C-1");
		master.setAddress2("film city");
		master.setCity("Bombay");
		master.setState("Maharashtra");
		master.setPincode(400057);
		master.setBal_due(5000);
		ClintMasterp.insert(master);

		master.setClint_no("4");
		master.setName("Basu");
		master.setAddress1("D-1");
		master.setAddress2("film city");
		master.setCity("Bombay");
		master.setState("Maharashtra");
		master.setPincode(400056);
		master.setBal_due(0);
		ClintMasterp.insert(master);

		master.setClint_no("5");
		master.setName("Ravi");
		master.setAddress1("E-1");
		master.setAddress2("india gate");
		master.setCity("Delhi");
		master.setState("Delhi");
		master.setPincode(100001);
		master.setBal_due(2000);
		ClintMasterp.insert(master);

		master.setClint_no("6");
		master.setName("Rukmini");
		master.setAddress1("F-1");
		master.setAddress2("film city");
		master.setCity("Bombay");
		master.setState("Maharashtra");
		master.setPincode(400050);
		master.setBal_due(0);
		ClintMasterp.insert(master);
	}
}
