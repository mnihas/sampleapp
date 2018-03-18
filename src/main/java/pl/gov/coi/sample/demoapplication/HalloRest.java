package pl.gov.coi.sample.demoapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloRest {

  @Value("${welcome.message}")
  private String welcomeMessage;

  @RequestMapping("/a")
  public String welcomeMessage() {
    return welcomeMessage;
  }

}
