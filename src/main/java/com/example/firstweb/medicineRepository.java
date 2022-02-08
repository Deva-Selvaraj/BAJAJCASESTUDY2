package com.example.firstweb;


import org.springframework.data.jpa.repository.JpaRepository;

public interface medicineRepository extends JpaRepository<medicines,String> {

}
