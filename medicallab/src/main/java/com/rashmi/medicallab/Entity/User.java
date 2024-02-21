package com.rashmi.medicallab.Entity;

import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "users")
public class User {
    
@Id
private String id;
private String username;
private String password;
private String name;
private int age;
private String mobile;
private String email;
private Set<Role> roles;
}




