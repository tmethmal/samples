package com.mitrai.samples.util.dto;

/**
 * @author Methmal DTO class to hold request data
 */
public class SampleRequest {

	private String stringParameter;

	private Integer intParameter;

	/**
	 * @return the stringParameter
	 */
	public final String getStringParameter() {
		return stringParameter;
	}

	/**
	 * @param stringParameter
	 *            the stringParameter to set
	 */
	public final void setStringParameter(String stringParameter) {
		this.stringParameter = stringParameter;
	}

	/**
	 * @return the intParameter
	 */
	public final Integer getIntParameter() {
		return intParameter;
	}

	/**
	 * @param intParameter
	 *            the intParameter to set
	 */
	public final void setIntParameter(Integer intParameter) {
		this.intParameter = intParameter;
	}

}
