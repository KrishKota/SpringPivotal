package com.sai.microservices.MicroServiceDemo1;

public class TempConvertBean {

	
	private String from;
	private String to;
	private double conversionValue;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getConversionValue() {
		return conversionValue;
	}
	public void setConversionValue(double conversionValue) {
		this.conversionValue = conversionValue;
	}
	public TempConvertBean(String from, String to, double conversionValue) {
		super();
		this.from = from;
		this.to = to;
		this.conversionValue = conversionValue;
	}
	public TempConvertBean() {
		super();
	}
	
}
