package com.example.demo.RelationsBykowski.OneToMany2way;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {
}
