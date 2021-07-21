package edu.asu.diging.example.web;

import java.util.Date;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model) {
        return "home";
    }
    
    @RequestMapping(value = "/ajax")
    public ResponseEntity<Row> getNewRow() {
        Row newRow = new Row();
        newRow.setUniqueId(UUID.randomUUID().toString());
        newRow.setTimestamp(new Date().toString());
        return new ResponseEntity<>(newRow, HttpStatus.OK);
    }
}