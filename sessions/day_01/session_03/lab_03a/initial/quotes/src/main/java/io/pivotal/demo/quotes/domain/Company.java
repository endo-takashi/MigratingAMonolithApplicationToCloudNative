/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.pivotal.demo.quotes.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author 195015
 */
@Entity
@Data
@Table(name = "COMPANIES")
public class Company implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    
    private String name;
    
    private String symbol;
    
    private String exchange;
    
}
