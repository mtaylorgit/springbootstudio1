package org.launchcode.skillstracker;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping//this was the item that I had to add to actually see the page
    @ResponseBody
        public String skills() {
            return  "<html>" +
                    "<head>" +
                    "    <title>Skills Tracker</title>" +
                    "</head>" +
                    "<body>" +
                    "    <h1>Skills Tracker</h1>" +
                    "    <h2>Possible programming languages:</h2>" +
                    "    <ol>" +
                    "        <li>Java</li>" +
                    "        <li>Python</li>" +
                    "        <li>JavaScript</li>" +
                    "    </ol>" +
                    "</body>" +
                    "</html>";
        }
    @Controller
    public class FormController {

        @GetMapping("/form")
        @ResponseBody
        public String form() {
            return  "<html>" +
                    "<head>" +
                    "    <title>Skills Tracker Form</title>" +
                    "</head>" +
                    "<body>" +
                    "    <h1>Skills Tracker Form</h1>" +
                    "    <form method='post' action='/form'>" +
                    "        <label for='name'>Name:</label>" +
                    "        <input type='text' id='name' name='name'><br><br>" +
                    "        <label for='favorite'>Favorite language:</label>" +
                    "        <select id='favorite' name='favorite'>" +
                    "            <option value='Java'>Java</option>" +
                    "            <option value='Python'>Python</option>" +
                    "            <option value='JavaScript'>JavaScript</option>" +
                    "        </select><br><br>" +
                    "        <label for='secondFavorite'>Second favorite language:</label>" +
                    "        <select id='secondFavorite' name='secondFavorite'>" +
                    "            <option value='Java'>Java</option>" +
                    "            <option value='Python'>Python</option>" +
                    "            <option value='JavaScript'>JavaScript</option>" +
                    "        </select><br><br>" +
                    "        <label for='thirdFavorite'>Third favorite language:</label>" +
                    "        <select id='thirdFavorite' name='thirdFavorite'>" +
                    "            <option value='Java'>Java</option>" +
                    "            <option value='Python'>Python</option>" +
                    "            <option value='JavaScript'>JavaScript</option>" +
                    "        </select><br><br>" +
                    "        <input type='submit' value='Submit'>" +
                    "    </form>" +
                    "</body>" +
                    "</html>";
        }


        @PostMapping("/form")
        @ResponseBody
        public String submitForm(@RequestParam String name,
                                 @RequestParam String favorite,
                                 @RequestParam String secondFavorite,
                                 @RequestParam String thirdFavorite) {
            return "<html>" +
                    "<head>" +
                    "    <title>Skills Tracker Form Result</title>" +
                    "</head>" +
                    "<body>" +
                    "    <h1>Skills Tracker Form Result</h1>" +
                    "    <p>Name: " + name + "</p>" +
                    "    <p>Favorite language: " + favorite + "</p>" +
                    "    <p>Second favorite language: " + secondFavorite + "</p>" +
                    "    <p>Third favorite language: " + thirdFavorite + "</p>" +
                    "</body>" +
                    "</html>";
        }
    }


}
