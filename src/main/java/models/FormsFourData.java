package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsFourData {
    private String text_c;
    private String operation;

    public String getText_c() {
        return text_c;
    }

    public void setText_c(String text_c) {
        this.text_c = text_c;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public static List<FormsFourData> setData(DataTable dataTable){
        List<FormsFourData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsFourData.class));
        }
        return dates;
    }

}
