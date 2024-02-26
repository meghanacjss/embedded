package com.example.Embedded.Repository;

import com.example.Embedded.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Person,Integer> {
}
