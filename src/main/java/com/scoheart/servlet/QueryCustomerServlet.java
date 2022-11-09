package com.scoheart.servlet;

import com.scoheart.pojo.Customer;
import com.scoheart.service.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QueryCustomerServlet", value = "/QueryCustomerServlet")
public class QueryCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.queryAllCustomer();
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("shopping.html").forward(request, response);
        System.out.println(customers);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
