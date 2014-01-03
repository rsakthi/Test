package com.tw.entity;

import java.util.Calendar;

public class Duration {
	
	Calendar starttime;
	Calendar endtime;
	Session session;
	
	/**
	 * @param starttime
	 * @param endtime
	 */
	public Duration(Calendar starttime, int duration) {
		super();
		this.starttime = this.endtime = starttime;
		endtime.add(endtime.MINUTE, duration);
		//session = endtime.AM_PM;
		
	}
	
	
	/**
	 * @param starttime
	 * @param endtime
	 */
	public Duration(Calendar starttime, Calendar endtime) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
	}
	
	
	
	/**
	 * @return the starttime
	 */
	public Calendar getStarttime() {
		return starttime;
	}
	/**
	 * @param starttime the starttime to set
	 */
	public void setStarttime(Calendar starttime) {
		this.starttime = starttime;
	}
	/**
	 * @return the endtime
	 */
	public Calendar getEndtime() {
		return endtime;
	}
	/**
	 * @param endtime the endtime to set
	 */
	public void setEndtime(Calendar endtime) {
		this.endtime = endtime;
	}

}
