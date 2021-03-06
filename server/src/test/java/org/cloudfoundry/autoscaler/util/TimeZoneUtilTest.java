package org.cloudfoundry.autoscaler.util;

import static org.junit.Assert.assertEquals;

import java.util.TimeZone;

import org.junit.Test;

public class TimeZoneUtilTest {
	
	@Test
	public void parseTimeZoneIdTest(){
		String timeZoneStr1 = "(GMT -11:00) US/Samoa";
		String timeZoneStr2 = "US/Samoa";
		assertEquals(TimeZone.getTimeZone(timeZoneStr2), TimeZoneUtil.parseTimeZoneId(timeZoneStr1));
	}

}
