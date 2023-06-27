package com.jai.springcloud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.springcloud.model.Voucher;
import com.jai.springcloud.repos.VoucherRepo;

@RestController
@RequestMapping("/voucherapi")
public class VoucherRestController {
	
	@Autowired
	VoucherRepo voucherRepo;
	
	@PostMapping
	public Voucher create(@RequestBody Voucher voucher) {
		
		return voucherRepo.save(voucher);
		
	}
	
	@GetMapping(value = "{code}")
	public Optional<Voucher> create(@PathVariable("code") String code) {
		
		return voucherRepo.findByCode(code);
		
	}

}
