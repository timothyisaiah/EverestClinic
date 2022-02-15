package com.everestgauge.bioMedical.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.everestgauge.bioMedical.entity.Admin;
import com.everestgauge.bioMedical.service.AdminServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("consultation")
public class Consultation {
    @Autowired
    AdminServiceImplementation adminServiceImplementation;

    @RequestMapping("/consultation_home")
    public String consultationQueue(Model model) {
        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);

        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        Admin admin = adminServiceImplementation.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        admin.setLastseen(log);

        adminServiceImplementation.save(admin);

        model.addAttribute("name", admin.getFirstName());

        model.addAttribute("email", admin.getEmail());

        model.addAttribute("user", admin.getFirstName() + " " + admin.getLastName());
        return "doctor/consultation/consultation_home";
    }
}
