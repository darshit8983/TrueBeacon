package com.tb.console.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tb.console.dto.Holdings;
import com.tb.console.dto.OrdersDto;
import com.tb.console.dto.UserProfile;
import com.tb.console.repository.SqLiteRepository;

@RestController()
@RequestMapping("tb/mock/")
public class MockApiController {
	
	@Autowired
	SqLiteRepository repo;
	
	@GetMapping("/user/profile")
	public ResponseEntity<UserProfile> getUserProfile() {
		return ResponseEntity.ok(UserProfile.dummyBuilder("AB1234", "individual", 
				"xxxyyy@gmail.com", "AxAx Bxx", "ZERODHA"));
	}
	
	@GetMapping("/portfolio/holdings")
	public ResponseEntity<List<Holdings>> getHoldings() {
		return ResponseEntity.ok(Holdings.dummyHoldings());
	}
	
	@PostMapping("order/place_order")
	public ResponseEntity<?> saveWorkoutJunction(@RequestBody OrdersDto dto) {
		String res = "{\n"
				+ "    \"status\": \"success\",\n"
				+ "    \"data\": {\n"
				+ "      \"message\":\"Order Placed Successfully\",\n"
				+ "      \"order_id\": \"151220000000000\"\n"
				+ "    }\n"
				+ "  }";
			return ResponseEntity.ok(res);
	}

}
