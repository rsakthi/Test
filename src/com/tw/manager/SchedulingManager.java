package com.tw.manager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.tw.constants.IConstants;
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
	
	/**
	 * Method which calculates and produces the scheduled list of track and its talks
	 * @param paramtalklist
	 */
	public void scheduleTalks(List<Talk> paramtalklist){
		
		
	}
	
Set talkdurationset = new HashSet();
	
	public int calculateRequiredTracks(Conference paramobjconf){
		
		int totaltracksrequired = 0;
		int totaltalkhours = 0;
		int totaltalks = paramobjconf.getTalks().size();
		Iterator it = talkdurationset.iterator();		
		
		for(int i=0; i < totaltalks; i++){
			
			totaltalkhours += paramobjconf.getTalks().get(i).getDuration().getTalkDuration();
			talkdurationset.add(Integer.toString(paramobjconf.getTalks().get(i).getDuration().getTalkDuration()));
		}
				
		while(it.hasNext()){
			
			System.out.println("Duration Baskets : "+it.next().toString());
			
		}
		
		//Morning sessions begin at 9am and must finish by 12 noon - 3 hours / 180 mins
		//Afternoon sessions begin at 1pm and must finish in time for the networking event. - 3 hours / 180 mins
		//The networking event can start no earlier than 4:00 and no later than 5:00.
				
		if(totaltalkhours > 0 && totaltalkhours < IConstants.MAX_TRACK_DURATION){
			
				return 1;
					
		}else if (totaltalkhours > IConstants.MAX_TRACK_DURATION ){
					
				return Math.round(totaltalkhours / IConstants.MAX_TRACK_DURATION);
					
		}else{
					
				return totaltracksrequired;
					
		}		
	} 
	

}
