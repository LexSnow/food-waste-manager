package com.lex.food_waste_manager.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FoodWasteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double weight;
    private Date expirationDate;
    
    @Enumerated(EnumType.STRING)
    private WasteType type;
    
    private Boolean isProcessed = false;

    @ManyToOne
    @JoinColumn(name = "donor_id")
    private FoodDonor donor;

    @ManyToOne
    @JoinColumn(name = "processor_id")
    private Processor processor;
}
