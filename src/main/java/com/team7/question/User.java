package com.team7.question;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private int id;


    private String name;
}


//	<plugin>
//				<groupId>org.springframework.boot</groupId>
//				<artifactId>spring-boot-maven-plugin</artifactId>
//
//				<configuration>
//					<excludes>
//						<exclude>
//							<groupId>org.projectlombok</groupId>
//							<artifactId>lombok</artifactId>
//						</exclude>
//					</excludes>
//				</configuration>
//			</plugin>