package com.vasavi.app.controller;

import com.vasavi.app.model.Hospital;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalController {

    @GetMapping("/get/hospitals")
    public List<Hospital> getHospitals() {
        List listHospitals = new ArrayList();

        Hospital hospital1 = new Hospital("1", "hospital1", "hyderabad");
        Hospital hospital2 = new Hospital("1", "hospital2", "Chennai");
        Hospital hospital3 = new Hospital("1", "hospital3", "Delhi");

        listHospitals.add(hospital1);
        listHospitals.add(hospital2);
        listHospitals.add(hospital3);
        return listHospitals;
    }
    @GetMapping("/map/hospitals")
    public List<Hospital> mapHospitals() {
       Map hospitalMap = new HashMap();

        Hospital hospital1 = new Hospital("1", "hospital1", "hyderabad");
        Hospital hospital2 = new Hospital("1", "hospital2", "Chennai");
        Hospital hospital3 = new Hospital("1", "hospital3", "Delhi");

        hospitalMap.put(hospital1.getId(),hospital1);
        hospitalMap.put(hospital2.getId(),hospital2);
        hospitalMap.put(hospital3.getId(),hospital3);
        return (List<Hospital>) hospitalMap;

    }
}
