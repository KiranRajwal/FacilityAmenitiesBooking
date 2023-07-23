package com.kiran.FacilityAmenitiesBooking1;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.*;

@RestController
public class FacilityController {
    private FacilityService facilityService;

    public FacilityController() {
        facilityService = new FacilityService();
    }

    @PostMapping("/bookFacility")
    public String bookFacility(@RequestParam String name,
                               @RequestParam String date,
                               @RequestParam String startTime,
                               @RequestParam String endTime) {
        LocalDate bookingDate = LocalDate.parse(date);
        LocalTime bookingStartTime = LocalTime.parse(startTime);
        LocalTime bookingEndTime = LocalTime.parse(endTime);

        return facilityService.bookFacility(name, bookingDate, bookingStartTime, bookingEndTime);
    }
}
