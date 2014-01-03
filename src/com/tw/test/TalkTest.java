package com.tw.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tw.entity.Conference;
import com.tw.entity.Duration;
import com.tw.entity.Talk;

public class TalkTest {
	
	@Test
	public void test() {
		Talk obj1 = new Talk("Test Talk One", new Duration(15));
		Talk obj2 = new Talk("Test Talk One", new Duration(15));
		Talk obj3 = new Talk("Test Talk One", new Duration(30));
		
		System.out.println(obj1.getDuration().getTalkDuration());
		System.out.println(obj2.getDuration().getTalkDuration());
		System.out.println(obj3.getDuration().getTalkDuration());
		assertEquals("Objects are equal", obj1, obj2);
		assertNotEquals("Objects are not equal", obj1, obj3);
		
		
	}

	

}
