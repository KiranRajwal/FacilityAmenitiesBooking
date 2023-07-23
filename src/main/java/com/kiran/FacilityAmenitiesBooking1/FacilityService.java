package com.kiran.FacilityAmenitiesBooking1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FacilityService {
    private List<Facility> facilities;

    public FacilityService() {
        facilities = new ArrayList<>();
        // Add facilities to the list with their configuration
       // facilities.add(new Facility("Clubhouse", LocalDate.of(2020, 10, 26), LocalTime.of(10, 0), LocalTime.of(16, 0), 166));
        facilities.add(new Facility("Clubhouse", LocalDate.of(2020, 10, 26), LocalTime.of(16, 0), LocalTime.of(22, 0), 166.7));
        facilities.add(new Facility("Tennis Court", LocalDate.of(2020, 10, 26), LocalTime.of(10, 0), LocalTime.of(22, 0), 33.34));
    }

    public String bookFacility(String name, LocalDate date, LocalTime startTime, LocalTime endTime) {
        for (Facility facility : facilities) {
            if (facility.getName().equals(name) && facility.getDate().equals(date)
                    && !facility.isBooked() && isTimeSlotAvailable(facility, startTime, endTime)) {
                facility.setBooked(true);
                long hoursBooked = Duration.between(startTime, endTime).toHours();
                double totalCost = facility.getCostPerHour() * (int) hoursBooked;
                int convertedNum= (int)Math.floor(totalCost);
                return "Booked, Rs. " + convertedNum;
            }
        }
        return "Booking Failed, Already Booked";
    }

    private boolean isTimeSlotAvailable(Facility facility, LocalTime startTime, LocalTime endTime) {
        for (Facility bookedFacility : facilities) {
            if (facility.getName().equals(bookedFacility.getName()) && facility.getDate().equals(bookedFacility.getDate())
                    && bookedFacility.isBooked() && isTimeOverlap(startTime, endTime, bookedFacility.getStartTime(), bookedFacility.getEndTime())) {
                return false;
            }
        }
        return true;
    }

    private boolean isTimeOverlap(LocalTime start1, LocalTime end1, LocalTime start2, LocalTime end2) {
        return start1.isBefore(end2) && end1.isAfter(start2);
    }
}
