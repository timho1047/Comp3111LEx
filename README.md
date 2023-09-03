## COMP 3111 Lab 1 Exercise
<hr>

### What is done:
- Set up JAVA developing environment(IntelliJ IDEA, JDX-17)
- Install Git For Windows
- Create a project including 2 mathematical functions
- Test Git Commit and Push

### Remark
#### 1. Junit cannot be added directly by the method in worksheet
I just directly write the dependency codes and update dependencies by Maven
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

#### 2. No `Git` button in the main menu
So I find the button of `Share Project on GitHub` by searching.

#### 3. Pictures mixed up in `Appendices`
In page 4 of `Comp3111_Lab1_Appendices.pdf`, pictures of `myLibrary` and `mainApp1` are reversed.
