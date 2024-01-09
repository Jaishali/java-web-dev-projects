package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping(value="")
    @ResponseBody
    public String startSkills () {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

        return html;
    }

    @GetMapping(value="results")
    @ResponseBody
    public String formSkills() {
        String html = "<form method='post'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'username' />" +
                "<br>My favorite language:<br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";

        return html;
    }

    @PostMapping(value="results")
    @ResponseBody
    public String namePage(@RequestParam String username, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + username + "</h1>" +
                "<table>" +
                "<tr>"+
                "<td>1.</td>"+
                "<td>" + firstChoice + "</td>" +
                "</tr>"+
                "<tr>"+
                "<td>2.</td>"+
                "<td>" + secondChoice + "</td>" +
                "</tr>"+
                "<tr>" +
                "<td>3.</td>"+
                "<td>" + thirdChoice + "</td>" +
                "</tr>"+
                "</table>";
        return html;
    }
}
