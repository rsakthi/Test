package com.tw.manager;

import com.tw.entity.Conference;
import com.tw.entity.Duration;
import com.tw.entity.Session;
import com.tw.entity.Talk;
import com.tw.entity.Track;

public class SchedulingManager {
	
	Conference conference;
	Session session;
	Talk talk;
	Track track;
	Duration duration;
	
	/**
	 * @param conference
	 * @param session
	 * @param talk
	 * @param track
	 * @param duration
	 */
	public SchedulingManager(Conference conference, Session session, Talk talk,
			Track track, Duration duration) {
		super();
		this.conference = conference;
		this.session = session;
		this.talk = talk;
		this.track = track;
		this.duration = duration;
	}
	

}
