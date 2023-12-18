package com.Kaiburr.Task1.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Servers" )
public class Server {
    private String name;
    @Id
    private String ID;
    private String language;
    private String framework;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return ID;
    }

    public void setId(String ID) {
        this.ID = ID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public Server() {
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", id=" + ID +
                ", language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}