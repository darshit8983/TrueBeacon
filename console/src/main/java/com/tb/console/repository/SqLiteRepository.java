package com.tb.console.repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tb.console.dto.HistData;

@Repository
@SuppressWarnings("deprecation")
public class SqLiteRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<HistData> getHistDataforInst(String inst,String fromDate,String toDate){
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		String sql = "select * from hist_prices where instrument_name in (?) and date(date) BETWEEN date(?) AND date(?);";
		String[] s = {inst,fromDate,toDate};
		List<HistData> data = jdbcTemplate.query(sql ,s,
				(resultSet, rowNum) ->  {	
					String d = resultSet.getString("date").split(" ")[0];
					Date date=null;
					try {
						date = formatter.parse(d);
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("Unable to parse date : " + resultSet.getString("date").split(" ")[0]);
					}
					HistData h =  new HistData(resultSet.getString("instrument_name"), 
							resultSet.getDouble("price")
							,date);

					System.out.println(h);
					return h;
				}
				);
		return data;
	}
	
	public List<String> getListOfSymbols() {
		String sql = "select distinct instrument_name from hist_prices;";
		List<String> symbol = jdbcTemplate.query(sql, (resultSet,rownum) -> 
								new String(resultSet.getString("instrument_name")));
		return symbol;	
	}
}
