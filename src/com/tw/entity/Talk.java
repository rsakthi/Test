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
	private int duration;
	
	/**
	 * 
	 */
	public Talk() {
		super();
	}


	/**
	 * @throws InvalidTalkException 
	 * @param talkname
	 * @param duration
	 * @throws  
	 */
	public Talk(String talkname, int duration) throws InvalidTalkException  {
		if(talkname.isEmpty() || duration <= 0){
			throw new InvalidTalkException();
		}
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
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}	
	
}
