package com.bootStoreProject.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bootStoreProject.entity.MyClothList;
import com.bootStoreProject.entity.cloth;
import com.bootStoreProject.service.ClothService;
import com.bootStoreProject.service.MyClothListService;

@Controller
public class ClothController {

	@Autowired
	private ClothService service;
	
	@Autowired
	private MyClothListService myClothService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/new_register")
	public String newRegister() {
		return "newRegister";
	}
	@GetMapping("/available_clothes")
	public ModelAndView getAllClothes() {
		List<cloth>list = service.getAllClothes();
		ModelAndView m = new ModelAndView();
		m.setViewName("ClothesList");
		m.addObject("cloth",list);
		return new ModelAndView("ClothesList","cloth",list);
	}
	@PostMapping("/save")
	public String addCloth(@ModelAttribute cloth c) {
		service.save(c);
		return "redirect:/";
	}
	@GetMapping("/MyClothes")
	public String getMyClothes(Model model) {
		List<MyClothList>list =  myClothService.getAllMyClothes();
		model.addAttribute("cloth",list);
		return "MyClothes";
	}
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		cloth c = service.getClothById(id);
		MyClothList mb = new MyClothList(c.getId(),c.getName(),c.getMaterial(),c.getPrice());
		myClothService.saveMyClothes(mb);
		return "redirect:/MyClothes";
	}
	@RequestMapping("/editCloth/{id}")
	public String editCloth(@PathVariable("id") int id,Model model) {
		cloth c = service.getClothById(id);
		model.addAttribute("cloth",c);
		return "clothEdit";
	}
	@RequestMapping("/deleteCloth/{id}")
	public String deleteCloth(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_clothes";
	}
}
