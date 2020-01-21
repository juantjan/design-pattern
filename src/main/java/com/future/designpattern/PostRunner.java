package com.future.designpattern;

import com.future.designpattern.adapter.DocType;
import com.future.designpattern.adapter.FutureDocumentReader;
import com.future.designpattern.builder.User;
import com.future.designpattern.composite.Department;
import com.future.designpattern.composite.FinanceDepartment;
import com.future.designpattern.composite.HeadDepartment;
import com.future.designpattern.composite.TechDepartment;
import com.future.designpattern.decorator.Shipping;
import com.future.designpattern.decorator.SlotShipping;
import com.future.designpattern.decorator.StandardShipping;
import com.future.designpattern.facade.LoginFacade;
import com.future.designpattern.factory.Banner;
import com.future.designpattern.factory.Content;
import com.future.designpattern.factory.ContentFactory;
import com.future.designpattern.factory.ContentType;
import com.future.designpattern.factory.Footer;
import com.future.designpattern.factory.Header;
import com.future.designpattern.iterator.NewIterator;
import com.future.designpattern.iterator.NewList;
import com.future.designpattern.iterator.Topic;
import com.future.designpattern.iterator.TopicList;
import com.future.designpattern.observer.Animal;
import com.future.designpattern.observer.FutureBroadcaster;
import com.future.designpattern.observer.Person;
import com.future.designpattern.singleton.SingleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static com.future.designpattern.adapter.DocType.HTML;
import static com.future.designpattern.adapter.DocType.XML;

/**
 * @author juan.tjandra
 */
@Component
public class PostRunner {
  @Autowired
  FutureDocumentReader futureDocumentReader;
  @Autowired
  ContentFactory contentFactory;

  @Autowired
  LoginFacade loginFacade;

  @Autowired
  FutureBroadcaster futureBroadcaster;

  @PostConstruct
  private void runSandBox () {
//    this.executeSingletonExample();
//    this.executeFactoryExample();
//    this.executeBuilderPattern();
//    this.executeAdapterPattern();
//    this.executeLoginFacade();
//    this.executeDecoratorPatternExample();
//    this.compositePatternExample();
//    this.interatorPatternExample();
//    this.observerPatternExample();
  }


  private void executeSingletonExample () {
    SingleObject singleObject = SingleObject.getSIntance();
    singleObject.sayHi();

    System.out.println(singleObject.getStatusName());
    singleObject.setStatusName("change from first var");
    SingleObject secondVar = SingleObject.getSIntance();
    System.out.println(secondVar.getStatusName());

    System.out.println(singleObject.getStatusName());
  }

  private void executeFactoryExample () {

    Content content = contentFactory.getContent(ContentType.HEADER);
    content.showDetail();

    Content footer = contentFactory.getContent(ContentType.FOOTER);
    footer.showDetail();

    Banner banner = (Banner) contentFactory.getContent(ContentType.BANNER);
    System.out.println(banner.getTitle());

  }


  private void executeBuilderPattern() {
    User user = new User.UserBuilder()
        .age("45")
        .firstName("name")
        .build();
    System.out.println(user.getAge());
  }

  private void executeAdapterPattern() {
    System.out.println(futureDocumentReader
        .read(XML, "<xml> Hai ini dari xml </xml>"));
    System.out.println(futureDocumentReader
        .read(HTML, "<html> Hai html</html>"));
  }


  private void executeLoginFacade() {
    loginFacade.makeNewLogin("name", "password");
  }

  private void executeDecoratorPatternExample () {
    double weight = 3.0;
    int cost = 5000;
    String address = "Jakarta";

    Shipping shipping = new StandardShipping();
    shipping.setWeight(weight);
    shipping.setDestination(address);
    shipping.setShippingCost(cost);

    Shipping slotShipping =
        new SlotShipping(
            new StandardShipping(), "15 Jan 2020");
    slotShipping.setShippingCost(5000);
    slotShipping.setDestination("Jakarta");
    slotShipping.setWeight(3.0);

    System.out.println("---- STANDARD ----");
    shipping.sendShipping();
    System.out.println("---- NEW ----");
    slotShipping.sendShipping();

  }

  private void compositePatternExample () {
    Department techDepartment
        = new TechDepartment("ID-TECH-123", "Tech Department");
    Department financeDepartment
        = new FinanceDepartment("ID-FIN-123", "Finance Department");
    HeadDepartment head = HeadDepartment
        .builder()
        .id("ID-HEAD")
        .name("Department Head")
        .build();
    head.addDepartment(techDepartment);
    head.addDepartment(financeDepartment);

    head.printDepartmentName();
  }

  private void interatorPatternExample () {
    Topic[] topics = new Topic[5];

    topics[0] = new Topic("ID-1");
    topics[1] = new Topic("ID-2");
    topics[2] = new Topic("ID-3");
    topics[3] = new Topic("ID-4");
    topics[4] = new Topic("ID-5");

    NewList<Topic> topicList = new TopicList(topics);

    NewIterator<Topic> topicIterator = topicList.iterator();

    while (topicIterator.hasNext()) {
      Topic currentTopic = topicIterator.next();
      System.out.println(currentTopic.getId());
    }
  }

  private void observerPatternExample () {
    Person person = new Person();
    Animal animal = new Animal();

    futureBroadcaster.addObserver(person);
    futureBroadcaster.addObserver(animal);

    futureBroadcaster.notifyMessage("HALO INI ADALAH PESAN PENTING");

    System.out.println(person.getMessage());
    System.out.println(animal.getMessage());
  }

}
