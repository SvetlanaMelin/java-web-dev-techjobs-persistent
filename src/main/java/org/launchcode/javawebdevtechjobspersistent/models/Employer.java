package org.launchcode.javawebdevtechjobspersistent.models;

import org.apache.catalina.LifecycleState;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @Size(max = 200, message = "Location can not be longer than 200 characters!")
    @NotBlank(message = "Please, enter a location!")

    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

public  Employer(){

}

    public Employer(String location){

        this.location = location;
    }


    public String getLocation(){
        return location;
    }
    public  void setLocation(String location){
        this.location = location;
    }
private List<Job>getJobs(){
        return jobs;
}


    }

