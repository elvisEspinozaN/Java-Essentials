package org.LIL.SyntaxStructure.webservice;

import org.LIL.SyntaxStructure.business.ReservationService;
import org.LIL.SyntaxStructure.business.RoomReservation;
import org.LIL.SyntaxStructure.data.Guest;
import org.LIL.SyntaxStructure.data.Room;
import org.LIL.SyntaxStructure.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController // tells Spring to place a @ResponseBody on each of our methods
@RequestMapping("/api")
public class WebServiceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebServiceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET) // /api/reservation
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false)String dateString) {
        // comes in null, automatically insert the current date (now) : null safe
        Date date = this.dateUtils.createDateFromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping(path = "/guests")
    public List<Guest> getGuests() {
        return this.reservationService.getHotelGuests();
    }

    @PostMapping(path = "/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void setGuest(@RequestBody Guest guest) {
        this.reservationService.addGuest(guest);
    }

    @GetMapping("/rooms")
    public List<Room> getRooms() {
        return this.reservationService.getRooms();
    }
}
