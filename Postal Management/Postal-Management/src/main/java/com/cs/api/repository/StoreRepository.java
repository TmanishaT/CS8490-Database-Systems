package com.cs.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.api.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>{

	List<Store> findByName(String storeName);

}
