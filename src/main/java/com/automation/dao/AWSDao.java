package com.automation.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.automation.repository.AWSRepository;

public class AWSDao {

	private final AWSRepository awsRepo;

	@Autowired
	public AWSDao(AWSRepository awsRepo) {
		this.awsRepo = awsRepo;
	}
}
