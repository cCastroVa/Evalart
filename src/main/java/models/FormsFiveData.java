package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsFiveData {
    private String text_b;
    private String operation;
    private String date;

    public String getText_b() {
        return text_b;
    }

    public void setText_b(String text_b) {
        this.text_b = text_b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static List<FormsFiveData> setData(DataTable dataTable){
        List<FormsFiveData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsFiveData.class));
        }
        return dates;
    }

}
