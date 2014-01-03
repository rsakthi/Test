/**
 * 
 */
package com.tw.entity;

import com.tw.exception.InvalidTalkException;

/**
 * @author ramas7
 *
 */
public class Talk{
	
	private String talkname;	
	Duration duration;
	
	
	/**
	 * @param talkname
	 * @param duration
	 */
	public Talk(String talkname, Duration duration) {
		super();
		this.talkname = talkname;
		this.duration = duration;
	}

	/**
	 * @return the talkname
	 */
	public String getTalkname() {
		return talkname;
	}

	/**
	 * @param talkname the talkname to set
	 */
	public void setTalkname(String talkname) {
		this.talkname = talkname;
	}

	/**
	 * @return the duration
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime * result
				+ ((talkname == null) ? 0 : talkname.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		System.out.println(duration.getTalkDuration());
		Talk other = (Talk) obj;
		System.out.println(other.duration.getTalkDuration());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Talk))
			return false;
		//Talk other = (Talk) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (duration.getTalkDuration() != (other.duration.getTalkDuration()))
			return false;
		if (talkname == null) {
			if (other.talkname != null)
				return false;
		} else if (!talkname.equals(other.talkname))
			return false;
		return true;
	}	
	
}
