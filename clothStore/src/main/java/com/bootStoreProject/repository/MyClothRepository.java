package com.bootStoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootStoreProject.entity.MyClothList;

@Repository
public interface MyClothRepository extends JpaRepository<MyClothList,Integer>{

}
