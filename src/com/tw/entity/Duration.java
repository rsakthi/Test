package com.tw.entity;

import java.util.Calendar;

public class Duration {
	
	int talkduration;
	Calendar starttime;
	Calendar endtime;
	Session session;
	
	/**
	 * @param starttime
	 * @param endtime
	 */
	public Duration(int talkduration) {
		super();
		this.talkduration = talkduration;
		//this.starttime = this.endtime = starttime;
		//endtime.add(endtime.MINUTE, talkduration);
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


	/**
	 * @return the duration
	 */
	public int getTalkDuration() {
		return talkduration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setTalkDuration(int duration) {
		this.talkduration = duration;
	}


	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}


	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endtime == null) ? 0 : endtime.hashCode());
		result = prime * result + ((session == null) ? 0 : session.hashCode());
		result = prime * result
				+ ((starttime == null) ? 0 : starttime.hashCode());
		result = prime * result + talkduration;
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Duration))
			return false;
		Duration other = (Duration) obj;
		if (endtime == null) {
			if (other.endtime != null)
				return false;
		} else if (!endtime.equals(other.endtime))
			return false;
		if (session != other.session)
			return false;
		if (starttime == null) {
			if (other.starttime != null)
				return false;
		} else if (!starttime.equals(other.starttime))
			return false;
		if (talkduration != other.talkduration)
			return false;
		return true;
	}

}
