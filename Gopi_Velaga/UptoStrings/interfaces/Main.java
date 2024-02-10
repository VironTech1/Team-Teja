package interfaces;

class SonyRemote extends TvRemote{
	public void voiceControl() {
		System.out.println("Sony has voice control");
	}
}

class LgRemote extends TvRemote{
	public void enhancedSound() {
		System.out.println("Lg has enhanced sound control");
	}
}

public class Main {

	public static void main(String[] args) {
		
		TvRemote tv = new TvRemote();
		tv.on();
		tv.off();
		tv.incrementVolume();
		tv.decrementVolume();
		
		SonyRemote srem = new SonyRemote();
		srem.on();
		srem.off();
		srem.voiceControl();
		
		LgRemote lrem = new LgRemote();
		lrem.on();
		lrem.off();
		lrem.enhancedSound();
		
		AcRemote ac = new AcRemote();
		ac.on();
		ac.off();
		ac.decreaseTemp();
		ac.increaseTemp();
		
		ProjectorRemote pro = new ProjectorRemote();
		pro.on();
		pro.off();
		pro.deccrementSize();
		pro.incrementSize();

	}

}
