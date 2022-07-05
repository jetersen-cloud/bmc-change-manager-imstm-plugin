package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single DELTA PLUS load library
 */

public class DlpLoadLib  {

	private String lib;
	

	/**
	 * Constructor
	 */
	@DataBoundConstructor
	public DlpLoadLib(String lib) {
		this.lib = lib;
		
	}

	public String getLib() {
		return this.lib;
	}
	 public void setLib(String lib) {
		this.lib = lib;
	}
	
	
	
}