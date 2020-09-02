package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.data.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController {

    @Autowired
    private EmployerRepository employerRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "My Jobs");
        return "index";
    }

    @GetMapping("add")
    public String displayAddJobForm(Model model) {
        model.addAttribute("title", "Add Job");
        model.addAttribute(new Job());
        model.addAttribute("employers", employerRepository.findAll());
        return "add";
    }

    @PostMapping("add")
    public String processAddJobForm(
            @ModelAttribute @Valid Job newJob,
            Errors errors,
            Model model,
            @RequestParam int employerId,
            @RequestParam List<Integer> skills) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Job");
            return "add";
        }
        Optional<Employer> employer = employerRepository.findById(employerId);
        return "redirect:";
    }

    @GetMapping("view/{jobId}")
    public String displayViewJob(Model model, @PathVariable int jobId) {
        return "view";
    }

}
/*
A user will select an employer when they create a job. Add the employer data from employerRepository into the
form template. The add job form already includes an employer selection option. Be sure your variable name for
the employer data matches that already used in templates/add.
Checkout templates/add.html. Make a mental note of the name of the variable being used to pass the selected
employer id on form submission.
In processAddJobForm, add a parameter to the method to pass in the template variable you just found.
You’ll need to use the @RequestParam annotation on this parameter.

Still in processAddJobForm, add code inside of this method to select the employer object that has been chosen to
be affiliated with the new job. You will need to select the employer using the request parameter you’ve added to
the method.
 */