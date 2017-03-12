package com.test.server;

import org.springframework.stereotype.Service;

import com.test.untils.Number;

@Service
public class CommonServer {
 public int getRandom(){
	 return Number.getRandom();
 }
}
