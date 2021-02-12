package com.backdev.happy.wblserver.bakery.service.impl;

import com.backdev.happy.wblserver.bakery.domain.Bakery;
import com.backdev.happy.wblserver.bakery.dto.BakeryDto;
import com.backdev.happy.wblserver.bakery.repository.BakeryRepository;
import com.backdev.happy.wblserver.bakery.service.BakeryManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BakeryManageServiceImpl implements BakeryManageService {
    private BakeryRepository bakeryRepository;

    @Override
    public Bakery addBakery(BakeryDto.addBakeryRequest dto) {
        return bakeryRepository.save(dto.toEntity());
    }

    @Override
    public Bakery deleteBakery(BakeryDto.deleteBakeryRequest dto) {
        return null;
    }

    @Override
    public Bakery soldoutBakery(BakeryDto.soldoutBakeryRequest dto) {
        return null;
    }
}
