package ua.com.vendigo.knutimetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knutimetable.domain.faculty.Cabinet;
import ua.com.vendigo.knutimetable.service.faculty.CabinetService;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@RestController
@RequestMapping(value = "/admin/")
public class AdminController {

    @Autowired
    CabinetService cabinetService;

    @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    List<Cabinet> getAllCabinets() {
        return cabinetService.findAll();
    }

}
