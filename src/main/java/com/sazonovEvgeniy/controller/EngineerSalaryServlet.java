package com.sazonovEvgeniy.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sazonovEvgeniy.model.DataStorage;
import com.sazonovEvgeniy.model.Engineer;
import com.sazonovEvgeniy.model.IEmployee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "EngineerSalaryServlet", urlPatterns = "/calculateEngineerSalary")
public class EngineerSalaryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get request from client
        req.setCharacterEncoding("UTF-8");
        JsonObject data = new Gson().fromJson(req.getReader(), JsonObject.class);
        int baseSalary = data.get("baseSalary").getAsInt();
        int bonus = data.get("bonus").getAsInt();

        // create new Employee as Engineer and add it to storage
        IEmployee employee = new Engineer(baseSalary, bonus);
        DataStorage.addEmployee(employee);

        // form response and send it
        String answer = employee.getSalary() + "";
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(answer);
    }
}
