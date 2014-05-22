package vn.fpt.robot.plugin.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import robot_plugin.Activator;


public class RobotPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {		
		addField(new DirectoryFieldEditor("Robot SDK", "Robot SDK Location:",
				getFieldEditorParent()));
	}

	@Override
	public boolean performOk() {
		return super.performOk();
	}
}
