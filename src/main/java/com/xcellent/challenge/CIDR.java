package com.xcellent.challenge;

import java.net.InetAddress;

/**
 * Example Implementation of a CIDR.
 * 
 * @see "http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
 * 
 * @author stefan.majer@x-cellent.com
 * 
 */
public class CIDR {

	/**
	 * Create a new Instance of a CIDR from a given String in cidr form.
	 * 
	 * This is either in the form 1.2.3.4/24 or 1.2.3.4/255.255.255.0
	 * 
	 * @param cidrNotation
	 *            the input ipAddress/network in cidr notation.
	 * @return the CIDR instance, throws a appropriate Exception on malformed or illegal input.
	 */
	public static CIDR of(String cidrNotation) {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * Create a new Instance from a InetAddress and a Mask.
	 * 
	 * @param inetAddress
	 *            the InetAddress
	 * @param mask
	 *            the mask
	 * @return a CIDR instance.
	 */
	public static CIDR of(InetAddress inetAddress, Integer mask) {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the Address part of this CIDR.
	 */
	public String getAddress() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the Mask (0 - 32) of this CIDR.
	 */
	public Integer getMask() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the Network address of this CIDR
	 */
	public CIDR getNetwork() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the BroadCast Address of this CIDR
	 */
	public CIDR getBroadCast() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the amount of Addresses available in this network.
	 */
	public Long getAddresses() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the next IP in this Network throws a Exception if there is no ip left.
	 */
	public CIDR getNext() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * @return the previoud IP in this Network throws a Exception if there is no ip left.
	 */
	public CIDR getPrevious() {
		throw new IllegalAccessError("Please implement");
	}

	/**
	 * Check if a other cidr is inside this cidr.
	 * 
	 * @param cidr
	 *            the cidr wich is checked against this cidr.
	 * @return true if the given cidr is inside this cidr, otherwise false.
	 */
	public boolean contains(CIDR cidr) {
		throw new IllegalAccessError("Please implement");
	}

}
