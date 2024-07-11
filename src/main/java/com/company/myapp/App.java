package com.company.myapp;

import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
        System.out.println(jo);

        System.out.println( "Hello World!" );
    }
}
