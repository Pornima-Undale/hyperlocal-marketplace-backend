package com.marketplace.repository;

import com.marketplace.entity.MarketplaceService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketplaceServiceRepository
        extends JpaRepository<MarketplaceService, Long> {
}