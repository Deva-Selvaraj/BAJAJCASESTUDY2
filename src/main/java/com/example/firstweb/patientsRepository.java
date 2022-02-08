package com.example.firstweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientsRepository extends JpaRepository<patients,String> {

}
