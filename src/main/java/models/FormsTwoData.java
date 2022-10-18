package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormsTwoData {
    private String sharks;
    private String operation2;
    private String text_s;
    public String getSharks() {
        return sharks;
    }

    public void setSharks(String sharks) {
        this.sharks = sharks;
    }

    public String getOperation2() {
        return operation2;
    }

    public void setOperation2(String operation2) {
        this.operation2 = operation2;
    }

    public String getText_s() {
        return text_s;
    }

    public void setText_s(String text_s) {
        this.text_s = text_s;
    }

    public static List<FormsTwoData> setData(DataTable dataTable){
        List<FormsTwoData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,FormsTwoData.class));
        }
        return dates;
    }

}
