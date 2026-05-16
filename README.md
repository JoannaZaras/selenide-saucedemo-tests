# Selenide SauceDemo Tests

Simple UI test automation project for SauceDemo using Java, Selenide, JUnit 5 and Maven.

## Purpose

This project was created as a small portfolio/reference project for comparing UI test automation approaches in:

- Selenium WebDriver
- Selenide
- Playwright

The same demo application is used to make the comparison easier.

## Covered scenarios

- successful login
- unsuccessful login
- adding product to cart
- removing product from cart
- checkout flow

## Tech stack

- Java 21
- Selenide
- JUnit 5
- Maven

## Reporting

Run tests:

```bash
mvn clean test


## Design notes

The project uses Page Object pattern with a light Fluent Interface style.

Example:

```java
new LoginPage()
    .enterUsername("standard_user")
    .enterPassword("secret_sauce")
    .clickLoginButton()
    .shouldBeOpened();
