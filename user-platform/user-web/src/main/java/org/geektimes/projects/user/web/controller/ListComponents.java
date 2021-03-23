package org.geektimes.projects.user.web.controller;

import org.geektimes.injection.context.ComponentContext;
import org.geektimes.web.mvc.controller.PageController;
import org.geektimes.web.mvc.controller.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/list")
public class ListComponents implements PageController {

    @GET
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String[] ret = {"list all components : "};
        ComponentContext.getInstance().getComponentNames().forEach(e -> {
            ret[0] += "<p>[" + e + "]</p>";
        });

        request.setAttribute("output", ret[0]);

        return "index.jsp";
    }
}
