package net.shaikh.journelApp.service;

import net.shaikh.journelApp.Entity.JournelEntity;
import net.shaikh.journelApp.Entity.JournelModule;

import java.util.List;

public interface ServiceInterface {
    public List<JournelEntity> getAllProduct();
    public JournelModule PostJournel(JournelEntity entity);
    public JournelModule GetbyId(String  entity);
    public JournelModule updateJournel(JournelEntity entity);
    public String DeleteJournel(String entity);
}
