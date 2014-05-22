package vn.fpt.robot.plugin.preferences;

import robot_plugin.Activator;

public class PrefUtils {
	public static String getRobotSDKLocation(){
		return Activator.getDefault().getPreferenceStore().getString("Robot SDK");
	}
}
