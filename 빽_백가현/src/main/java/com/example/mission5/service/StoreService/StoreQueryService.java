package com.example.mission5.service.StoreService;

import com.example.demo.domain.Store;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StoreQueryService {

    Optional<Store> findStore(UUID id);
    List<Store> findStoresByNameAndScore(String name, Float score);
}
