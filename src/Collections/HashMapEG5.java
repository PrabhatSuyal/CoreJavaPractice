package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class HashMapEG5 {
	
	Map<Long, EoneUser> usersMap = new HashMap<Long, EoneUser>();
	
	//IterableMap<String, String> usersMap1 = new HashedMap<>();
	//Devices[] devices = {new Devices(12345, "device1"), new Devices(12346, "device2")}; Arrays.asList(devices);
	
	
	EoneUser prabhat = new EoneUser(1234567890, "Prabhat", new ArrayList<Devices>(Arrays.asList(new Devices(12345, "device1"), new Devices(23456, "device2"))) );  // Arrays.asList, List.of, Stream.of
	EoneUser Deepak = new EoneUser(1234567891, "Deepak", new ArrayList<Devices>(Arrays.asList(new Devices(34567, "device3"), new Devices(456789, "device4"))) );  // Arrays.asList, List.of, Stream.of
	EoneUser Rasmi = new EoneUser(1234567892, "Rasmi", new ArrayList<Devices>(Arrays.asList(new Devices(56789, "device5"), new Devices(654321, "device6"))) );  // Arrays.asList, List.of, Stream.of

	/*usersMap.put(prabhat.getmsisdn(), prabhat);
	usersMap.put(Deepak.getmsisdn(), Deepak);
	usersMap.put(Rasmi.getmsisdn(), Rasmi);

	usersMap.forEach(e -> System.Out.println(e.value());)
*/
}



class Devices {
	
	long imei;
	String deviceName;
	
	public Devices(long imei, String deviceName) {
		super();
		this.imei = imei;
		this.deviceName = deviceName;
	}

	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	

}