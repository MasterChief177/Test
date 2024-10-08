package de.bs1ts.It12a.bauer.noteservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v3/notes")
public class NoteController {

@GetMapping

Note[] getAll() {
    Note[] data = {
            new Note("HTTP lernen"),
            new Note("Rest-Prinzipien lernen"),
            new Note("Zimmer aufräumen"),
            new Note("Staub saugen")
    };
    return  data;
}
}
