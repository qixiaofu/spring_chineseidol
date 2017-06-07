package chineseIdol1;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	
	public Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("Playing "+song+" : ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
