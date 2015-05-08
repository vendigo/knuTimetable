package ua.com.vendigo.knutimetable.controller.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.vendigo.knutimetable.domain.faculty.Cabinet;
import ua.com.vendigo.knutimetable.service.faculty.CabinetService;

import java.util.List;

@RestController
@RequestMapping(value = "cabinet")
public class CabinetController {

    @Autowired
    CabinetService cabinetService;

    @RequestMapping(method = RequestMethod.GET)
    List<Cabinet> getAllCabinets() {
        return cabinetService.findAll();
    }

    @RequestMapping(value = "/{cabinetId}", method = RequestMethod.GET)
    Cabinet getCabinetById(@PathVariable Integer cabinetId) {
        return cabinetService.findOne(cabinetId);
    }

    @RequestMapping(method = RequestMethod.POST)
    void saveCabinet(@ModelAttribute("cabinet") Cabinet cabinet) {
        cabinetService.save(cabinet);
    }

    @RequestMapping(value = "/{cabinetId}", method = RequestMethod.DELETE)
    void deleteCabinet(@PathVariable Integer cabinetId) {
        cabinetService.delete(cabinetId);
    }
}
