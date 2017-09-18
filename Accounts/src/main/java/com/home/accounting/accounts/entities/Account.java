package com.home.accounting.accounts.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class Account implements IAccount, Serializable {



	AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
			new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
			.build(); 

	
	/**
	 * Default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	private final String name;
	
	@Getter
	private final String description;
	
	@Getter
	private final String status;
	
	@Getter
	private final String type;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private long id;

	@Override
	public IAccount save() {
		
		return null;
	}

	@Override
	public IAccount update() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void initialize() {
		
	}
	
}
