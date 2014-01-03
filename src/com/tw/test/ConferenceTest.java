package com.tw.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tw.entity.Conference;

public class ConferenceTest {
	
	private Conference conference;

	@Before
	public void setUp() throws Exception {
		this.conference = new Conference(null, null);
		conference.setConferencedate(new Date());
		conference.setConferencename("Pega Conference");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Conference conf = new Conference("Pega", new Date());
		assertNotNull(conference);
		try {
			conf = testObjCreation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		assertEquals(conference, conf);
	}
	
	
	public Conference testObjCreation() throws Exception {
		Conference conf = new Conference("Pega Conf", new Date());
		return conf;
	}
	

}
