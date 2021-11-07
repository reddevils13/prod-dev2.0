package com.sapient.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table @Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ItemReservation {

    @PrimaryKey
    int productId;

    @Column
    int destinationId;

    @Column
    int sourceWarehouseId;

    @Column
    String sourceLocation;
}
