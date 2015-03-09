package ua.com.vendigo.knutimetable.controller.admin;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.vendigo.knutimetable.domain.faculty.Cabinet;
import ua.com.vendigo.knutimetable.service.faculty.CabinetService;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/cabinet")
public class CabinetController {

    @Autowired
    CabinetService cabinetService;

    @RequestMapping(method = RequestMethod.GET)
    List<Cabinet> getAllCabinets() {
        return cabinetService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    void saveCabinet(@ModelAttribute("cabinet") Cabinet cabinet) {
        System.out.println(cabinet);
        cabinetService.save(cabinet);
    }

    @RequestMapping(value="/{cabinetId}", method = RequestMethod.DELETE)
    void deleteCabinet(@PathVariable Integer cabinetId) {
        cabinetService.delete(cabinetId);
    }
}
