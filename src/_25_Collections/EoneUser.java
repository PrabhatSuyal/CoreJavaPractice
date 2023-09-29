package _25_Collections;

import java.util.List;

public class EoneUser {
	
	long msisdn;
	String name;
	List<Devices> devices;
	
	public EoneUser(long msisdn, String name, List<Devices> devices) {
		super();
		this.msisdn = msisdn;
		this.name = name;
		this.devices = devices;
	}

	public long getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Devices> getDevices() {
		return devices;
	}

	public void setDevices(List<Devices> devices) {
		this.devices = devices;
	}
	
	

}
