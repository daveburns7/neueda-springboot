package uk.ac.belfastmet.LargestBuildings.domain;

public class FloorArea {

	private String name;
	private int rank;
	private String picture;

	public FloorArea(String name, int rank, String picture) {

		this.name = name;
		this.rank = rank;
		this.picture = picture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
