package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsSixData {
    private String operation;
    private String date;
    private String t_rex;

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

    public String getT_rex() {
        return t_rex;
    }

    public void setT_rex(String t_rex) {
        this.t_rex = t_rex;
    }

    public static List<FormsSixData> setData(DataTable dataTable){
        List<FormsSixData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsSixData.class));
        }
        return dates;
    }

}
