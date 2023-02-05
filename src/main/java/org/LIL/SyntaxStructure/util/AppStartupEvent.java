package org.LIL.SyntaxStructure.util;

import org.LIL.SyntaxStructure.data.Room;
import org.LIL.SyntaxStructure.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// we can wait until Spring is done building, before we go improve DB
@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    // it is final, so constructor has to be added
    private final RoomRepository roomRepository;

    public AppStartupEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    /*
    after application has started :
    we have standard output being written that came from DB
    being output onto the console
     */
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);

    }
}
