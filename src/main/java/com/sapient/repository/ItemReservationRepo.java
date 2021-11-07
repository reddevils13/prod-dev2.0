package com.sapient.repository;

import com.sapient.model.ItemReservation;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemReservationRepo extends CassandraRepository<ItemReservation, Integer> {

}
