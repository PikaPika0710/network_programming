package model.DAO;

import java.util.ArrayList;

import model.BEAN.Wife;

public class CheckLoginDAO {
	private CheckLoginDAO() {

	}

	public static boolean isValid(String usr, String pw) {
		return true;
	}

	public static ArrayList<Wife> getWifeList(String username) {
		ArrayList<Wife> result = new ArrayList<>();
		Wife w1 = new Wife();
		w1.setName("abc");
		w1.setAddress("quang nam");
		w1.setAlive(true);
		result.add(w1);

		Wife w2 = new Wife();
		w2.setName("xyz");
		w2.setAddress("da nang");
		w2.setAlive(true);
		result.add(w2);

		return result;
	}
}
