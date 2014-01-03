package com.tw.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tw.entity.Conference;
import com.tw.entity.Talk;
import com.tw.manager.ConferenceManager;

public class ConferenceUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conference objconf = new Conference();
		objconf.setConferencename("Pega Developers Conference");
		objconf.setConferencedate(new Date());
		
		List talklist = new ArrayList();
		
		//Registering the new talks for the conference
		Talk objtalk = new Talk();
		objtalk.setTalkname("Talk One");
		objtalk.setDuration(15);
		talklist.add(objtalk);
		
		Talk objtalk1 = new Talk();
		objtalk1.setTalkname("Talk Two");
		objtalk1.setDuration(30);
		talklist.add(objtalk1);
		
		Talk objtalk3 = new Talk();
		objtalk3.setTalkname("Talk Three");
		objtalk3.setDuration(30);
		talklist.add(objtalk3);
		
		objconf.setTalks(talklist);
		
		System.out.println("Conference Name: "+objconf.getConferencename());
		System.out.println("Conference Date: "+objconf.getConferencedate());
		System.out.println("Conference Talk List: "+objconf.getTalks().get(0).getTalkname() +" - "+objconf.getTalks().get(0).getDuration());
		System.out.println("Conference Talk List: "+objconf.getTalks().get(1).getTalkname() +" - "+objconf.getTalks().get(1).getDuration());
		
		ConferenceManager mgr = new ConferenceManager();
		mgr.calculateRequiredTracks(objconf);
		
		
		
	}

}
