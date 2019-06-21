package com.zzz.dao;

import java.util.List;

import com.zzz.pojo.Stu;


public interface StuDao {
	List<Stu> selectAll();
	
	int delete(int id);
	
	int insert(Stu stu);
}
