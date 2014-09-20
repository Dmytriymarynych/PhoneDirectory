package controllers;

import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.PhoneService;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: k.tagintsev
 * Date: 05.10.13
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<Phone> getPhone(String search) {
        return phoneService.getPhones(search);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ExtResult setPhone(@RequestBody Phone phone) {
        return new ExtResult(phoneService.add(phone), phone);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delPhone(@RequestBody Phone phone) {
        phoneService.delete(phone);
        return "del";

    }
}
