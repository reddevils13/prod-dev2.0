package com.sapient.controller;


import com.sapient.model.Warehouse;
import com.sapient.model.WarehouseItems;
import com.sapient.repository.ItemReservationRepo;
import com.sapient.repository.WarehouseItemsRepo;
import com.sapient.repository.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class InventoryController {
    @GetMapping("/")
    public String check(){
        return "Hello!!";
    }

    @Autowired
    WarehouseRepo warehouseRepo;

    @Autowired
    WarehouseItemsRepo warehouseItemsRepo;

    @Autowired
    ItemReservationRepo itemReservationRepo;

//    getWarehouseByLocation
    @GetMapping("/warehouse/{location}")
    public ResponseEntity<List<Warehouse>> getWarehouseByLocation(@PathVariable String location){
        return new ResponseEntity<>(warehouseRepo.findWarehouseByWarehouseLocation(location), HttpStatus.OK);
    }

//  createWarehouse
    @PostMapping("/warehouse")
    public ResponseEntity<Warehouse> createWarehouse(@RequestBody Warehouse warehouse){
        System.out.println(warehouse.toString());
        return new ResponseEntity<>(warehouseRepo.save(warehouse), HttpStatus.OK);
    }

    @PostMapping("/warehouseitems")
    public ResponseEntity<WarehouseItems> createWarehouseItems(@RequestBody WarehouseItems warehouseItems){
        System.out.println(warehouseItems.toString());
        return new ResponseEntity<>(warehouseItemsRepo.save(warehouseItems), HttpStatus.OK);
    }

//    getOnhandSupplyOfItemByProductId
    @GetMapping("/warehouse/items/{productId}")
    public ResponseEntity<List<WarehouseItems>> getOnHandSupplyOfItemByProductId(@PathVariable int productId){
        List<Integer> prodId = new ArrayList<>();
        prodId.add(productId);
        return new ResponseEntity<>(warehouseItemsRepo.findAllById(prodId), HttpStatus.OK);
    }

//

}
