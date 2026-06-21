package com.marketplace.controller;

import com.marketplace.entity.MarketplaceService;
import com.marketplace.service.MarketplaceServiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class MarketplaceServiceController {

    private final MarketplaceServiceService service;

    public MarketplaceServiceController(
            MarketplaceServiceService service) {

        this.service = service;
    }

    @PostMapping
    public MarketplaceService createService(
            @RequestBody MarketplaceService marketplaceService) {

        return service.saveService(marketplaceService);
    }
}