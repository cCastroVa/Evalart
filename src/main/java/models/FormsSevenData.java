package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsSevenData {
    private String operation;
    private String date;
    private String text_y;

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

    public String getText_y() {
        return text_y;
    }

    public void setText_y(String text_y) {
        this.text_y = text_y;
    }

    public static List<FormsSevenData> setData(DataTable dataTable){
        List<FormsSevenData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsSevenData.class));
        }
        return dates;
    }

}
