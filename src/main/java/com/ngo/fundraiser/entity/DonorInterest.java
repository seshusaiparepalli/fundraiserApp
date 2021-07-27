package com.ngo.fundraiser.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DonorInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donerInterestID;



}
