package com.project.groceryshop.controllers;

import com.project.groceryshop.entities.Staff;
import com.project.groceryshop.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping("/createStaff")
    public String createStaff(@RequestBody Staff staff) {
        return staffService.createStaff(staff);
    }

    @GetMapping("/getStaff/{staffId}")
    public String getStaff(@PathVariable Long staffId) {
        return staffService.getStaff(staffId);
    }

    @GetMapping("/getAllStaff")
    public Iterable<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    @PutMapping("/updateStaff/{staffId}")
    public Staff updateStaff(@PathVariable Long staffId, @RequestBody Staff updateStaff) {
        return staffService.updateStaff(staffId, updateStaff);
    }

    @DeleteMapping("/deleteStaff/{staffId}")
    public String deleteStaff(@PathVariable Long staffId) {
        return staffService.deleteStaff(staffId);
    }
}
