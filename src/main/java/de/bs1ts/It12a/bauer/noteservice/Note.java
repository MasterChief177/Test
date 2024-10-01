package de.bs1ts.It12a.bauer.noteservice;

import java.sql.Timestamp;

public class Note {
    public int id=-1;
    public String text="";
    public Timestamp timestamp;
    public Note(){
        this.timestamp= new Timestamp(System.currentTimeMillis());
    }
    public Note(String text){
        this();
        this.text=text;
    }
    public String toString(){
        return "Note{"+"id="+id+",timestamp="+timestamp+'}';
    }
}
