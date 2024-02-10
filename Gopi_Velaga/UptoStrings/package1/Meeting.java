package package1;

class Meeting {
	
	String url;
	double time;
	String host;
	Participant par;
	
	void createMeeting(String url, double time, String host, Participant par) {
		this.url = url;
		this.time = time;
		this.host = host;
		this.par = par;
	}

}
