package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.SupportTime;
import com.example.demo.Services.HoursService;

@RestController
@RequestMapping("/api/hours")
public class HoursController {
	@Autowired
    private HoursService hoursService;

	@GetMapping("/default")
    public List<SupportTime> getDefaultHours() {
        return hoursService.getDefaultHours();
    }
	
    @GetMapping("/special")
    public List<SupportTime> getSpecialtHours() {
        return hoursService.getSpecialHours();
    }

    @PostMapping("/special")
    public SupportTime addSpecialHours(@RequestBody SupportTime specialHours) {
        return hoursService.addSpecialHours(specialHours);
    }

    @DeleteMapping("/special/{id}")
    public void deleteSpecialHours(@PathVariable Long id) {
        hoursService.deleteSpecialHours(id);
    }
}
