package com.nestdigital.librarybackendapp.Controller;

import com.nestdigital.librarybackendapp.Model.LibraryModel;
import com.nestdigital.librarybackendapp.dao.LibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/bookentry",consumes = "application/json",produces = "application/json")
    public String Bookentry(@RequestBody LibraryModel library){
        System.out.println(library.toString());
        dao.save(library);
        return "{Status:'Success'}";
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/viewbook")
    public List<LibraryModel> ViewBook(){
        return (List<LibraryModel>)dao.findAll();
    }
}
