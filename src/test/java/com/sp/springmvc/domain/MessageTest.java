package com.sp.springmvc.domain;
import org.junit.Test;
import static org.junit.Assert.*;
import com.sp.springmvc.domain.Message;


public class MessageTest {
	
	@Test
	public void testGetName(){
		Message msg=new Message("Shubham","hello");
		assertTrue(msg.getName().equals("Shubham"));
	}
	
	@Test
	public void testGetText(){
		Message msg=new Message("Shubham","hello");
		assertTrue(msg.getText().equals("hello"));
	}

}
