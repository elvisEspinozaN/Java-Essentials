package org.LIL.SyntaxStructure.web;

import org.LIL.SyntaxStructure.business.ReservationService;
import org.LIL.SyntaxStructure.business.RoomReservation;
import org.LIL.SyntaxStructure.util.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationController {

    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public RoomReservationController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    // Model from MVC
    @RequestMapping(method = RequestMethod.GET)
    // dateString needs to come from somewhere
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model) {
        Date date = this.dateUtils.createDateFromDateString(dateString); // dateString that is passed in
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        // live model -> pass it our list
        model.addAttribute("roomreservation", roomReservations);
        // string is the name of the template we want to return
        return "roomres";
    }

}
