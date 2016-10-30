package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class HelperSubject {
  private FirefoxDriver wd;

  public HelperSubject(FirefoxDriver wd) {
    this.wd = wd;
  }
  public void commitSubjectCreation() {
    wd.findElement(By.name("commit")).click();
  }

  public void fillSubjectPage() {
    wd.findElement(By.id("subject_name")).click();
    wd.findElement(By.id("subject_name")).clear();
    wd.findElement(By.id("subject_name")).sendKeys("History");
  }

  public void initSubjectCreation() {
    wd.findElement(By.linkText("Новый предмет")).click();
  }
  public void deleteSelectedSubject() {
    wd.findElement(By.linkText("Удалить")).click();
  }
}