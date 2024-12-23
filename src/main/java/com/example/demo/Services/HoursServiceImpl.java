package com.example.demo.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.SupportTime;
import com.example.demo.Repository.*;
import com.example.demo.Exception.ResourceNotFoundException;

@Service
public class HoursServiceImpl implements HoursService {
	@Autowired
    private SupportTimeRepository supportTimeRepository;
	
    @Override
    public List<SupportTime> getDefaultHours() {
    	return supportTimeRepository.findByDateAfterOrDateEquals(LocalDate.now(), LocalDate.now());
    }


    @Override
    public SupportTime addSpecialHours(SupportTime specialHours) {
        return supportTimeRepository.save(specialHours);
    }

    @Override
    public void deleteSpecialHours(Long id) {
//    	SupportTime specialHours = supportTimeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("SpecialHours not found with id: " + id));
//    	supportTimeRepository.delete(specialHours);
    }


	@Override
	public List<SupportTime> getSpecialHours() {
		return supportTimeRepository.findBySupportType(1);
	}
}
