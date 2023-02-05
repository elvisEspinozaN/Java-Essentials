package org.LIL.SyntaxStructure.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // This is a data repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
