package uk.ac.belfastmet.TitanicDatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private Integer passengerId;
	private Integer survived;
	private Integer pclass;
	private String name;
	private String sex;
	private Float age;
	private Integer sibsp;
	private Integer parch;
	private String ticket;
	private Float fare;
	private String cabin;
	private String embarked;

	public Passenger() {
		super();
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public Integer getSurvived() {
		return survived;
	}

	public void setSurvived(Integer survived) {
		this.survived = survived;
	}

	public Integer getPclass() {
		return pclass;
	}

	public void setPclass(Integer pclass) {
		this.pclass = pclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	public Integer getSibsp() {
		return sibsp;
	}

	public void setSibsp(Integer sibsp) {
		this.sibsp = sibsp;
	}

	public Integer getParch() {
		return parch;
	}

	public void setParch(Integer parch) {
		this.parch = parch;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Float getFare() {
		return fare;
	}

	public void setFare(Float fare) {
		this.fare = fare;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getEmbarked() {
		return embarked;
	}

	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}

}