package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "plans")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
 @Id
 @GeneratedValue
 private Integer id;
 //@Column(nullable = false)
 //private String name;
 @Column(nullable = false)
 private String title;
 @Column(nullable = false)
 private String place;
// @Column
// private String route;
 @Column
 private String memo;

}
