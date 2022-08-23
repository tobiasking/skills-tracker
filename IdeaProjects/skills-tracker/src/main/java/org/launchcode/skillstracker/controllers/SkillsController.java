package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class SkillsController {

    @GetMapping("/")
    public String homepage() {
        return "<html>" + "<body>" + "<h1>Skills Tracker</h1>" + "<h2> We have a few skills we would like to learn. Here is the list!</h3>" + "<ol>"
                + "<li>Java</li>" + "<li>Javascript</li>" + "<li>C#</li>" + "</ol>" + "<p>Click <a href='/questionnaire'>HERE</a> to submit your faves!</p>" +
                "</body>" + "</html>";
    }
    @GetMapping("/questionnaire")
    public String skillQuestionnaire() {
        return "<html>" + "<body>" + "<form action='/answers' method = post>" + "<label id='name'>Your name: </label>" + "<input type='text' name='name'/><br>"
                + "<label id='favorite'>My favorite language: </label>" + "<select name='fave'>" + "<option value='Java'>Java</option>" + "<option value='Javascript'>Javascript</option>"
                + "<option value='C#'>C#</option>" + "</select><br>" + "<label id='secondFavorite'>My second favorite language: </label>" + "<select name='secondFave'>" + "<option value='Java'>Java</option>" + "<option value='Javascript'>Javascript</option>"
                + "<option value='C#'>C#</option>" + "</select><br>" + "<label id='thirdFavorite'>My third favorite language: </label>" + "<select name='thirdFave'>" + "<option value='Java'>Java</option>" + "<option value='Javascript'>Javascript</option>"
                + "<option value='C#'>C#</option>" + "</select><br>" + "<input type='submit' value='Submit' />" + "</form>" + "</body>" + "</html>";
    }

    @PostMapping("/answers")
    public String skillsOut(@RequestParam String name, String fave, String secondFave, String thirdFave) {
        return "<html>" + "<body>" + "<h1>" + name + "</h1>" + "<ol>" + "<li>" + fave + "</li>" + "<li>" + secondFave + "</li>" + "<li>" + thirdFave + "</li>" + "</ol>" + "</body>" + "</html>";
    }


}
