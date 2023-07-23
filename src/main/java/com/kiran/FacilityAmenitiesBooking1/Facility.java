package com.kiran.FacilityAmenitiesBooking1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Facility {
    private String name;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private double costPerHour;
    private boolean isBooked;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public double getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(int costPerHour) {
		this.costPerHour = costPerHour;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public Facility(String name, LocalDate date, LocalTime startTime, LocalTime endTime, double costPerHour
			) {
		super();
		this.name = name;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.costPerHour = costPerHour;
		
	}
	public Facility() {
		super();
	}
    

    // Constructors, getters, setters
}
