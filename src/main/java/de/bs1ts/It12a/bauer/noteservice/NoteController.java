package de.bs1ts.It12a.bauer.noteservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v3/notes")
public class NoteController {

    private Note[] data = {
            new Note("HTTP lernen", 0),
            new Note("Rest-Prinzipien lernen",1),
            new Note("Zimmer aufräumen",2),
            new Note("Staub saugen",3),
            new Note("Langweilen",4),
            new Note("Hausaufgaben erledigen", 5)
    };

    @GetMapping
    Note[] getAll() {
        return this.data;
    }

    @GetMapping("/{id}")
    public Note getOne(@PathVariable int id) {
        if ((id < this.data.length) && (this.data[id] != null)) {
            return this.data[id];
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
