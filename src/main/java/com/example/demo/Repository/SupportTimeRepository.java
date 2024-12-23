package com.example.demo.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.SupportTime;

public interface SupportTimeRepository extends JpaRepository<SupportTime, Long> {
	List<SupportTime> findByDateAfterOrDateEquals(LocalDate date, LocalDate today);
	List<SupportTime> findBySupportType(int supportType);
}