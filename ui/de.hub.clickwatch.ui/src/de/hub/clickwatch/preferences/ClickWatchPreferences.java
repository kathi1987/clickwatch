package de.hub.clickwatch.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.ClickWatchModuleUtil.ValueType;
import de.hub.clickwatch.ui.PluginActivator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class ClickWatchPreferences extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public ClickWatchPreferences() {
		super(GRID);
		setPreferenceStore(PluginActivator.getInstance().getPreferenceStore());
		setDescription("Preferences for everything regarding ClickWatch itself.");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(
				PreferenceConstants.BIND_TO_PLAYER,
				"&Connect to recorded simulation of ClickNodes instead of using real to connections to real click instances.",
				getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.HANDLER_BEHAVIOUR,
				"Handler Behaviour",
				4,
				new String[][] {
						{ "DEFAULT", HandlerBehaviour.DEFAULT.toString() },
						{ "COMPOUND", HandlerBehaviour.COMPOUND.toString() },
						{ "COMPOUND_RECORDING",
								HandlerBehaviour.COMPOUND_RECORDING.toString() },
						{
								"COMPOUND_RECORDING_DIFFERENCES",
								HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES
										.toString() } },
				getFieldEditorParent(), true));

		addField(new RadioGroupFieldEditor(PreferenceConstants.VALUE_TYPE,
				"&Debug level", 4, new String[][] {
						{ "Specific", ValueType.SPECIFIC.toString() },
						{ "String", ValueType.STRING.toString() },
						{ "XML", ValueType.XML.toString() } },
				getFieldEditorParent(), true));

		addField(new RadioGroupFieldEditor(PreferenceConstants.DEBUG_LEVEL,
				"&Debug level", 4,
				new String[][] { { "Error", "1" }, { "Warning", "2" },
						{ "Info", "3" }, { "Debug", "4" } },
				getFieldEditorParent(), true));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}