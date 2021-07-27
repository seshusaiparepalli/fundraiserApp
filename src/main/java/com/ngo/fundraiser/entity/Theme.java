package com.ngo.fundraiser.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long themeID;
    private String campaignName;
    private String keywords;
}
