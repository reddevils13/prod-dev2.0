package com.sapient.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class WarehouseItems {

    @PrimaryKey
    int productId;

    @Column
    int quantityAvailable;

    @Column
    int warehouseId;

    @Column
    String warehouseLocation;

}
