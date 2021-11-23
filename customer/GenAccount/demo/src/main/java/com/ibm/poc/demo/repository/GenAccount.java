package com.ibm.poc.demo.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
 
@Component
@Entity
@Table(name = "GENACCOUNT")

@Data


public class GenAccount {

    @Id
    @Column(name = "CUSTOMERNUMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long customerNumer;
}
