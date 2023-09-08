package com.automation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automation.dao.AWSDao;

@Service
public class AWSService {

	private final AWSDao awsDao;

	@Autowired
	public AWSService(AWSDao awsDao) {
		this.awsDao = awsDao;
	}
}
