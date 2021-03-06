package pl.gov.coi.sample.demoapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

@RestController
public class HalloRest {

  @Value("${welcome.message}")
  private String welcomeMessage;

  //@RequestMapping("/")
  @RequestMapping(value="/user/hello", method = RequestMethod.GET)
  public @ResponseBody
  String welcomeMessage(@RequestParam("name") String name) {
      return MessageFormat.format(welcomeMessage, name);
      //return String.format(welcomeMessage, name);
  }

}
