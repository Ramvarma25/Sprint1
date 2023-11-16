package com.project.groceryshop.services;

import com.project.groceryshop.dao.StaffDao;
import com.project.groceryshop.entities.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    private StaffDao staffDao;

    public String createStaff(Staff staff) {
        return staffDao.save(staff).toString();
    }

    public String getStaff(Long staffId) {
        return staffDao.findById(staffId).orElse(null).toString();
    }

    public Iterable<Staff> getAllStaff() {
        return staffDao.findAll();
    }

    public Staff updateStaff(Long staffId, Staff updateStaff) {
        Staff staffToUpdate = staffDao.findById(staffId).orElse(null);

        if (staffToUpdate != null) {
            staffToUpdate.setName(updateStaff.getName());
            staffToUpdate.setAddress(updateStaff.getAddress());
            staffToUpdate.setRole(updateStaff.getRole());
            staffToUpdate.setPhoneNumber(updateStaff.getPhoneNumber());
            return staffDao.save(staffToUpdate);
        } else {
            return null;
        }
    }

    public String deleteStaff(Long staffId) {
        staffDao.deleteById(staffId);
        return "Deleted Succesfully";
    }
}
