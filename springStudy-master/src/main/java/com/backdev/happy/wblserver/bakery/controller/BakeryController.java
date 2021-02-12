package com.backdev.happy.wblserver.bakery.controller;

import com.backdev.happy.wblserver.bakery.domain.Bakery;
import com.backdev.happy.wblserver.bakery.dto.BakeryDto;
import com.backdev.happy.wblserver.bakery.service.BakeryManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bakeries")
@RequiredArgsConstructor
public class BakeryController {

    private final BakeryManageService bakeryManageService;

    @PostMapping(value = "/add")
    public ResponseEntity<String> add(@RequestBody BakeryDto.addBakeryRequest request){
        Bakery bakery = bakeryManageService.addBakery(request);
        return new ResponseEntity<>("success to add: "+bakery.toString(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<String> delete(@RequestBody BakeryDto.deleteBakeryRequest request) {
        Bakery bakery = bakeryManageService.deleteBakery(request);
        return new ResponseEntity<>("success to delete: "+bakery.toString(), HttpStatus.OK);
    }

    @PutMapping(value = "/soldout")
    public ResponseEntity<String> soldout(@RequestBody BakeryDto.soldoutBakeryRequest request) {
        Bakery bakery = bakeryManageService.soldoutBakery(request);
        return new ResponseEntity<>("success to soldout: "+bakery.toString(), HttpStatus.OK);
    }
}
