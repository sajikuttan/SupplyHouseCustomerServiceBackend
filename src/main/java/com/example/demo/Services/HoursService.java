package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.SupportTime;

public interface HoursService {
	List<SupportTime> getDefaultHours();
	List<SupportTime> getSpecialHours();
	SupportTime addSpecialHours(SupportTime specialHours);
    void deleteSpecialHours(Long id);
}
