//Author Linda Ikireza Pacifique & Santigie Sankoh

package com.athoswhite;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> scientists = new HashMap<String, Integer>();
        HashMap<String, Integer> ScientistInventions = new HashMap<String, Integer>();
        HashMap<String, Integer> ScientistYearLived = new HashMap<String, Integer>();

        //populate hashmap1 with values
        scientists.put("Albert Einstein", 1);
        scientists.put("Sir Isaac Newton", 2);
        scientists.put("Hawking", 3);
        System.out.println("Given keys and items in the first dictionary" + scientists);

        //populate hashmap2 with values
        ScientistInventions.put("String Theory", 4);
        ScientistInventions.put("Motion", 5);
        ScientistInventions.put("Time Travel", 6);
        System.out.println("Given attributes in the second dictionary" + ScientistInventions);

        //populate hashmap3 with values
        ScientistYearLived.put("76 years", 1);
        ScientistYearLived.put("84 years", 2);
        ScientistYearLived.put("76 years ", 3);
        System.out.println("Given attributes in the third dictionary" + ScientistYearLived);

        //mapping dict
        scientists.putAll(ScientistInventions);
        ScientistInventions.putAll(ScientistYearLived);

        //Test 1
        System.out.println("the second map values are" +scientists);

        //Test 2
        System.out.println("the third map values are" +ScientistInventions);




    }

    }


