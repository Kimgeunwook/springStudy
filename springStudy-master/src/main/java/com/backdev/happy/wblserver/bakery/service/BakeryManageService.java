package com.backdev.happy.wblserver.bakery.service;

import com.backdev.happy.wblserver.bakery.domain.Bakery;
import com.backdev.happy.wblserver.bakery.dto.BakeryDto;

public interface BakeryManageService {
    Bakery addBakery(BakeryDto.addBakeryRequest dto);
    Bakery deleteBakery(BakeryDto.deleteBakeryRequest dto);
    Bakery soldoutBakery(BakeryDto.soldoutBakeryRequest dto);
}
