package com.example.ManyToOneDemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface itemsRepository extends JpaRepository<items, Integer>{

}
