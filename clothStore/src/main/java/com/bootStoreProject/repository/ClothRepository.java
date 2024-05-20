package com.bootStoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootStoreProject.entity.cloth;

@Repository
public interface ClothRepository extends JpaRepository<cloth,Integer>{

}
