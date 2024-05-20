package com.bootStoreProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootStoreProject.entity.MyClothList;
import com.bootStoreProject.repository.MyClothRepository;

@Service
public class MyClothListService {

	
	@Autowired
	private MyClothRepository myCloth;
	
	public void saveMyClothes(MyClothList cloth) {
		myCloth.save(cloth);
	}
	public List<MyClothList> getAllMyClothes(){
		return myCloth.findAll();
	}
	public void deleteById(int id) {
		myCloth.deleteById(id);
	}
}
