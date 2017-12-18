package uk.ac.belfastmet.Weather.domain;

public class Wind {
	private Float spped;
	private String direction;

	public Wind(Float spped, String direction) {
		super();
		this.spped = spped;
		this.direction = direction;
	}

	public Float getSpped() {
		return spped;
	}

	public void setSpped(Float spped) {
		this.spped = spped;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
