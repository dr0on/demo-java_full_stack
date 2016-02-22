package com.thoughtscript.javafullstack.domain;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="task_id")
    int id;
 
    @Column(name="name")
    String name;
    
    @Column(name="email")
    String email;
 
 	public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
 
    public User() {
    }
    
    public String getEmail() {
 		return email;
 	}

 	public void setEmail(String email) {
 		this.email = email;
 	}
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
}