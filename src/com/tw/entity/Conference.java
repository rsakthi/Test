/**
 * 
 */
package com.tw.entity;

import java.util.Date;
import java.util.List;

/**
 * @author ramas7
 *
 */
public class Conference {
	
	private String conferencename;
	private Date conferencedate;
	//Conference can have zero or more talks
	List<Talk> talks; //Composition Relationship
	
	/**
	 * @return the conferencename
	 */
	public String getConferencename() {
		return conferencename;
	}
	/**
	 * @param conferencename the conferencename to set
	 */
	public void setConferencename(String conferencename) {
		this.conferencename = conferencename;
	}
	/**
	 * @return the conferencedate
	 */
	public Date getConferencedate() {
		return conferencedate;
	}
	/**
	 * @param conferencedate the conferencedate to set
	 */
	public void setConferencedate(Date conferencedate) {
		this.conferencedate = conferencedate;
	}
	/**
	 * @return the talks
	 */
	public List<Talk> getTalks() {
		return talks;
	}
	/**
	 * @param talks the talks to set
	 */
	public void setTalks(List<Talk> talks) {
		this.talks = talks;
	}
}
