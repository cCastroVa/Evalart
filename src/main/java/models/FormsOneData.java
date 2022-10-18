package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsOneData {
    private String t_rex;
    private String date;

    public String getT_rex() {
        return t_rex;
    }
    public void setT_rex(String t_rex) {
        this.t_rex = t_rex;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public static List<FormsOneData> setData(DataTable dataTable){
        List<FormsOneData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsOneData.class));
        }
        return dates;
    }

}
