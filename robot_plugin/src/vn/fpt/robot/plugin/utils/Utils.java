package vn.fpt.robot.plugin.utils;

public class Utils {
	/**
	 * 
	 * @param label
	 *            , contain ":", example API 11: Android 3.0 (Honeycomb)
	 * @return integer version API
	 */
	public static int toVersionAPI(String label) {
		int number = -1;
		if (label == null || label.trim().equals("")) {
			return -1;
		}
		try {
			String api = label.split(":")[0];
			number = Integer.parseInt(api.split("\\s+")[1]);
		} catch (Exception e) {
			return -1;
		}
		return number;
	}
}
