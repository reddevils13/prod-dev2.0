package com.sapient.repository;

import com.sapient.model.WarehouseItems;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseItemsRepo extends CassandraRepository<WarehouseItems, Integer> {

}
