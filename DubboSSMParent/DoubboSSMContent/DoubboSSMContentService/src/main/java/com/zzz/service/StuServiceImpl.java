package com.zzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzz.dao.StuDao;
import com.zzz.pojo.Stu;
import com.zzz.service.StuService;
@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuDao stuDao;
	@Override
	public List<Stu> selectAll() {
		
		return stuDao.selectAll();
	}
	@Override
	public int delete(int id) {
		
		return stuDao.delete(id);
	}
	@Override
	public int insert(Stu stu) {
		
		return stuDao.insert(stu);
	}

}
