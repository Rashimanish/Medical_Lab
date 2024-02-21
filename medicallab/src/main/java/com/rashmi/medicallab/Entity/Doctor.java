package com.rashmi.medicallab.Entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "doctors")
public class Doctor extends User{
    private String Specialization;
    private List<TimeSlot>availableTimeSlots;
    
}
