package de.boettcher.blog.dependencies;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyComponent {

  private static final Logger LOG = LoggerFactory.getLogger(MyComponent.class);

  @PostConstruct
  public void myMethod() {
    LOG.info("Hello World");
  }

}
