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
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Skills Tracker</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>Skills Tracker</h1>\n" +
                    "    <h2>Possible programming languages:</h2>\n" +
                    "    <ol>\n" +
                    "        <li>Java</li>\n" +
                    "        <li>Python</li>\n" +
                    "        <li>JavaScript</li>\n" +
                    "    </ol>\n" +
                    "</body>\n" +
                    "</html>";
        }
    @Controller
    public class FormController {

        @GetMapping("/form")
        @ResponseBody
        public String form() {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <meta charset='UTF-8'>\n" +
                    "    <title>Skills Tracker Form</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>Skills Tracker Form</h1>\n" +
                    "    <form method='post' action='/form'>\n" +
                    "        <label for='name'>Name:</label>\n" +
                    "        <input type='text' id='name' name='name'><br><br>\n" +
                    "        <label for='favorite'>Favorite language:</label>\n" +
                    "        <select id='favorite' name='favorite'>\n" +
                    "            <option value='Java'>Java</option>\n" +
                    "            <option value='Python'>Python</option>\n" +
                    "            <option value='JavaScript'>JavaScript</option>\n" +
                    "        </select><br><br>\n" +
                    "        <label for='secondFavorite'>Second favorite language:</label>\n" +
                    "        <select id='secondFavorite' name='secondFavorite'>\n" +
                    "            <option value='Java'>Java</option>\n" +
                    "            <option value='Python'>Python</option>\n" +
                    "            <option value='JavaScript'>JavaScript</option>\n" +
                    "        </select><br><br>\n" +
                    "        <label for='thirdFavorite'>Third favorite language:</label>\n" +
                    "        <select id='thirdFavorite' name='thirdFavorite'>\n" +
                    "            <option value='Java'>Java</option>\n" +
                    "            <option value='Python'>Python</option>\n" +
                    "            <option value='JavaScript'>JavaScript</option>\n" +
                    "        </select><br><br>\n" +
                    "        <input type='submit' value='Submit'>\n" +
                    "    </form>\n" +
                    "</body>\n" +
                    "</html>";
        }


        @PostMapping("/form")
        @ResponseBody
        public String submitForm(@RequestParam String name,
                                 @RequestParam String favorite,
                                 @RequestParam String secondFavorite,
                                 @RequestParam String thirdFavorite) {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Skills Tracker Form Result</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>Skills Tracker Form Result</h1>\n" +
                    "    <p>Name: " + name + "</p>\n" +
                    "    <p>Favorite language: " + favorite + "</p>\n" +
                    "    <p>Second favorite language: " + secondFavorite + "</p>\n" +
                    "    <p>Third favorite language: " + thirdFavorite + "</p>\n" +
                    "</body>\n" +
                    "</html>";
        }
    }


}
