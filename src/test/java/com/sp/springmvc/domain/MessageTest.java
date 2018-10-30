package com.sp.springmvc.domain;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

import org.junit.Before;

import com.sp.springmvc.domain.Message;


public class MessageTest {
	
	@Mock
	Message msg;
	
	@Before
	public void setup(){
		msg=new Message("Shubham","hello");
	}
	
	@Test
	public void testGetName(){
		assertEquals(msg.getName(),"Shubham");
	}
	
	@Test
	public void testGetText(){
		assertEquals(msg.getText(),"hello");
	}

}
