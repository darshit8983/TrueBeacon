package com.tb.console.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tb.console.dto.HistData;
import com.tb.console.repository.SqLiteRepository;

@RestController()
@RequestMapping("tb")
public class HistoricalDataController {
	
	@Autowired
	SqLiteRepository repo;
	
	@GetMapping("/historical-data")
	public ResponseEntity<List<HistData>> getHistData(@RequestParam String symbol
			                ,@RequestParam String fromDate,@RequestParam String toDate) {
		return ResponseEntity.ok(repo.getHistDataforInst(symbol,fromDate,toDate));
	}
	
	@GetMapping("/symbols")
	public ResponseEntity<List<String>> getSymbols() {
		return ResponseEntity.ok(repo.getListOfSymbols());
	}

}
