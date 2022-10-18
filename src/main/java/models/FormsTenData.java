package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsTenData {
    private String animal;
    private String text_H;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getText_H() {
        return text_H;
    }

    public void setText_H(String text_H) {
        this.text_H = text_H;
    }

    public static List<FormsTenData> setData(DataTable dataTable){
        List<FormsTenData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsTenData.class));
        }
        return dates;
    }

}
