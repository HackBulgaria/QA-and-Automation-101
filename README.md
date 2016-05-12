# QA-and-Automation-101
The first edition of the QA and Automation course in Hack Bulgaria

In this course students will learn the basic theory behind software quality
assurance and test automation. More importantly they will learn how to think
like testers and analyze a given problem from various angles, often without
complete information available.

The theory lessons include exerices like writing a bug report or writing
test cases and test plans, sometimes in hypothetical environments, sometimes
using real software when possible.

In order to gain the maximum benefit of this course please clone this repo
and write down your answers to the exercises, links to bug reports and test
plans. These can be later shown to prospect employers.

## Course Program

### 3x - [Java 101 Refresh course](/lesson00/)

Please see Lesson 00.

### Lesson 1 - [QA Fundamentals](/lesson01/)

This is an introduction to software testing in general. The industry uses the
terms testing, quality assurance and quality engineering more or less as
synonyms but there is a difference behind them and we will explain that
before going further. We will briefly cover the following topics using
practical examples and exercises.

* Definition of testing, QA and QE
* Why we need testing
* How do we know when to stop
* Tester vs. developer
* The psychology of testing
* Different types of testing
* Testing techniques


### Lesson 2 - [Software Development Lifecycle](/lesson02/)

Introduction to software development lifecycle and how it relates to testing
activities.

* Waterfall model
* Agile models
* QA's involvement in both


### Lesson 3 - [Bug Tracking](/lesson03/)

*"If it's not in Bugzilla it's not a bug!"*

* Generic definition
* How to write a good bug report
* Practicing writing and analyzing bug reports



### Lesson 4 - [Test Case Management](/lesson04/)

*“If it is not in the TCMS then we don't test it!”*

* What is test management
* Generic definitions of
 * Test Case
 * Test Plan
 * Test Run aka Test Execution
* IEEE test plan structure
* Positive and negative tests
* Practice with Nitrate TCMS

### 2x - Introduction to Linux


This is a practical refresher lesson for Linux in Bulgarian.

* [Basic commands in Linux](https://github.com/fosscourse/wiki/wiki/%D0%9A%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D0%B5%D0%BD_%D1%80%D0%B5%D0%B4_-_%D1%82%D0%B5%D1%80%D0%BC%D0%B8%D0%BD%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D1%8F%2C_%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%B8_%D0%BF%D0%BE%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F%2C_%D0%BF%D0%BE%D0%BB%D0%B5%D0%B7%D0%BD%D0%B8_%D0%BA%D0%BE%D0%BC%D0%B0%D0%B4%D0%B8#_____)
* [Exercise Linux commands](https://github.com/fosscourse/wiki/wiki/%D0%A3%D0%BF%D1%80%D0%B0%D0%B6%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F_-_%D0%BA%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D0%B8%D1%82%D0%B5_%D0%B2_%D0%9B%D0%B8%D0%BD%D1%83%D0%BA%D1%81#_____)

Homework reading:
* [Filesystems in Linux](https://github.com/fosscourse/wiki/wiki/%D0%A4%D0%B0%D0%B9%D0%BB%D0%BE%D0%B2%D0%B0_%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D0%B2_%D0%9B%D0%B8%D0%BD%D1%83%D0%BA%D1%81_-_%D1%81%D1%82%D1%80%D1%83%D0%BA%D1%82%D1%83%D1%80%D0%B0_%D0%B8_%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%B8_%D0%BF%D0%BE%D0%BD%D1%8F%D1%82%D0%B8%D1%8F)

* [Linux warmup](https://github.com/HackBulgaria/Programming101-Java/tree/master/week02/1.Monday)
* [Text editors - practical introduction](https://github.com/fosscourse/wiki/wiki/%D0%A2%D0%B5%D0%BA%D1%81%D1%82%D0%BE%D0%B2%D0%B8_%D1%80%D0%B5%D0%B4%D0%B0%D0%BA%D1%82%D0%BE%D1%80%D0%B8_%D0%B8_%D0%BE%D0%B1%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0_%D0%BD%D0%B0_%D1%82%D0%B5%D0%BA%D1%81%D1%82._%D0%A3%D0%BF%D1%80%D0%B0%D0%B6%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F)

Other information about Linux can be found at:
https://github.com/fosscourse/wiki/wiki/%D0%9F%D1%80%D0%B0%D0%BA%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE_%D0%B2%D1%8A%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5_%D0%B2_%D0%9B%D0%B8%D0%BD%D1%83%D0%BA%D1%81



### Lesson 5 - [Testing Fedora 24 Changes](/lesson05/)

This is a practice only lesson. Students will be testing
new features proposed for the upcoming Fedora 24 release.


### Lesson 6 - [Unit Testing and Continuous Integration](/lesson06/)

Unit testing and CI are traditionally developer oriented activities
but QA is increasingly starting to take part in both of them.

* What is unit testing
* Fakes, stubs, mocks and doubles
* Introduction to JUnit
* Continuous Integration and code coverage


### Lesson 7 - [Writing JUnit tests for Apache Commons](/lesson07/)

This is a practive only lesson. Students will be writing
JUnit tests for popular Apache Commons components and inspecting
changes in code coverage.

### Lesson 8 - [Integration Testing with Selenium](/lesson08/)

Selenium is a popular test automation framework for web based applications.
In this lesson we learn about how test cases and software need to be written in
order to be automated and explore the Selenium IDE.

* Theory of test automation
* What is automatable software
* Introduction to Selenium


### Lesson 9 - [Writing Selenium tests for Mozilla Add-ons website Pt.1](/lesson09/)

This is a practice only lesson. Students will be writing
automated Selenium tests for http://addons.mozilla.org.

### Lesson 10 - [Writing Selenium tests for Mozilla Add-ons website Pt.2](/lesson10/)

This is continuation of the previous practice only lesson.

### Lesson 11 - [Introduction to performance testing](/lesson11/)

Introduction to performance testing targeted mostly towards discussions and understanding
what performance testing is. The lesson explores several examples of basic performace
testing and includes a practical exercise.

* Short theory with examples
* Designing performance test strategy for GitHub

### Lesson 12 - [How to find 1000 bugs in 30 minutes](/lesson12/)

In every suffiently large software system even the smallest change can affect multiple
components and lead to a big number of bugs. The lesson explores several examples of
such bugs and gives the students the background to start finding bugs by the hundreds.

* Introduction to mass scale exploratory testing
* Let's find at least 100 bugs in Fedora 24

### Summary - What I've learned in this course. What next ?

Before the end of the last lesson we go back to reflect on what we've learned
during this course and what to do next in order to boost our careers in QA.
