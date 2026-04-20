package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.PswdExpired;

public interface PswdExpiredRepository extends JpaRepository<PswdExpired, Integer> {
}