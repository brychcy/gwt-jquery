package com.xedge.jquery.ui.client;

import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.JsDate;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.client.js.JavaScriptStringArray;
import com.xedge.jquery.ui.client.effects.EffectOptions;
import com.xedge.jquery.ui.client.handlers.DatepickerEventHandler;
import com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler;
import com.xedge.jquery.ui.client.model.AccordionOptions;
import com.xedge.jquery.ui.client.model.AutoCompleteOptions;
import com.xedge.jquery.ui.client.model.ButtonIcons;
import com.xedge.jquery.ui.client.model.ButtonOptions;
import com.xedge.jquery.ui.client.model.DatepickerOptions;
import com.xedge.jquery.ui.client.model.DialogOptions;
import com.xedge.jquery.ui.client.model.DraggableOptions;
import com.xedge.jquery.ui.client.model.DroppableOptions;
import com.xedge.jquery.ui.client.model.ProgressbarOptions;
import com.xedge.jquery.ui.client.model.ResizeableOptions;
import com.xedge.jquery.ui.client.model.SelectableOptions;
import com.xedge.jquery.ui.client.model.SliderOptions;
import com.xedge.jquery.ui.client.model.SortableOptions;
import com.xedge.jquery.ui.client.model.TabsOptions;
import com.xedge.jquery.ui.client.model.AccordionOptions.AccordionBooleanOption;
import com.xedge.jquery.ui.client.model.AccordionOptions.AccordionIntegerOption;
import com.xedge.jquery.ui.client.model.AccordionOptions.AccordionOptionParameters;
import com.xedge.jquery.ui.client.model.AccordionOptions.AccordionStringOption;
import com.xedge.jquery.ui.client.model.AutoCompleteOptions.AutoCompleteBooleanOption;
import com.xedge.jquery.ui.client.model.AutoCompleteOptions.AutoCompleteIntegerOption;
import com.xedge.jquery.ui.client.model.AutoCompleteOptions.AutoCompleteOptionParameters;
import com.xedge.jquery.ui.client.model.AutoCompleteOptions.AutoCompleteStringOption;
import com.xedge.jquery.ui.client.model.ButtonOptions.ButtonBooleanOption;
import com.xedge.jquery.ui.client.model.ButtonOptions.ButtonOptionParameters;
import com.xedge.jquery.ui.client.model.ButtonOptions.ButtonStringOption;
import com.xedge.jquery.ui.client.model.DatepickerOptions.DatepickerBooleanOption;
import com.xedge.jquery.ui.client.model.DatepickerOptions.DatepickerDateOption;
import com.xedge.jquery.ui.client.model.DatepickerOptions.DatepickerIntegerOption;
import com.xedge.jquery.ui.client.model.DatepickerOptions.DatepickerOptionParameters;
import com.xedge.jquery.ui.client.model.DatepickerOptions.DatepickerStringOption;
import com.xedge.jquery.ui.client.model.DialogOptions.DialogBooleanOption;
import com.xedge.jquery.ui.client.model.DialogOptions.DialogIntegerOption;
import com.xedge.jquery.ui.client.model.DialogOptions.DialogOptionParameters;
import com.xedge.jquery.ui.client.model.DialogOptions.DialogStringOption;
import com.xedge.jquery.ui.client.model.DraggableOptions.DraggableBooleanOption;
import com.xedge.jquery.ui.client.model.DraggableOptions.DraggableDoubleOption;
import com.xedge.jquery.ui.client.model.DraggableOptions.DraggableIntegerOption;
import com.xedge.jquery.ui.client.model.DraggableOptions.DraggableStringOption;
import com.xedge.jquery.ui.client.model.DroppableOptions.DroppableBooleanOption;
import com.xedge.jquery.ui.client.model.DroppableOptions.DroppableStringOption;
import com.xedge.jquery.ui.client.model.ProgressbarOptions.ProgressbarBooleanOption;
import com.xedge.jquery.ui.client.model.ProgressbarOptions.ProgressbarOptionParameters;
import com.xedge.jquery.ui.client.model.ResizeableOptions.ResizeableBooleanOption;
import com.xedge.jquery.ui.client.model.ResizeableOptions.ResizeableDoubleOption;
import com.xedge.jquery.ui.client.model.ResizeableOptions.ResizeableIntegerOption;
import com.xedge.jquery.ui.client.model.ResizeableOptions.ResizeableStringOption;
import com.xedge.jquery.ui.client.model.SelectableOptions.SelectableBooleanOption;
import com.xedge.jquery.ui.client.model.SelectableOptions.SelectableIntegerOption;
import com.xedge.jquery.ui.client.model.SelectableOptions.SelectableOptionParameters;
import com.xedge.jquery.ui.client.model.SelectableOptions.SelectableStringOption;
import com.xedge.jquery.ui.client.model.SliderOptions.SliderBooleanOption;
import com.xedge.jquery.ui.client.model.SliderOptions.SliderIntegerOption;
import com.xedge.jquery.ui.client.model.SliderOptions.SliderOptionParameters;
import com.xedge.jquery.ui.client.model.SliderOptions.SliderStringOption;
import com.xedge.jquery.ui.client.model.SortableOptions.SortableBooleanOption;
import com.xedge.jquery.ui.client.model.SortableOptions.SortableDoubleOption;
import com.xedge.jquery.ui.client.model.SortableOptions.SortableIntegerOption;
import com.xedge.jquery.ui.client.model.SortableOptions.SortableOptionParameters;
import com.xedge.jquery.ui.client.model.SortableOptions.SortableStringOption;
import com.xedge.jquery.ui.client.model.TabsOptions.TabsBooleanOption;
import com.xedge.jquery.ui.client.model.TabsOptions.TabsIndexedOptionParameters;
import com.xedge.jquery.ui.client.model.TabsOptions.TabsIntegerOption;
import com.xedge.jquery.ui.client.model.TabsOptions.TabsOptionParameters;
import com.xedge.jquery.ui.client.model.TabsOptions.TabsStringOption;

/**
 * 
 * @author joe
 * 
 */
public class JQueryUI extends JQuery {

	public enum Axis {
		x, y
	}

	public enum HelperType {
		original, clone
	}

	public enum OptionParameters {
		destroy, disable, enable
	}

	public enum Effect {
		blind, bounce, clip, drop, explode, fold,fade, highlight, puff, pulsate, scale, shake, size, slide, transfer, bounceslide
	}

	public enum Orientation {
		horizontal, vertical
	}
	
	public enum Mode {
		show, hide
	}
	public enum Scale {
		box, content
	}
	
	
	public enum Direction {
		up, down, left, right
	}


	protected JQueryUI() {
	}

	/**
	 * Use defaults for draggable
	 * 
	 * @return
	 */
	public final native JQueryUI draggable() /*-{
		return this.draggable();
	}-*/;

	/**
	 * Set multiple draggable options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI draggable(DraggableOptions options) /*-{
		return this.draggable(options);
	}-*/;

	/**
	 * destroy : Remove the draggable functionality completely. This will return the element back to its pre-init state. disable : Disable the draggable. enable : Enable the draggable.
	 * 
	 * @param draggableParameters
	 * @return
	 */
	public final JQueryUI draggable(OptionParameters draggableParameters) {
		return this.draggable(draggableParameters.name());
	}

	private final native JQueryUI draggable(String draggableParameters) /*-{
		return this.draggable(draggableParameters);
	}-*/;

	/**
	 * Set a string draggable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI draggableSetStringOption(DraggableStringOption draggableStringOption, String optionValue) {
		return this.draggableSetStringOption(draggableStringOption.name(), optionValue);
	}

	private final native JQueryUI draggableSetStringOption(String optionName, String optionValue) /*-{
		return this.draggable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string draggable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String draggableGetStringOption(DraggableStringOption draggableStringOptionn) {
		return this.draggableGetStringOption(draggableStringOptionn.name());
	}

	private final native String draggableGetStringOption(String optionName) /*-{
		return this.draggable("option",optionName);
	}-*/;

	/**
	 * Set an integer draggable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI draggableSetIntegerOption(DraggableIntegerOption draggableIntegerOption, int optionValue) {
		return this.draggableSetIntegerOption(draggableIntegerOption.name(), optionValue);
	}

	private final native JQueryUI draggableSetIntegerOption(String optionName, int optionValue) /*-{
		return this.draggable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer draggable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final int draggableGetIntegerOption(DraggableIntegerOption draggableIntegerOption) {
		return this.draggableGetIntegerOption(draggableIntegerOption.name());
	}

	private final native int draggableGetIntegerOption(String optionName) /*-{
		return this.draggable("option",optionName);
	}-*/;

	/**
	 * Set a boolean draggable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI draggableSetBooleanOption(DraggableBooleanOption draggableBooleanOption, boolean optionValue) {
		return this.draggableSetBooleanOption(draggableBooleanOption.name(), optionValue);
	}

	private final native JQueryUI draggableSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.draggable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean draggable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final boolean draggableGetBooleanOption(DraggableBooleanOption draggableBooleanOption) {
		boolean draggableOption = false;
		try {
			draggableOption = this.draggableGetBooleanOption(draggableBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in draggableGetBooleanOption " + draggableBooleanOption.name());
		}
		return draggableOption;
	}

	private final native boolean draggableGetBooleanOption(String optionName) /*-{
		return this.draggable("option",optionName);
	}-*/;

	/**
	 * Set a double draggable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI draggableSetDoubleOption(DraggableDoubleOption draggableDoubleOption, double optionValue) {
		return this.draggableSetDoubleOption(draggableDoubleOption.name(), optionValue);
	}

	private final native JQueryUI draggableSetDoubleOption(String optionName, double optionValue) /*-{
		return this.draggable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a double draggable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final double draggableGetDoubleOption(DraggableDoubleOption draggableDoubleOption) {
		double draggableOption = -1;
		try {
			draggableOption = this.draggableGetDoubleOption(draggableDoubleOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in draggableGetDoubleOption " + draggableDoubleOption.name());
		}
		return draggableOption;
	}

	private final native double draggableGetDoubleOption(String optionName) /*-{
		return this.draggable("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-draggable element.
	 * 
	 * @return
	 */
	public final native JQueryUI draggableWidget() /*-{
		return this.draggable("widget");
	}-*/;

	/**
	 * Use defaults for droppable
	 * 
	 * @return
	 */
	public final native JQueryUI droppable() /*-{
		return this.droppable();
	}-*/;

	/**
	 * Set multiple droppable options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI droppable(DroppableOptions options) /*-{
		return this.droppable(options);
	}-*/;

	/**
	 * destroy : Remove the droppable functionality completely. This will return the element back to its pre-init state. disable : Disable the droppable . enable : Enable the droppable .
	 * 
	 * @param droppableParameters
	 * @return
	 */
	public final JQueryUI droppable(OptionParameters droppableParameters) {
		return this.droppable(droppableParameters.name());
	}

	private final native JQueryUI droppable(String droppableParameters) /*-{
		return this.droppable(droppableParameters);
	}-*/;

	/**
	 * Set a string droppable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI droppableSetStringOption(DroppableStringOption droppableStringOption, String optionValue) {
		return this.droppableSetStringOption(droppableStringOption.name(), optionValue);
	}

	private final native JQueryUI droppableSetStringOption(String optionName, String optionValue) /*-{
		return this.droppable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string droppable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String droppableGetStringOption(DroppableStringOption droppableStringOption) {
		return this.droppableGetStringOption(droppableStringOption.name());
	}

	private final native String droppableGetStringOption(String optionName) /*-{
		return this.droppable("option",optionName);
	}-*/;

	/**
	 * Set a boolean droppable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI droppableSetBooleanOption(DroppableBooleanOption droppableBooleanOption, boolean optionValue) {
		return this.droppableSetBooleanOption(droppableBooleanOption.name(), optionValue);
	}

	private final native JQueryUI droppableSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.droppable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean droppable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final boolean droppableGetBooleanOption(DroppableBooleanOption droppableBooleanOption) {
		return this.droppableGetBooleanOption(droppableBooleanOption.name());
	}

	private final native boolean droppableGetBooleanOption(String optionName) /*-{
		return this.droppable("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-droppable element.
	 * 
	 * @return
	 */
	public final native JQueryUI droppableWidget() /*-{
		return this.droppable("widget");
	}-*/;

	/**
	 * Use defaults for resizeable
	 * 
	 * @return
	 */
	public final native JQueryUI resizable() /*-{
		return this.resizable();
	}-*/;

	/**
	 * Set multiple resizable options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI resizable(ResizeableOptions options) /*-{
		return this.resizable(options);
	}-*/;

	/**
	 * destroy : Remove the resizable functionality completely. This will return the element back to its pre-init state. disable : Disable the resizable. enable : Enable the resizable.
	 * 
	 * @param resizableParameters
	 * @return
	 */
	public final JQueryUI resizable(OptionParameters resizableParameters) {
		return this.resizable(resizableParameters.name());
	}

	private final native JQueryUI resizable(String resizableParameters) /*-{
		return this.resizable(resizableParameters);
	}-*/;

	/**
	 * Set a string resizable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI resizableSetStringOption(ResizeableStringOption resizableStringOption, String optionValue) {
		return this.resizableSetStringOption(resizableStringOption.name(), optionValue);
	}

	private final native JQueryUI resizableSetStringOption(String optionName, String optionValue) /*-{
		return this.resizable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string resizable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String resizableGetStringOption(ResizeableStringOption resizableStringOptionn) {
		String option = null;
		try {
			option = this.resizableGetStringOption(resizableStringOptionn.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in resizableGetStringOption " + resizableStringOptionn.name());
		}
		return option;
	}

	private final native String resizableGetStringOption(String optionName) /*-{
		return this.resizable("option",optionName);
	}-*/;

	/**
	 * Set an integer resizable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI resizableSetIntegerOption(ResizeableIntegerOption resizableIntegerOption, int optionValue) {
		return this.resizableSetIntegerOption(resizableIntegerOption.name(), optionValue);
	}

	private final native JQueryUI resizableSetIntegerOption(String optionName, int optionValue) /*-{
		return this.resizable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer resizable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer resizableGetIntegerOption(ResizeableIntegerOption resizableIntegerOption) {
		Integer option = null;
		try {
			option = this.resizableGetIntegerOption(resizableIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in resizableGetIntegerOption " + resizableIntegerOption.name());
		}
		return option;
	}

	private final native int resizableGetIntegerOption(String optionName) /*-{
		return this.resizable("option",optionName);
	}-*/;

	/**
	 * Set a boolean resizable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI resizableSetBooleanOption(ResizeableBooleanOption resizableBooleanOption, boolean optionValue) {
		return this.resizableSetBooleanOption(resizableBooleanOption.name(), optionValue);
	}

	private final native JQueryUI resizableSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.resizable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean resizable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean resizableGetBooleanOption(ResizeableBooleanOption resizableBooleanOption) {
		Boolean option = null;
		try {
			option = this.resizableGetBooleanOption(resizableBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in resizableGetBooleanOption " + resizableBooleanOption.name());
		}
		return option;
	}

	private final native boolean resizableGetBooleanOption(String optionName) /*-{
		return this.resizable("option",optionName);
	}-*/;

	/**
	 * Set a double resizable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI resizableSetDoubleOption(ResizeableDoubleOption resizableDoubleOption, double optionValue) {
		return this.resizableSetDoubleOption(resizableDoubleOption.name(), optionValue);
	}

	private final native JQueryUI resizableSetDoubleOption(String optionName, double optionValue) /*-{
		return this.resizable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a double resizable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Double resizableGetDoubleOption(ResizeableDoubleOption resizableDoubleOption) {
		Double option = null;
		try {
			option = this.resizableGetDoubleOption(resizableDoubleOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in resizableGetDoubleOption " + resizableDoubleOption.name());
		}
		return option;
	}

	private final native double resizableGetDoubleOption(String optionName) /*-{
		return this.resizable("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-resizable element.
	 * 
	 * @return
	 */
	public final native JQueryUI resizableWidget() /*-{
		return this.resizable("widget");
	}-*/;

	/**
	 * Use defaults for selectable
	 * 
	 * @return
	 */
	public final native JQueryUI selectable() /*-{
		return this.selectable();
	}-*/;

	public final native JQueryUI disableSelection() /*-{
	return this.disableSelection();
}-*/;
	
	/**
	 * Set multiple selectable options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI selectable(SelectableOptions options) /*-{
		return this.selectable(options);
	}-*/;

	/**
	 * destroy : Remove the selectable functionality completely. This will return the element back to its pre-init state. disable : Disable the selectable. enable : Enable the selectable. refresh : Refresh the position and size of each selectee element. This method can be used to manually recalculate the position and size of each selectee element. Very useful if autoRefresh is set to false.
	 * 
	 * @param selectableParameters
	 * @return
	 */
	public final JQueryUI selectable(SelectableOptionParameters selectableParameters) {
		return this.selectable(selectableParameters.name());
	}

	private final native JQueryUI selectable(String selectableParameters) /*-{
		return this.selectable(selectableParameters);
	}-*/;

	/**
	 * Set a string selectable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI selectableSetStringOption(SelectableStringOption selectableStringOption, String optionValue) {
		return this.selectableSetStringOption(selectableStringOption.name(), optionValue);
	}

	private final native JQueryUI selectableSetStringOption(String optionName, String optionValue) /*-{
		return this.selectable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string selectable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String selectableGetStringOption(SelectableStringOption selectableStringOption) {
		String option = null;
		try {
			option = this.selectableGetStringOption(selectableStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in selectableGetStringOption " + selectableStringOption.name());
		}
		return option;
	}

	private final native String selectableGetStringOption(String optionName) /*-{
		return this.selectable("option",optionName);
	}-*/;

	/**
	 * Set an integer selectable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI selectableSetIntegerOption(SelectableIntegerOption selectableIntegerOption, int optionValue) {
		return this.selectableSetIntegerOption(selectableIntegerOption.name(), optionValue);
	}

	private final native JQueryUI selectableSetIntegerOption(String optionName, int optionValue) /*-{
		return this.selectable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer selectable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer selectableGetIntegerOption(SelectableIntegerOption selectableIntegerOption) {
		Integer option = null;
		try {
			option = this.selectableGetIntegerOption(selectableIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in selectableGetIntegerOption " + selectableIntegerOption.name());
		}
		return option;
	}

	private final native int selectableGetIntegerOption(String optionName) /*-{
		return this.selectable("option",optionName);
	}-*/;

	/**
	 * Set a boolean selectable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI selectableSetBooleanOption(SelectableBooleanOption selectableBooleanOption, boolean optionValue) {
		return this.selectableSetBooleanOption(selectableBooleanOption.name(), optionValue);
	}

	private final native JQueryUI selectableSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.selectable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean selectable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean selectableGetBooleanOption(SelectableBooleanOption selectableBooleanOption) {
		Boolean option = null;
		try {
			option = this.selectableGetBooleanOption(selectableBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in selectableGetBooleanOption " + selectableBooleanOption.name());
		}
		return option;
	}

	private final native boolean selectableGetBooleanOption(String optionName) /*-{
		return this.selectable("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-selectable element.
	 * 
	 * @return
	 */
	public final native JQueryUI selectableWidget() /*-{
		return this.selectable("widget");
	}-*/;

	/**
	 * Use defaults for sortable
	 * 
	 * @return
	 */
	public final native JQueryUI sortable() /*-{
		return this.sortable();
	}-*/;

	/**
	 * Set multiple sortable options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI sortable(SortableOptions options) /*-{
		return this.sortable(options);
	}-*/;

	/**
	 * destroy : Remove the sortable functionality completely. This will return the element back to its pre-init state. disable : Disable the sortable. enable : Enable the sortable. refresh : Refresh the sortable items. Custom trigger the reloading of all sortable items, causing new items to be recognized. refreshPositions : Refresh the cached positions of the sortables' items. Calling this method refreshes the cached item positions of all sortables. This is usually done automatically by the script and slows down performance. Use wisely. cancel : Cancels a change in the current sortable and reverts it back to how it was before the current sort started. Useful in the stop and receive callback functions.
	 * 
	 * @param selectableParameters
	 * @return
	 */
	public final JQueryUI sortable(SortableOptionParameters sortableParameters) {
		return this.sortable(sortableParameters.name());
	}

	private final native JQueryUI sortable(String sortableParameters) /*-{
		return this.sortable(sortableParameters);
	}-*/;

	/**
	 * Set a string selectable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sortableSetStringOption(SortableStringOption sortableStringOption, String optionValue) {
		return this.sortableSetStringOption(sortableStringOption.name(), optionValue);
	}

	private final native JQueryUI sortableSetStringOption(String optionName, String optionValue) /*-{
		return this.sortable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string sortable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String sortableGetStringOption(SortableStringOption sortableStringOption) {
		String option = null;
		try {
			option = this.sortableGetStringOption(sortableStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sortableGetStringOption " + sortableStringOption.name());
		}
		return option;
	}

	private final native String sortableGetStringOption(String optionName) /*-{
		return this.sortable("option",optionName);
	}-*/;

	/**
	 * Set an integer sortable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sortableSetIntegerOption(SortableIntegerOption sortableIntegerOption, int optionValue) {
		return this.sortableSetIntegerOption(sortableIntegerOption.name(), optionValue);
	}

	private final native JQueryUI sortableSetIntegerOption(String optionName, int optionValue) /*-{
		return this.sortable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer sortable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer sortableGetIntegerOption(SortableIntegerOption sortableIntegerOption) {
		Integer option = null;
		try {
			option = this.sortableGetIntegerOption(sortableIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sortableGetIntegerOption " + sortableIntegerOption.name());
		}
		return option;
	}

	private final native int sortableGetIntegerOption(String optionName) /*-{
		return this.sortable("option",optionName);
	}-*/;

	/**
	 * Set a boolean sortable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sortableSetBooleanOption(SortableBooleanOption sortableBooleanOption, boolean optionValue) {
		return this.sortableSetBooleanOption(sortableBooleanOption.name(), optionValue);
	}

	private final native JQueryUI sortableSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.sortable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean sortable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean sortableGetBooleanOption(SortableBooleanOption sortableBooleanOption) {
		Boolean option = null;
		try {
			option = this.sortableGetBooleanOption(sortableBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sortableGetBooleanOption " + sortableBooleanOption.name());
		}
		return option;
	}

	private final native boolean sortableGetBooleanOption(String optionName) /*-{
		return this.sortable("option",optionName);
	}-*/;

	/**
	 * Set a double sortable option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sortableSetDoubleOption(SortableDoubleOption sortableDoubleOption, double optionValue) {
		return this.sortableSetDoubleOption(sortableDoubleOption.name(), optionValue);
	}

	private final native JQueryUI sortableSetDoubleOption(String optionName, double optionValue) /*-{
		return this.sortable("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a double sortable option
	 * 
	 * @param optionName
	 * @return
	 */
	public final double sortableGetDoubleOption(SortableDoubleOption sortableDoubleOption) {
		double sortableOption = -1;
		try {
			sortableOption = this.sortableGetDoubleOption(sortableDoubleOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sortableGetDoubleOption " + sortableDoubleOption.name());
		}
		return sortableOption;
	}

	private final native double sortableGetDoubleOption(String optionName) /*-{
		return this.sortable("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-sortable element.
	 * 
	 * @return
	 */
	public final native JQueryUI sortableWidget() /*-{
		return this.sortable("widget");
	}-*/;

	/**
	 * Serializes the sortable's item id's into a form/ajax submittable string. Calling this method produces a hash that can be appended to any url to easily submit a new item order back to the server.
	 * 
	 * @return
	 */
	public static final native String sortableSerialize() /*-{
		return this.sortable("serialize");
	}-*/;

	private static final native JavaScriptStringArray sortableToArrayJS() /*-{
		return this.sortable("toArray");
	}-*/;

	/**
	 * Serializes the sortable's item id's into an array of string.
	 * 
	 * @return
	 */
	public static final List<String> sortableToArray() {
		return JSHelper.convertJSArrayToStringList(sortableToArrayJS());
	}

	/**
	 * Use defaults for accordion
	 * 
	 * @return
	 */
	public final native JQueryUI accordion() /*-{
		return this.accordion();
	}-*/;

	/**
	 * Set multiple accordion options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI accordion(AccordionOptions options) /*-{
		return this.accordion(options);
	}-*/;

	/**
	 * destroy : Remove the accordion functionality completely. disable : Disable the accordion. enable : Enable the accordion. resize : Recompute heights of the accordion contents when using the fillSpace option and the container height changed. For example, when the container is a resizable, this method should be called by its resize-event.
	 * 
	 * @param selectableParameters
	 * @return
	 */
	public final JQueryUI accordion(AccordionOptionParameters accordionParameter) {
		return this.accordion(accordionParameter.name());
	}

	private final native JQueryUI accordion(String accordionParameter) /*-{
		return this.accordion(accordionParameter);
	}-*/;

	/**
	 * Set a string accordion option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI accordionSetStringOption(AccordionStringOption accordionStringOption, String optionValue) {
		return this.accordionSetStringOption(accordionStringOption.name(), optionValue);
	}

	private final native JQueryUI accordionSetStringOption(String optionName, String optionValue) /*-{
		return this.accordion("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string accordion option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String accordionGetStringOption(AccordionStringOption accordionStringOption) {
		String option = null;
		try {
			option = this.accordionGetStringOption(accordionStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in accordionGetStringOption " + accordionStringOption.name());
		}
		return option;
	}

	private final native String accordionGetStringOption(String optionName) /*-{
		return this.accordion("option",optionName);
	}-*/;

	/**
	 * Set an integer accordion option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI accordionSetIntegerOption(AccordionIntegerOption accordionIntegerOption, int optionValue) {
		return this.accordionSetIntegerOption(accordionIntegerOption.name(), optionValue);
	}

	private final native JQueryUI accordionSetIntegerOption(String optionName, int optionValue) /*-{
		return this.accordion("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer accordion option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer accordionGetIntegerOption(AccordionIntegerOption accordionIntegerOption) {
		Integer option = null;
		try {
			option = this.accordionGetIntegerOption(accordionIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in accordionGetIntegerOption " + accordionIntegerOption.name());
		}
		return option;
	}

	private final native int accordionGetIntegerOption(String optionName) /*-{
		return this.accordion("option",optionName);
	}-*/;

	/**
	 * Set a boolean accordion option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI accordionSetBooleanOption(AccordionBooleanOption accordionBooleanOption, boolean optionValue) {
		return this.accordionSetBooleanOption(accordionBooleanOption.name(), optionValue);
	}

	private final native JQueryUI accordionSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.accordion("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean accordion option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean accordionGetBooleanOption(AccordionBooleanOption accordionBooleanOption) {
		Boolean option = null;
		try {
			option = this.accordionGetBooleanOption(accordionBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in accordionGetBooleanOption " + accordionBooleanOption.name());
		}
		return option;
	}

	private final native boolean accordionGetBooleanOption(String optionName) /*-{
		return this.accordion("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-accordion element.
	 * 
	 * @return
	 */
	public final native JQueryUI accordionWidget() /*-{
		return this.accordion("widget");
	}-*/;

	/**
	 * Activate a content part of the Accordion with a zero-indexed number to match the position of the header
	 * 
	 * @param index
	 * @return
	 */
	public final native JQueryUI accordionActivate(int index) /*-{
		return this.accordion("activate",index);
	}-*/;

	/**
	 * Activate a content part of the Accordion with a Selector matching an element.
	 * 
	 * @param selector
	 * @return
	 */
	public final native JQueryUI accordionActivate(String selector) /*-{
		return this.accordion("activate",selector);
	}-*/;

	/**
	 * Set multiple autocomplete options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI autocomplete(AutoCompleteOptions options) /*-{
		return this.autocomplete(options);
	}-*/;

	/**
	 * destroy : Remove the autocomplete functionality completely. disable : Disable the autocomplete. enable : Enable the autocomplete. close : Close the Autocomplete menu. Useful in combination with the search method, to close the open menu.
	 * 
	 * @param selectableParameters
	 * @return
	 */
	public final JQueryUI autocomplete(AutoCompleteOptionParameters autocompleteParameter) {
		return this.autocomplete(autocompleteParameter.name());
	}

	private final native JQueryUI autocomplete(String autocompleteParameter) /*-{
		return this.autocomplete(autocompleteParameter);
	}-*/;

	/**
	 * Set a string autocomplete option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI autocompleteSetStringOption(AutoCompleteStringOption autocompleteStringOption, String optionValue) {
		return this.autocompleteSetStringOption(autocompleteStringOption.name(), optionValue);
	}

	private final native JQueryUI autocompleteSetStringOption(String optionName, String optionValue) /*-{
		return this.autocomplete("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string autocomplete option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String autocompleteGetStringOption(AutoCompleteStringOption autocompleteStringOption) {
		String option = null;
		try {
			option = this.autocompleteGetStringOption(autocompleteStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in autocompleteGetStringOption " + autocompleteStringOption.name());
		}
		return option;
	}

	private final native String autocompleteGetStringOption(String optionName) /*-{
		return this.autocomplete("option",optionName);
	}-*/;

	/**
	 * Set an integer autocomplete option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI autocompleteSetIntegerOption(AutoCompleteIntegerOption autocompleteIntegerOption, int optionValue) {
		return this.autocompleteSetIntegerOption(autocompleteIntegerOption.name(), optionValue);
	}

	private final native JQueryUI autocompleteSetIntegerOption(String optionName, int optionValue) /*-{
		return this.autocomplete("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer autocomplete option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer autocompleteGetIntegerOption(AutoCompleteIntegerOption autocompleteIntegerOption) {
		Integer option = null;
		try {
			option = this.autocompleteGetIntegerOption(autocompleteIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in autocompleteGetIntegerOption " + autocompleteIntegerOption.name());
		}
		return option;
	}

	private final native int autocompleteGetIntegerOption(String optionName) /*-{
		return this.autocomplete("option",optionName);
	}-*/;

	/**
	 * Set a boolean autocomplete option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI autocompleteSetBooleanOption(AutoCompleteBooleanOption autocompleteBooleanOption, boolean optionValue) {
		return this.autocompleteSetBooleanOption(autocompleteBooleanOption.name(), optionValue);
	}

	private final native JQueryUI autocompleteSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.autocomplete("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean autocomplete option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean autocompleteGetBooleanOption(AutoCompleteBooleanOption autocompleteBooleanOption) {
		Boolean option = null;
		try {
			option = this.autocompleteGetBooleanOption(autocompleteBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in autocompleteGetBooleanOption " + autocompleteBooleanOption.name());
		}
		return option;
	}

	private final native boolean autocompleteGetBooleanOption(String optionName) /*-{
		return this.autocomplete("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-autocomplete element.
	 * 
	 * @return
	 */
	public final native JQueryUI autocompleteWidget() /*-{
		return this.autocomplete("widget");
	}-*/;

	/**
	 * Triggers a search event, which, when data is available, then will display the suggestions; can be used by a selectbox-like button to open the suggestions when clicked. If no value argument is specified, the current input's value is used. Can be called with an empty string and minLength: 0 to display all items.
	 * 
	 * @param search
	 * @return
	 */
	public final native JQueryUI autocompleteSearch(String search) /*-{
		return this.autocomplete("search",search);
	}-*/;

	/**
	 * Use defaults for button
	 * 
	 * @return
	 */
	public final native JQueryUI button() /*-{
		return this.button();
	}-*/;

	/**
	 * Set multiple button options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI button(ButtonOptions options) /*-{
		return this.button(options);
	}-*/;

	/**
	 * destroy : Remove the button functionality completely. disable : Disable the button. enable : Enable the button. refresh : Refreshes the visual state of the button. Useful for updating button state after the native element's checked or disabled state is changed programatically.
	 * 
	 * @param buttonParameter
	 * @return
	 */
	public final JQueryUI button(ButtonOptionParameters buttonParameter) {
		return this.button(buttonParameter.name());
	}

	private final native JQueryUI button(String buttonParameter) /*-{
		return this.button(buttonParameter);
	}-*/;

	/**
	 * Set a string button option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI buttonSetStringOption(ButtonStringOption buttonStringOption, String optionValue) {
		return this.buttonSetStringOption(buttonStringOption.name(), optionValue);
	}

	private final native JQueryUI buttonSetStringOption(String optionName, String optionValue) /*-{
		return this.button("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string button option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String buttonGetStringOption(ButtonStringOption buttonStringOption) {
		String option = null;
		try {
			option = this.buttonGetStringOption(buttonStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in buttonGetStringOption " + buttonStringOption.name());
		}
		return option;
	}

	private final native String buttonGetStringOption(String optionName) /*-{
		return this.button("option",optionName);
	}-*/;


	public final native JQueryUI buttonSetIcons(ButtonIcons icons) /*-{
		return this.button("option","icons",icons);
	}-*/;

	public final native ButtonIcons buttonGetIcons() /*-{
	return this.button("option","icons");
}-*/;
	
	/**
	 * Get a boolean button option
	 * 
	 * @param optionNamButtonturn
	 */
	public final Boolean buttonGetBooleanOption(ButtonBooleanOption buttonBooleanOption) {
		Boolean option = null;
		try {
			option = this.buttonGetBooleanOption(buttonBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in buttonGetBooleanOption " + buttonBooleanOption.name());
		}
		return option;
	}

	private final native boolean buttonGetBooleanOption(String optionName) /*-{
		return this.button("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-button element.
	 * 
	 * @return
	 */
	public final native JQueryUI buttonWidget() /*-{
		return this.button("widget");
	}-*/;

	public final JQueryUI buttonSetBooleanOption(ButtonBooleanOption buttonBooleanOption, boolean optionValue) {
		return this.buttonSetBooleanOption(buttonBooleanOption.name(), optionValue);
	}

	private final native JQueryUI buttonSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.button("option",optionName,optionValue);
	}-*/;
	
	public final native JQueryUI buttonset() /*-{
		return this.buttonset();
	}-*/;


	/**
	 * destroy : Remove the button functionality completely. disable : Disable the button. enable : Enable the button. refresh : Refreshes the visual state of the button. Useful for updating button state after the native element's checked or disabled state is changed programatically.
	 * 
	 * @param buttonParameter
	 * @return
	 */
	public final JQueryUI buttonset(ButtonOptionParameters buttonParameter) {
		return this.buttonset(buttonParameter.name());
	}

	private final native JQueryUI buttonset(String buttonParameter) /*-{
		return this.buttonset(buttonParameter);
	}-*/;

	/**
	 * Use defaults for dialog
	 * 
	 * @return
	 */
	public final native JQueryUI dialog() /*-{
		return this.dialog();
	}-*/;

	/**
	 * Set multiple dialog options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI dialog(DialogOptions options) /*-{
		return this.dialog(options);
	}-*/;

	/**
	 * destroy : Remove the dialog functionality completely. disable : Disable the dialog. enable : Enable the dialog. close : Close the dialog. moveToTop : Move the dialog to the top of the dialogs stack. open : Open the dialog.
	 * 
	 * @param selectableParameters
	 * @return
	 */
	public final JQueryUI dialog(DialogOptionParameters dialogParameter) {
		return this.dialog(dialogParameter.name());
	}

	private final native JQueryUI dialog(String dialogParameter) /*-{
		return this.dialog(dialogParameter);
	}-*/;

	/**
	 * Set a string dialog option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI dialogSetStringOption(DialogStringOption dialogStringOption, String optionValue) {
		return this.dialogSetStringOption(dialogStringOption.name(), optionValue);
	}

	private final native JQueryUI dialogSetStringOption(String optionName, String optionValue) /*-{
		return this.dialog("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string dialog option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String dialogGetStringOption(DialogStringOption dialogStringOption) {
		String option = null;
		try {
			option = this.dialogGetStringOption(dialogStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in dialogGetStringOption " + dialogStringOption.name());
		}
		return option;
	}

	private final native String dialogGetStringOption(String optionName) /*-{
		return this.dialog("option",optionName);
	}-*/;

	/**
	 * Set an integer dialog option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI dialogSetIntegerOption(DialogIntegerOption dialogIntegerOption, int optionValue) {
		return this.dialogSetIntegerOption(dialogIntegerOption.name(), optionValue);
	}

	private final native JQueryUI dialogSetIntegerOption(String optionName, int optionValue) /*-{
		return this.dialog("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer dialog option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer dialogGetIntegerOption(DialogIntegerOption dialogIntegerOption) {
		Integer option = null;
		try {
			option = this.dialogGetIntegerOption(dialogIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in dialogGetIntegerOption " + dialogIntegerOption.name());
		}
		return option;
	}

	private final native int dialogGetIntegerOption(String optionName) /*-{
		return this.dialog("option",optionName);
	}-*/;

	/**
	 * Set a boolean dialog option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI dialogSetBooleanOption(DialogBooleanOption dialogBooleanOption, boolean optionValue) {
		return this.dialogSetBooleanOption(dialogBooleanOption.name(), optionValue);
	}

	private final native JQueryUI dialogSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.dialog("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean dialog option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean dialogGetBooleanOption(DialogBooleanOption dialogBooleanOption) {
		Boolean option = null;
		try {
			option = this.dialogGetBooleanOption(dialogBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in dialogGetBooleanOption " + dialogBooleanOption.name());
		}
		return option;
	}

	private final native boolean dialogGetBooleanOption(String optionName) /*-{
		return this.dialog("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-dialog element.
	 * 
	 * @return
	 */
	public final native JQueryUI dialogWidget() /*-{
		return this.dialog("widget");
	}-*/;

	/**
	 * Returns true if the dialog is currently open.
	 * 
	 * @return
	 */
	public final native boolean dialogIsOpen() /*-{
		return this.dialog("isOpen");
	}-*/;

	/**
	 * Use defaults for progressbar
	 * 
	 * @return
	 */
	public final native JQueryUI progressbar() /*-{
		return this.progressbar();
	}-*/;

	/**
	 * Set multiple progressbar options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI progressbar(ProgressbarOptions options) /*-{
		return this.progressbar(options);
	}-*/;

	/**
	 * destroy : Remove the progressbar functionality completely. disable : Disable the progressbar. enable : Enable the progressbar.
	 * 
	 * @param progressbarParameter
	 * @return
	 */
	public final JQueryUI progressbar(ProgressbarOptionParameters progressbarParameter) {
		return this.progressbar(progressbarParameter.name());
	}

	private final native JQueryUI progressbar(String progressbarParameter) /*-{
		return this.progressbar(progressbarParameter);
	}-*/;

	/**
	 * Set a boolean progressbar option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI progressbarSetBooleanOption(ProgressbarBooleanOption progressbarBooleanOption, boolean optionValue) {
		return this.progressbarSetBooleanOption(progressbarBooleanOption.name(), optionValue);
	}

	private final native JQueryUI progressbarSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.progressbar("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean progressbar option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean progressbarGetBooleanOption(ProgressbarBooleanOption progressbarBooleanOption) {
		Boolean option = null;
		try {
			option = this.progressbarGetBooleanOption(progressbarBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in progressbarGetBooleanOption " + progressbarBooleanOption.name());
		}
		return option;
	}

	private final native boolean progressbarGetBooleanOption(String optionName) /*-{
		return this.progressbar("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-progressbar element.
	 * 
	 * @return
	 */
	public final native JQueryUI progressbarWidget() /*-{
		return this.progressbar("widget");
	}-*/;

	/**
	 * This method gets the current value of the progressbar.
	 * 
	 * @param index
	 * @return
	 */
	public final native int progressbarGetValue() /*-{
		return this.progressbar("value");
	}-*/;

	/**
	 * This method sets the current value of the progressbar.
	 * 
	 * @param value
	 */
	public final native void progressbarSetValue(int value) /*-{
		this.progressbar("value",value);
	}-*/;

	/**
	 * Use defaults for slider
	 * 
	 * @return
	 */
	public final native JQueryUI slider() /*-{
		return this.slider();
	}-*/;

	/**
	 * Set multiple slider options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI slider(SliderOptions options) /*-{
		return this.slider(options);
	}-*/;

	/**
	 * destroy : Remove the slider functionality completely. disable : Disable the slider. enable : Enable the slider.
	 * 
	 * @param sliderParameter
	 * @return
	 */
	public final JQueryUI slider(SliderOptionParameters sliderParameter) {
		return this.slider(sliderParameter.name());
	}

	private final native JQueryUI slider(String sliderParameter) /*-{
		return this.slider(sliderParameter);
	}-*/;

	/**
	 * Set a boolean slider option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sliderSetBooleanOption(SliderBooleanOption sliderBooleanOption, boolean optionValue) {
		return this.sliderSetBooleanOption(sliderBooleanOption.name(), optionValue);
	}

	private final native JQueryUI sliderSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.slider("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean slider option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean sliderGetBooleanOption(SliderBooleanOption sliderBooleanOption) {
		Boolean option = null;
		try {
			option = this.sliderGetBooleanOption(sliderBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sliderGetBooleanOption " + sliderBooleanOption.name());
		}
		return option;
	}

	private final native boolean sliderGetBooleanOption(String optionName) /*-{
		return this.slider("option",optionName);
	}-*/;

	/**
	 * Set a string slider option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sliderSetStringOption(SliderStringOption sliderStringOption, String optionValue) {
		return this.sliderSetStringOption(sliderStringOption.name(), optionValue);
	}

	private final native JQueryUI sliderSetStringOption(String optionName, String optionValue) /*-{
		return this.slider("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string slider option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String sliderGetStringOption(SliderStringOption sliderStringOption) {
		String option = null;
		try {
			option = this.sliderGetStringOption(sliderStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sliderGetStringOption " + sliderStringOption.name());
		}
		return option;
	}

	private final native String sliderGetStringOption(String optionName) /*-{
		return this.slider("option",optionName);
	}-*/;

	/**
	 * Set an integer slider option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI sliderSetIntegerOption(SliderIntegerOption sliderIntegerOption, int optionValue) {
		return this.sliderSetIntegerOption(sliderIntegerOption.name(), optionValue);
	}

	private final native JQueryUI sliderSetIntegerOption(String optionName, int optionValue) /*-{
		return this.slider("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer slider option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer sliderGetIntegerOption(SliderIntegerOption sliderIntegerOption) {
		Integer option = null;
		try {
			option = this.sliderGetIntegerOption(sliderIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in sliderGetIntegerOption " + sliderIntegerOption.name());
		}
		return option;
	}

	private final native int sliderGetIntegerOption(String optionName) /*-{
		return this.slider("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-slider element.
	 * 
	 * @return
	 */
	public final native JQueryUI sliderWidget() /*-{
		return this.slider("widget");
	}-*/;

	/**
	 * This method gets the value of the slider. For single handle sliders.
	 * 
	 * @param index
	 * @return
	 */
	public final native int sliderGetValue() /*-{
		return this.slider("value");
	}-*/;

	/**
	 * This method sets the value of the slider. For single handle sliders.
	 * 
	 * @param value
	 */
	public final native void sliderSetValue(int value) /*-{
		this.slider("value",value);
	}-*/;

	/**
	 * Gets the values of the slider. For multiple handle or range sliders.
	 * 
	 * @param index
	 * @return
	 */
	public final native int sliderGetValues(int index) /*-{
		return this.slider("values",index);
	}-*/;

	/**
	 * Sets the values of the slider. For multiple handle or range sliders.
	 * 
	 * @param value
	 */
	public final native void sliderSetValues(int index, int value) /*-{
		this.slider("values",index,value);
	}-*/;

	/**
	 * Use defaults for tabs
	 * 
	 * @return
	 */
	public final native JQueryUI tabs() /*-{
		return this.tabs();
	}-*/;

	/**
	 * Set multiple tabs options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI tabs(TabsOptions options) /*-{
		return this.tabs(options);
	}-*/;

	/**
	 * destroy : Remove the tabs functionality completely. abort : Terminate all running tab ajax requests and animations.
	 * 
	 * @param tabsParameter
	 * @return
	 */
	public final JQueryUI tabs(TabsOptionParameters tabsParameter) {
		return this.tabs(tabsParameter.name());
	}

	private final native JQueryUI tabs(String tabsParameter) /*-{
		return this.tabs(tabsParameter);
	}-*/;

	/**
	 * Set a boolean tabs option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI tabsSetBooleanOption(TabsBooleanOption tabsBooleanOption, boolean optionValue) {
		return this.tabsSetBooleanOption(tabsBooleanOption.name(), optionValue);
	}

	private final native JQueryUI tabsSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.tabs("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean tabs option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean tabsGetBooleanOption(TabsBooleanOption tabsBooleanOption) {
		Boolean option = null;
		try {
			option = this.tabsGetBooleanOption(tabsBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in tabsGetBooleanOption " + tabsBooleanOption.name());
		}
		return option;
	}

	private final native boolean tabsGetBooleanOption(String optionName) /*-{
		return this.tabs("option",optionName);
	}-*/;

	/**
	 * Set a string tabs option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI tabsSetStringOption(TabsStringOption tabsStringOption, String optionValue) {
		return this.tabsSetStringOption(tabsStringOption.name(), optionValue);
	}

	private final native JQueryUI tabsSetStringOption(String optionName, String optionValue) /*-{
		return this.tabs("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string tabs option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String tabsGetStringOption(TabsStringOption tabsStringOption) {
		String option = null;
		try {
			option = this.tabsGetStringOption(tabsStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in tabsGetStringOption " + tabsStringOption.name());
		}
		return option;
	}

	private final native String tabsGetStringOption(String optionName) /*-{
		return this.tabs("option",optionName);
	}-*/;

	/**
	 * Set an integer tabs option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI tabsSetIntegerOption(TabsIntegerOption tabsIntegerOption, int optionValue) {
		return this.tabsSetIntegerOption(tabsIntegerOption.name(), optionValue);
	}

	private final native JQueryUI tabsSetIntegerOption(String optionName, int optionValue) /*-{
		return this.tabs("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer tabs option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer tabsGetIntegerOption(TabsIntegerOption tabsIntegerOption) {
		Integer option = null;
		try {
			option = this.tabsGetIntegerOption(tabsIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in tabsGetIntegerOption " + tabsIntegerOption.name());
		}
		return option;
	}

	private final native int tabsGetIntegerOption(String optionName) /*-{
		return this.tabs("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-tabs element.
	 * 
	 * @return
	 */
	public final native JQueryUI tabsWidget() /*-{
		return this.tabs("widget");
	}-*/;

	/**
	 * Add a new tab. The second argument is either a URL consisting of a fragment identifier only to create an in-page tab or a full url (relative or absolute, no cross-domain support) to turn the new tab into an Ajax (remote) tab.
	 * 
	 * @param url
	 * @param label
	 * @return
	 */
	public final native JQueryUI tabsAdd(String url, String label) /*-{
		return this.tabs("add", url , label);
	}-*/;

	/**
	 * Add a new tab. The second argument is either a URL consisting of a fragment identifier only to create an in-page tab or a full url (relative or absolute, no cross-domain support) to turn the new tab into an Ajax (remote) tab.
	 * 
	 * @param url
	 * @param label
	 * @param index
	 * @return
	 */
	public final native JQueryUI tabsAdd(String url, String label, int index) /*-{
		return this.tabs("add", url , label,index);
	}-*/;

	/**
	 * remove : Remove a tab enable : Enable a disabled tab. disable : Disable a tab select : Select a tab, as if it were clicked. load : Reload the content of an Ajax tab programmatically. This method always loads the tab content from the remote location, even if cache is set to true.
	 * 
	 * @param pararemeter
	 * @param index
	 * @return
	 */
	public final JQueryUI tabsIndexed(TabsIndexedOptionParameters pararemeter, int index) {
		return tabsSetIndexedValue(pararemeter.name(), index);
	}

	private final native JQueryUI tabsSetIndexedValue(String name, int index) /*-{
		return this.tabs(name,index);
	}-*/;

	/**
	 * Change the url from which an Ajax (remote) tab will be loaded. The specified URL will be used for subsequent loads. Note that you can not only change the URL for an existing remote tab with this method, but also turn an in-page tab into a remote tab.
	 * 
	 * @param index
	 * @param url
	 * @return
	 */
	public final native JQueryUI tabsSetURL(int index, String url) /*-{
		return this.tabs("url", index , url);
	}-*/;

	/**
	 * Retrieve the number of tabs of the first matched tab pane.
	 * 
	 * @return
	 */
	public final native int tabsGetLength() /*-{
		return this.tabs("length");
	}-*/;

	/**
	 * Set up an automatic rotation through tabs of a tab pane. The second argument is an amount of time in milliseconds until the next tab in the cycle gets activated. Use 0 or null to stop the rotation. The third controls whether or not to continue the rotation after a tab has been selected by a user. Default: false.
	 * 
	 * @param ms
	 * @param continuing
	 * @return
	 */
	public final native JQueryUI tabsRotate(int ms, boolean continuing) /*-{
		return this.tabs( "rotate" , ms , continuing );
	}-*/;

	/**
	 * Enable all tabs
	 * 
	 * @return
	 */
	public final native JQueryUI tabsEnableAll() /*-{
		return this.tabs("option","disabled",[]);
	}-*/;

	/**
	 * Disable a list of tabs
	 * 
	 * @param disabled
	 */
	public final void tabsDisable(Integer[] disabled) {
		tabsDisable(JSHelper.convertIntegerArrayToJSArray(disabled));
	}

	private final native void tabsDisable(JavaScriptIntegerArray disabled) /*-{
		this.tabs("option","disabled",disabled);
	}-*/;

	/**
	 * Select a tab, as if it were clicked.
	 * 
	 * @param idSelector
	 *            : the id selector of the panel the tab is associated with (the tab's href fragment identifier, e.g. hash, points to the panel's id).
	 * @return
	 */
	public final native JQueryUI tabsSelect(String idSelector) /*-{
		return this.tabs("select",idSelector);
	}-*/;

	/**
	 * Adds the specified class if it is not present, and removes the specified class if it is present together with the number of milliseconds to run the animation.
	 * 
	 * @param className
	 * @param duration
	 * @return
	 */
	public final native JQueryUI toggleClass(String className, int duration) /*-{
		return this.toggleClass(className,duration);
	}-*/;

	/**
	 * Adds the specified class if it is not present, and removes the specified class if it is present together with the duration to run the animation.
	 * 
	 * @param className
	 * @param duration
	 * @return
	 */
	public final JQueryUI toggleClass(String className, Duration duration) {
		return this.toggleClass(className, duration.name());
	};

	private final native JQueryUI toggleClass(String className, String duration) /*-{
		return this.toggleClass(className,duration);
	}-*/;

	/**
	 * Adds the specified class to each of the set of matched elements together with the number of milliseconds to run the animation.
	 * 
	 * @param className
	 * @param duration
	 * @return
	 */
	public final native JQueryUI addClass(String className, int duration) /*-{
		return this.addClass(className,duration);
	}-*/;

	/**
	 * Adds the specified class to each of the set of matched elements together with the duration to run the animation.
	 * 
	 * @param className
	 * @param duration
	 * @return
	 */
	public final JQueryUI addClass(String className, Duration duration) {
		return this.addClass(className, duration.name());
	};

	private final native JQueryUI addClass(String className, String duration) /*-{
		return this.addClass(className,duration);
	}-*/;

	/**
	 * Adds the specified class to each of the set of matched elements together with the duration to run the animation.
	 * @param className
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI addClass(String className, Duration duration, ExecuteCurrentUIHandler callback) {
		return this.addClass(className, duration.name(), callback);
	};

	private final native JQueryUI addClass(String className, String duration, ExecuteCurrentUIHandler callback)/*-{
		return this.addClass(className,duration,function() {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		 });
	}-*/;

	/**
	 * Adds the specified class to each of the set of matched elements together with the number of milliseconds to run the animation.
	 * @param className
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final native JQueryUI addClass(String className, int duration, ExecuteCurrentUIHandler callback)/*-{
		return this.addClass(className,duration,function() {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		 });
	}-*/;

	
	
	/**
	 * removes the specified class from each of the set of matched elements together with the number of milliseconds to run the animation.
	 * 
	 * @param className
	 * @param duration
	 * @return
	 */
	public final native JQueryUI removeClass(String className, int duration) /*-{
		return this.removeClass(className,duration);
	}-*/;

	/**
	 * removes the specified class from each of the set of matched elements together with the duration to run the animation.
	 * 
	 * @param className
	 * @param duration
	 * @return
	 */
	public final JQueryUI removeClass(String className, Duration duration) {
		return this.removeClass(className, duration.name());
	};

	private final native JQueryUI removeClass(String className, String duration) /*-{
		return this.removeClass(className,duration);
	}-*/;

	/**
	 * removes the specified class from each of the set of matched elements together with the duration to run the animation.
	 * @param className
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI removeClass(String className, Duration duration, ExecuteCurrentUIHandler callback) {
		return this.removeClass(className, duration.name(), callback);
	};

	private final native JQueryUI removeClass(String className, String duration, ExecuteCurrentUIHandler callback)/*-{
		return this.removeClass(className,duration,function() {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		 });
	}-*/;

	/**
	 * removes the specified class from each of the set of matched elements together with the number of milliseconds to run the animation.
	 * @param className
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final native JQueryUI removeClass(String className, int duration, ExecuteCurrentUIHandler callback)/*-{
		return this.removeClass(className,duration,function() {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		 });
	}-*/;
	
	

	/**
	 * Switches from the class defined in the first argument to the class defined as second argument
	 * @param removeClassName
	 * @param addClassName
	 * @return
	 */
	public final native JQueryUI switchClass(String removeClassName,String addClassName) /*-{
	return this.switchClass(removeClassName,addClassName);
}-*/;
	
	/**
	 * Switches from the class defined in the first argument to the class defined as second argument using the animation duration
	 * @param removeClassName
	 * @param addClassName
	 * @param duration
	 * @return
	 */
	public final native JQueryUI switchClass(String removeClassName,String addClassName, int duration) /*-{
		return this.switchClass(removeClassName,addClassName,duration);
	}-*/;

	/**
	 * Switches from the class defined in the first argument to the class defined as second argument using the animation duration
	 * @param removeClassName
	 * @param addClassName
	 * @param duration
	 * @return
	 */
	public final JQueryUI switchClass(String removeClassName,String addClassName,Duration duration) {
		return this.switchClass(removeClassName,addClassName, duration.name());
	};

	private final native JQueryUI switchClass(String removeClassName,String addClassName, String duration) /*-{
		return this.switchClass(removeClassName,addClassName,duration);
	}-*/;


	/**
	 * Switches from the class defined in the first argument to the class defined as second argument using the animation duration
	 * @param removeClassName
	 * @param addClassName
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI switchClass(String removeClassName,String addClassName,Duration duration,  ExecuteCurrentUIHandler callback) {
		return this.switchClass(removeClassName,addClassName, duration.name(), callback);
	};

	private final native JQueryUI switchClass(String removeClassName,String addClassName,  String duration, ExecuteCurrentUIHandler callback)/*-{
		return this.switchClass(removeClassName,addClassName,duration,function() {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		 });
	}-*/;

	/**
	 * Switches from the class defined in the first argument to the class defined as second argument using the animation duration
	 * @param removeClassName
	 * @param addClassName
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final native JQueryUI switchClass(String removeClassName,String addClassName,  int duration, ExecuteCurrentUIHandler callback)/*-{
		return this.switchClass(removeClassName,addClassName,duration,function() {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		 });
	}-*/;	
	
	/**
	 * Uses a specific effect on an element (without the show/hide logic).
	 * @param effect
	 * @return
	 */
	public final JQueryUI effect(Effect effect) {
		return effect(effect.name());
	}
	
	private final native JQueryUI effect(String effect) /*-{
	return this.effect(effect);
}-*/;
	
	/**
	 * Uses a specific effect on an element (without the show/hide logic)
	 * @param effect
	 * @param options : each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @return
	 */
	public final JQueryUI effect(Effect effect,EffectOptions options) {
		return effect(effect.name(),options);
	}
	
	private final native JQueryUI effect(String effect,EffectOptions options) /*-{
	return this.effect(effect,options);
}-*/;
	
	/**
	 * Uses a specific effect on an element (without the show/hide logic)
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration  in milliseconds 
	 * @return
	 */
	public final JQueryUI effect(Effect effect,EffectOptions options,int duration) {
		return effect(effect.name(),options,duration);
	}
	
	private final native JQueryUI effect(String effect,EffectOptions options,int duration) /*-{
	return this.effect(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element (without the show/hide logic)
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @return
	 */
	public final JQueryUI effect(Effect effect,EffectOptions options,Duration duration) {
		return effect(effect.name(),options,duration.name());
	}
	
	private final native JQueryUI effect(String effect,EffectOptions options,String duration) /*-{
	return this.effect(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element (without the show/hide logic)
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI effect(Effect effect,EffectOptions options,Duration duration, ExecuteCurrentUIHandler callback){
		return effect(effect.name(),options,duration.name(),callback);
	}
	
	private final native JQueryUI effect(String effect,EffectOptions options,String duration, ExecuteCurrentUIHandler callback)/*-{
	return this.effect(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	
	
	/**
	 * Uses a specific effect on an element (without the show/hide logic)
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI effect(Effect effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback){
		return effect(effect.name(),options,duration,callback);
	}
	
	private final native JQueryUI effect(String effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback)/*-{
	return this.effect(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	
	
	

	/**
	 * Uses a specific effect on an element to toggle the element.
	 * @param effect
	 * @return
	 */
	public final JQueryUI toggle(Effect effect) {
		return toggle(effect.name());
	}
	
	private final native JQueryUI toggle(String effect) /*-{
	return this.toggle(effect);
}-*/;
	
	/**
	 * Uses a specific effect on an element to toggle the element.
	 * @param effect
	 * @param options : each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @return
	 */
	public final JQueryUI toggle(Effect effect,EffectOptions options) {
		return toggle(effect.name(),options);
	}
	
	private final native JQueryUI toggle(String effect,EffectOptions options) /*-{
	return this.toggle(effect,options);
}-*/;
	
	/**
	 * Uses a specific effect on an element to toggle the element.
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration  in milliseconds 
	 * @return
	 */
	public final JQueryUI toggle(Effect effect,EffectOptions options,int duration) {
		return toggle(effect.name(),options,duration);
	}
	
	private final native JQueryUI toggle(String effect,EffectOptions options,int duration) /*-{
	return this.toggle(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element to toggle the element.
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @return
	 */
	public final JQueryUI toggle(Effect effect,EffectOptions options,Duration duration) {
		return toggle(effect.name(),options,duration.name());
	}
	
	private final native JQueryUI toggle(String effect,EffectOptions options,String duration) /*-{
	return this.toggle(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element to toggle the element.
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI toggle(Effect effect,EffectOptions options,Duration duration, ExecuteCurrentUIHandler callback){
		return toggle(effect.name(),options,duration.name(),callback);
	}
	
	private final native JQueryUI toggle(String effect,EffectOptions options,String duration, ExecuteCurrentUIHandler callback)/*-{
	return this.toggle(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	
	
	/**
	 * Uses a specific effect on an element to toggle the element.
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI toggle(Effect effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback){
		return toggle(effect.name(),options,duration,callback);
	}
	
	private final native JQueryUI toggle(String effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback)/*-{
	return this.toggle(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	
	
	/**
	 * Uses a specific effect on an element to hide the element
	 * @param effect
	 * @return
	 */
	public final JQueryUI hide(Effect effect) {
		return hide(effect.name());
	}
	
	private final native JQueryUI hide(String effect) /*-{
	return this.hide(effect);
}-*/;
	
	/**
	 * Uses a specific effect on an element to hide the element
	 * @param effect
	 * @param options : each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @return
	 */
	public final JQueryUI hide(Effect effect,EffectOptions options) {
		return hide(effect.name(),options);
	}
	
	private final native JQueryUI hide(String effect,EffectOptions options) /*-{
	return this.hide(effect,options);
}-*/;
	
	/**
	 * Uses a specific effect on an element to hide the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration  in milliseconds 
	 * @return
	 */
	public final JQueryUI hide(Effect effect,EffectOptions options,int duration) {
		return hide(effect.name(),options,duration);
	}
	
	private final native JQueryUI hide(String effect,EffectOptions options,int duration) /*-{
	return this.hide(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element to hide the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @return
	 */
	public final JQueryUI hide(Effect effect,EffectOptions options,Duration duration) {
		return hide(effect.name(),options,duration.name());
	}
	
	private final native JQueryUI hide(String effect,EffectOptions options,String duration) /*-{
	return this.hide(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element to hide the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI hide(Effect effect,EffectOptions options,Duration duration, ExecuteCurrentUIHandler callback){
		return hide(effect.name(),options,duration.name(),callback);
	}
	
	private final native JQueryUI hide(String effect,EffectOptions options,String duration, ExecuteCurrentUIHandler callback)/*-{
	return this.hide(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	
	
	/**
	 * Uses a specific effect on an element to hide the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI hide(Effect effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback){
		return hide(effect.name(),options,duration,callback);
	}
	
	private final native JQueryUI hide(String effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback)/*-{
	return this.hide(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;
	
	
	/**
	 * Uses a specific effect on an element to show the element
	 * @param effect
	 * @return
	 */
	public final JQueryUI show(Effect effect) {
		return show(effect.name());
	}
	
	private final native JQueryUI show(String effect) /*-{
	return this.show(effect);
}-*/;
	
	/**
	 * Uses a specific effect on an element to show the element
	 * @param effect
	 * @param options : each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @return
	 */
	public final JQueryUI show(Effect effect,EffectOptions options) {
		return show(effect.name(),options);
	}
	
	private final native JQueryUI show(String effect,EffectOptions options) /*-{
	return this.show(effect,options);
}-*/;
	
	/**
	 * Uses a specific effect on an element to show the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration  in milliseconds 
	 * @return
	 */
	public final JQueryUI show(Effect effect,EffectOptions options,int duration) {
		return show(effect.name(),options,duration);
	}
	
	private final native JQueryUI show(String effect,EffectOptions options,int duration) /*-{
	return this.show(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element to show the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @return
	 */
	public final JQueryUI show(Effect effect,EffectOptions options,Duration duration) {
		return show(effect.name(),options,duration.name());
	}
	
	private final native JQueryUI show(String effect,EffectOptions options,String duration) /*-{
	return this.show(effect,options,duration);
}-*/;
	
	/**
	 * Uses a specific effect on an element to show the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI show(Effect effect,EffectOptions options,Duration duration, ExecuteCurrentUIHandler callback){
		return show(effect.name(),options,duration.name(),callback);
	}
	
	private final native JQueryUI show(String effect,EffectOptions options,String duration, ExecuteCurrentUIHandler callback)/*-{
	return this.show(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	
	
	/**
	 * Uses a specific effect on an element to show the element
	 * @param effect
	 * @param options  each option must match the effect eg. Effect.transfer uses TransferEffectOptions or use the default EffectOptions
	 * @param duration
	 * @param callback
	 * @return
	 */
	public final JQueryUI show(Effect effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback){
		return show(effect.name(),options,duration,callback);
	}
	
	private final native JQueryUI show(String effect,EffectOptions options,int duration, ExecuteCurrentUIHandler callback)/*-{
	return this.show(effect,options,duration,function() {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
	 });
}-*/;	

	/**
	 * Use defaults for datepicker
	 * 
	 * @return
	 */
	public final native JQueryUI datepicker() /*-{
		return this.datepicker();
	}-*/;

	/**
	 * Set multiple datepicker options at once by providing an options object.
	 * 
	 * @param options
	 * @return
	 */
	public final native JQueryUI datepicker(DatepickerOptions options) /*-{
		return this.datepicker(options);
	}-*/;

	/**
	 * destroy : Remove the datepicker functionality completely. disable : Disable the datepicker. enable : Enable the datepicker. hide : Close a previously opened date picker.  show : Call up a previously attached date picker. refresh : Redraw a date picker, after having made some external modifications.
	 * 
	 * @param datepickerParameter
	 * @return
	 */
	public final JQueryUI datepicker(DatepickerOptionParameters datepickerParameter) {
		return this.datepicker(datepickerParameter.name());
	}

	private final native JQueryUI datepicker(String datepickerParameter) /*-{
		return this.datepicker(datepickerParameter);
	}-*/;

	/**
	 * Set a string datepicker option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI datepickerSetStringOption(DatepickerStringOption datepickerStringOption, String optionValue) {
		return this.datepickerSetStringOption(datepickerStringOption.name(), optionValue);
	}

	private final native JQueryUI datepickerSetStringOption(String optionName, String optionValue) /*-{
		return this.datepicker("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a string datepicker option
	 * 
	 * @param optionName
	 * @return
	 */
	public final String datepickerGetStringOption(DatepickerStringOption datepickerStringOption) {
		String option = null;
		try {
			option = this.datepickerGetStringOption(datepickerStringOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerGetStringOption " + datepickerStringOption.name());
		}
		return option;
	}

	private final native String datepickerGetStringOption(String optionName) /*-{
		return this.datepicker("option",optionName);
	}-*/;

	/**
	 * Set an integer datepicker option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI datepickerSetIntegerOption(DatepickerIntegerOption datepickerIntegerOption, int optionValue) {
		return this.datepickerSetIntegerOption(datepickerIntegerOption.name(), optionValue);
	}

	private final native JQueryUI datepickerSetIntegerOption(String optionName, int optionValue) /*-{
		return this.datepicker("option",optionName,optionValue);
	}-*/;

	/**
	 * Get an integer datepicker option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Integer datepickerGetIntegerOption(DatepickerIntegerOption datepickerIntegerOption) {
		Integer option = null;
		try {
			option = this.datepickerGetIntegerOption(datepickerIntegerOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerGetIntegerOption " + datepickerIntegerOption.name());
		}
		return option;
	}

	private final native int datepickerGetIntegerOption(String optionName) /*-{
		return this.datepicker("option",optionName);
	}-*/;

	/**
	 * Set a boolean datepicker option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI datepickerSetBooleanOption(DatepickerBooleanOption datepickerBooleanOption, boolean optionValue) {
		return this.datepickerSetBooleanOption(datepickerBooleanOption.name(), optionValue);
	}

	private final native JQueryUI datepickerSetBooleanOption(String optionName, boolean optionValue) /*-{
		return this.datepicker("option",optionName,optionValue);
	}-*/;

	/**
	 * Get a boolean datepicker option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Boolean datepickerGetBooleanOption(DatepickerBooleanOption datepickerBooleanOption) {
		Boolean option = null;
		try {
			option = this.datepickerGetBooleanOption(datepickerBooleanOption.name());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerGetBooleanOption " + datepickerBooleanOption.name());
		}
		return option;
	}

	private final native boolean datepickerGetBooleanOption(String optionName) /*-{
		return this.datepicker("option",optionName);
	}-*/;
	
	
	/**
	 * Set a date datepicker option
	 * 
	 * @param optionName
	 * @param optionValue
	 * @return
	 */
	public final JQueryUI datepickerSetDateOption(DatepickerDateOption datepickerDateOption, Date date) {
		return this.datepickerSetDateOption(datepickerDateOption.name(), JSHelper.convertDateToJsDate(date));
	}

	private final native JQueryUI datepickerSetDateOption(String optionName, JsDate date) /*-{
		return this.datepicker("option",optionName,date);
	}-*/;

	/**
	 * Get an date datepicker option
	 * 
	 * @param optionName
	 * @return
	 */
	public final Date datepickerGetDateOption(DatepickerDateOption datepickerDateOption) {
		Date date = null;
		try {
			date = JSHelper.convertJsDateToDate(this.datepickerGetDateOption(datepickerDateOption.name()));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerGetDateOption " + datepickerDateOption.name());
		}
		return date;
	}

	private final native JsDate datepickerGetDateOption(String optionName) /*-{
		return this.datepicker("option",optionName);
	}-*/;

	/**
	 * Returns the .ui-datepicker element. 
	 * 
	 * @return
	 */
	public final native JQueryUI datepickerWidget() /*-{
		return this.datepicker("widget");
	}-*/;


	/**
	 * Determine whether a date picker has been disabled.
	 * @return
	 */
	public final native boolean datepickerIsDisabled() /*-{
		return this.datepicker("isDisabled");
	}-*/;
	
	
	/**
	 * Returns the current date for the datepicker or null if no date has been selected.
	 * @return
	 */
	public final Date datepickerGetDate() {
		Date date = null;
		try {
			date = JSHelper.convertJsDateToDate(this.datepickerGetDateJS());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerGetDate ");
		}
		return date;
	}
	
	private final native JsDate datepickerGetDateJS() /*-{
	return this.datepicker("getDate");
}-*/;

	
	/**
	 * Sets the current date for the datepicker.
	 * Specifies a String in the current dateFormat or  or a string of values and 
	 * periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d')
	 * Default:null today
	 * @param date
	 */
	public final native JQueryUI datepickerSetDate(String date) /*-{
	return this.datepicker("setDate",date);
}-*/;
	
	/**
	 * Sets the current date for the datepicker
	 * Specifies the number of days from today (e.g. +7) 
	 * Default:null today
	 * @param date
	 */
	public final native JQueryUI datepickerSetDate(int date) /*-{
	return this.datepicker("setDate",date);
}-*/;
	
	/**
	 * Sets the current date for the datepicker. Specifies an actual date.
	 * Default:null today
	 * @param date
	 */
	public final JQueryUI datepickerSetDate(Date date) {
		return datepickerSetDate(JSHelper.convertDateToJsDate(date));
	}

	private final native JQueryUI datepickerSetDate(JsDate date) /*-{
	return this.datepicker("setDate",date);
}-*/;
	
	/**
	 * Open a datepicker in a "dialog" box.
	 * @param date the initial date for the date picker
	 * @return
	 */
	public final native JQueryUI datepickerDialog(String date) /*-{
	return this.datepicker("dialog",date);
}-*/;
	


	
	/**
	 * Open a datepicker in a "dialog" box.
	 * @param date the initial date for the date picker
	 * @param callback  A onSelect callback function when a date is selected. The function receives the date text and date picker instance as parameters.
	 * @return
	 */
	public final native JQueryUI datepickerDialog(String date,DatepickerEventHandler callback) /*-{
	return this.datepicker("dialog",date,function(dateText, inst){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DatepickerEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerEventHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Ljava/lang/String;Lcom/google/gwt/user/client/Element;)(callback,currentJQuery,dateText, inst);
	});
}-*/;


	/**
	 * Open a datepicker in a "dialog" box.
	 * @param date the initial date for the date picker
	 * @param callback  A onSelect callback function when a date is selected. The function receives the date text and date picker instance as parameters.
	 * @param options The new settings for the date picker.
	 * @return
	 */	
	public final native JQueryUI datepickerDialog(String date,DatepickerEventHandler callback,DatepickerOptions options) /*-{
	return this.datepicker("dialog",date,function(dateText, inst){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DatepickerEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerEventHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Ljava/lang/String;Lcom/google/gwt/user/client/Element;)(callback,currentJQuery,dateText, inst);
	},options);
}-*/;




	/**
	 * Open a datepicker in a "dialog" box.
	 * @param date the initial date for the date picker
	 * @param callback  A onSelect callback function when a date is selected. The function receives the date text and date picker instance as parameters.
	 * @param options The new settings for the date picker.
	 * @param x,y The position of the top/left of the dialog as [x, y]. If not specified the dialog is centered on the screen.
	 * @return
	 */		
	public final native JQueryUI datepickerDialog(String date,DatepickerEventHandler callback,DatepickerOptions options,int x,int y) /*-{
	return this.datepicker("dialog",date,function(dateText, inst){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DatepickerEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerEventHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Ljava/lang/String;Lcom/google/gwt/user/client/Element;)(callback,currentJQuery,dateText, inst);
	},options,[x,y]);
}-*/;


	
	/**
	 * Utility to Set settings for all datepicker instances.
	 * @param options
	 */
	public final static native void datepickerSetDefaults(DatepickerOptions options) /*-{
	     $wnd.jQuery.datepicker.setDefaults(options);
	}-*/;
	
	/**
	 * Format a date into a string value with a specified format.
	 * http://docs.jquery.com/UI/Datepicker/formatDate
	 * @param format
	 * @param date
	 * @return
	 */
	public final static String datepickerFormatDate(String format,Date date) {
		String value = null;
		try {
			value = datepickerFormatDate(format, JSHelper.convertDateToJsDate(date));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerFormatDate " + format+" "+date);
		}
		return value;
	}
	
	
	
	private  final static native String datepickerFormatDate(String format,JsDate date) /*-{
       return $wnd.jQuery.datepicker.formatDate(format,date);
}-*/;
	

	/**
	 * Format a date into a string value with a specified format.
	 * http://docs.jquery.com/UI/Datepicker/formatDate
	 * @param format
	 * @param date
	 * @param options : Allows the following settings dayNamesShort,dayNames,monthNamesShort,monthNames 
	 * @return
	 */
	public final static String datepickerFormatDate(String format,Date date,DatepickerOptions options) {
		String value = null;
		try {
			value = datepickerFormatDate(format, JSHelper.convertDateToJsDate(date),options);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerFormatDate " + format+" "+date);
		}
		return value;
	}
	
	private  final static native String datepickerFormatDate(String format,JsDate date,DatepickerOptions options) /*-{
       return $wnd.jQuery.datepicker.formatDate(format,date,options);
}-*/;
	
	

	/**
	 * Extract a date from a string value with a specified format.
	 * http://docs.jquery.com/UI/Datepicker/formatDate
	 * @param format
	 * @param value
	 * @return
	 */
	public final static Date datepickerParseDate(String format,String value) {
		Date date = null;
		try {
			date = JSHelper.convertJsDateToDate(datepickerParseDateJS(format,value));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerParseDate " + format+" "+value);
		}
		return date;
	}
	
	
	private  final static native JsDate datepickerParseDateJS(String format,String value) /*-{
       return $wnd.jQuery.datepicker.parseDate(format,value);
}-*/;
	
	/**
	 * Extract a date from a string value with a specified format.
	 * http://docs.jquery.com/UI/Datepicker/formatDate
	 * @param format
	 * @param value
	 * @param options  Allows the following settings shortYearCutoff ,dayNamesShort ,dayNames ,monthNamesShort ,monthNames 
	 * @return
	 */
	public final static Date datepickerParseDate(String format,String value,DatepickerOptions options) {
		Date date = null;
		try {
			date = JSHelper.convertJsDateToDate(datepickerParseDateJS(format,value,options));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error in datepickerParseDate " + format+" "+value);
		}
		return date;
	}
	
	
	private  final static native JsDate datepickerParseDateJS(String format,String value,DatepickerOptions options) /*-{
       return $wnd.jQuery.datepicker.parseDate(format,value,options);
}-*/;
	
	
	/**
	 * Find the week of the year for a date.
	 * @param date
	 * @return
	 */
	public final static int datepickerISO8601Week(Date date) {
		return datepickerISO8601Week(JSHelper.convertDateToJsDate(date));
	}
	
	
	private  final static native int datepickerISO8601Week(JsDate date) /*-{
       return $wnd.jQuery.datepicker.iso8601Week(date);
}-*/;
	

	/**
	 * Get the JQuery UI Plugin
	 * 
	 * @return
	 */
	public final static JQueryUI getJQueryUI(JQuery jquery) {
		return jquery.cast();
	}
}