package com.jai.springcloud.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jai.springcloud.model.Voucher;

@Repository
public interface VoucherRepo extends JpaRepository<Voucher,Long> {

	
	   // Optional<Voucher> findById(String id);

		Optional<Voucher> findByCode(String code);


}
