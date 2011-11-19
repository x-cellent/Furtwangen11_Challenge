package com.xcellent.challenge;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This test class need to pass all its tests. Feel free to add/modify it to your need.
 * 
 * @author stefan.majer@x-cellent.com
 * 
 */
@Test
public class CIDIRTest {

	@Test
	public void testCidr() {
		CIDR localhost = CIDR.of("127.0.0.1/32");
		CIDR localhostNetwork = CIDR.of("127.0.0.0/8");
		CIDR privateNetwork = CIDR.of("192.168.0.0/16");
		CIDR privateIP = CIDR.of("192.168.1.1/32");

		Assert.assertEquals(localhost.getAddress(), "127.0.0.1");
		Assert.assertEquals(localhost.getMask().intValue(), 32);

		Assert.assertEquals(localhostNetwork.getNext(), CIDR.of("127.0.0.1/32"));
	}
}
