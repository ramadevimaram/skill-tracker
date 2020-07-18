package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping(value = "displayskills")
    @ResponseBody
    public String displaySkills() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.Here is the List</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<ol>"+
                "</body>" +
                "</html>";
        return html;
    }
    //TODO: At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite,
    // and third favorite programming languages on your list. Use select elements for each of the rankings.
    // Just as with the exercises, we will use @GetMapping().
    @GetMapping("form")
    @ResponseBody
    public String skillsTrackerForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to learn</h2>" +
                        "<form method = 'post' action = 'form'>" +
                        "<label>Enter your name: <input type = 'text' name = 'username' /></label><hr>" +
                        "<label>My favorite language:"
                        + "<select name='firstSkill'>"
                        +  "<option value='Java'>Java</option>"
                        +  "<option value='Javascript'>Javascript</option>"
                        +  "<option value='Typescript'>Typescript</option>"
                        + "</select></label><br>" +
                        "<label>My second favorite language:"
                        + "<select name='secondSkill'>"
                        +  "<option value='Java'>Java</option>"
                        +  "<option value='Javascript'>Javascript</option>"
                        +  "<option value='Typescript'>Typescript</option>"
                        + "</select></label><br>" +
                        "<label>My third favorite language:"
                        + "<select name='thirdSkill'>"
                        +  "<option value='Java'>Java</option>"
                        +  "<option value='Javascript'>Javascript</option>"
                        +  "<option value='Typescript'>Typescript</option>"
                        + "</select></label><br>" +
                        "<input type = 'submit' value = 'Show me the skills!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String skillsTrackerSuccess(@RequestParam String username, String firstSkill, String secondSkill, String thirdSkill){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker for " + username + "</h1>" +
                        "<ol>" +
                        "<li>" + firstSkill + "</li>" +
                        "<li>" + secondSkill + "</li>" +
                        "<li>" + thirdSkill + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
