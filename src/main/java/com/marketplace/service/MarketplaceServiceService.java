package com.marketplace.service;

import com.marketplace.entity.MarketplaceService;
import com.marketplace.repository.MarketplaceServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceServiceService {

    private final MarketplaceServiceRepository repository;

    public MarketplaceServiceService(
            MarketplaceServiceRepository repository) {
        this.repository = repository;
    }

    public MarketplaceService saveService(
            MarketplaceService service) {

        return repository.save(service);
    }
}