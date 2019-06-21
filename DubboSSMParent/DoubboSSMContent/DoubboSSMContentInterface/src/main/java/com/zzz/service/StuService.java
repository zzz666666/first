package com.zzz.service;

import java.util.List;

import com.zzz.pojo.Stu;

public interface StuService {
	List<Stu> selectAll();
	
	int delete(int id);
	
	int insert(Stu stu);
}
