package uk.ac.belfastmet.TitanicDatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passengers {

	public Passengers(Integer passengerId, Integer survived, Integer pclass, String name, String sex, Float age,
			Integer sibSp, Integer parch, String ticket, Float fare, String cabin, String embarked) {
		super();
		this.passengerId = passengerId;
		this.survived = survived;
		Pclass = pclass;
		Name = name;
		Sex = sex;
		Age = age;
		SibSp = sibSp;
		Parch = parch;
		Ticket = ticket;
		Fare = fare;
		Cabin = cabin;
		Embarked = embarked;
	}

	@Id
	@GeneratedValue
	private Integer passengerId;
	private Integer survived;
	private Integer Pclass;
	private String Name;
	private String Sex;
	private Float Age;
	private Integer SibSp;
	private Integer Parch;
	private String Ticket;
	private Float Fare;
	private String Cabin;
	private String Embarked;

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
		return Pclass;
	}

	public void setPclass(Integer pclass) {
		Pclass = pclass;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public Float getAge() {
		return Age;
	}

	public void setAge(Float age) {
		Age = age;
	}

	public Integer getSibSp() {
		return SibSp;
	}

	public void setSibSp(Integer sibSp) {
		SibSp = sibSp;
	}

	public Integer getParch() {
		return Parch;
	}

	public void setParch(Integer parch) {
		Parch = parch;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

	public Float getFare() {
		return Fare;
	}

	public void setFare(Float fare) {
		Fare = fare;
	}

	public String getCabin() {
		return Cabin;
	}

	public void setCabin(String cabin) {
		Cabin = cabin;
	}

	public String getEmbarked() {
		return Embarked;
	}

	public void setEmbarked(String embarked) {
		Embarked = embarked;
	}

}