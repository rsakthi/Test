package com.tw.manager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.tw.constants.IConstants;
import com.tw.entity.Conference;

public class ConferenceManager implements IConstants{
	
	
	
	Set talkdurationset = new HashSet();
	
	public int calculateRequiredTracks(Conference paramobjconf){
		
		int totaltalkhours = 0;
		int totaltalks = paramobjconf.getTalks().size();
		
		
		for(int i=0; i < totaltalks; i++){
			totaltalkhours += paramobjconf.getTalks().get(i).getDuration();
			talkdurationset.add(Integer.toString(paramobjconf.getTalks().get(i).getDuration()));
		}
		
		Iterator it = talkdurationset.iterator();
		while(it.hasNext()){
			System.out.println("Duration Baskets : "+it.next().toString());
		}
		
		System.out.println("Total Number of Hours : "+totaltalkhours);
		
		return totaltalkhours; 
	}
	
	public int calculateRequiredTracks(int paramtotalhours){
		
		int totaltracksrequired = 0;
		
		//Morning sessions begin at 9am and must finish by 12 noon - 3 hours / 180 mins
		//Afternoon sessions begin at 1pm and must finish in time for the networking event. - 3 hours / 180 mins
		//The networking event can start no earlier than 4:00 and no later than 5:00.
		
		if(paramtotalhours > 0 && paramtotalhours < IConstants.MAX_TRACK_DURATION){
			
			return 1;
			
		}else if (paramtotalhours > IConstants.MAX_TRACK_DURATION ){
			
			return Math.round(paramtotalhours / IConstants.MAX_TRACK_DURATION);
			
		}else{
			
			return totaltracksrequired;
			
		}
	}
	
 

}
