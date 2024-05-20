package com.bootStoreProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootStoreProject.entity.cloth;
import com.bootStoreProject.repository.ClothRepository;

@Service
public class ClothService {

	@Autowired
	private ClothRepository cRepo;
	
	public void save(cloth c){
		cRepo.save(c);
	}
	
	public List<cloth> getAllClothes(){
		return cRepo.findAll();
	}
    public cloth getClothById(int id) {
    	return cRepo.findById(id).get();
    }
    public void deleteById(int id) {
    	cRepo.deleteById(id);
    }
}
