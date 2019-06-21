package com.zzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zzz.pojo.Stu;
import com.zzz.service.StuService;

@RestController
public class StuController {
	@Autowired
	private StuService stuService;
	@RequestMapping("/selectAll")
	 //@GetMapping
	public List<Stu> selectAll(){
		
		return stuService.selectAll();
		
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public int delete(@PathVariable("id")int id){
		return stuService.delete(id);
		
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public int insert(@RequestBody Stu stu){
		return stuService.insert(stu);
		
	}
}
