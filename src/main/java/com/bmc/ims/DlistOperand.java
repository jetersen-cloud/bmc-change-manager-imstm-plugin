package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single operand relative to an action
 * @param title - Operand's name
 * @param field - Must match the field in DlistRecord and config.jelly for successful binding
 */

public class DlistOperand  {

	private String title;
	private String field;
	private String type;	
	private String[] options;
	private String placeholder;
	

	/**
	 * Constructor
	 */
	@DataBoundConstructor
	public DlistOperand(String title, String field, String type,  String options[], String placeholder) {

		this.title = title;
		this.field = field;
		this.type = type;			
		this.options=(String[])options.clone(); //to avoid  EI_EXPOSE_REP
		this.placeholder=placeholder;
		
		
	}

	
	public String[] getOptions() {
		return (String[])options.clone(); //to avoid  EI_EXPOSE_REP
	}
	public String getType() {
		return type;
	}
	public String getField() {
		return field;
	}
	
	public String getTitle() {
		return title;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOptions(String[] options) {
		this.options = (String[])options.clone();   //to avoid  EI_EXPOSE_REP
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	
}