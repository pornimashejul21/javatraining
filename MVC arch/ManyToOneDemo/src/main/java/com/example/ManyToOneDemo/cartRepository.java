package com.example.ManyToOneDemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface cartRepository extends JpaRepository<cart,Integer> {

}
