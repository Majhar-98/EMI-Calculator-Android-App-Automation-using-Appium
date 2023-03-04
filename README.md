# EMI-Calculator-Android-App-Automation-using-Appium

## Automation steps:
If an user take loan (?) tk from a bank with interest of (?)% and want to give (?) tk per month as EMI (installment) and processing fee (?)%, how many time period it will take to complete the loan? Take the values from dataset and assert the monthly EMI, total interest, processing fee amount and total payment from the result view.

For solve this question, create a dataset using following values:

Amount | Interest | EMI | Processing Fee | Monthly EMI | Total Interest | Processing Fee | Total Payment | Period (Year) | Period (Month)

- 100000 | 6 | 2000 | 2% | 2000 | 15361.08 | 2000 | 115361.08 | 4 | 10

- 200000 | 8 | 5000 | 2% | 5000 | 33391.61 | 4000 | 233391.61 | 3 | 11

- 250000 | 7 | 8000 | 1.5% | 8000 | 26804.51 | 3750 | 276804.51 | 2 | 11

- 50000 | 10 | 1000 | 5% | 1000 | 14949.12 | 2500 | 64949.12 | 5 | 5

## App Name:
[Calculator](https://play.google.com/store/apps/details?id=com.continuum)

## APK build version downloader:
[APK](https://apps.evozi.com/apk-downloader/)

## IDE Used:
- Intelji Idea
- Appium
- Android Studio
- Prerequisites:
- Install Android Studio latest version
- Install Appium
- Install jdk or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME Stable internet connection
- 
## Langueges:
- Java
- 
## How to run this project:
- Clone this project
- Turn on Developer Options on your android phone
- Open Android Studio and Open the APK file
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open Appium Server with following command: appium -p 4723
- Open Appium Inspector
- Open Intellij Idea
- Execute the following command into the terminal: gradle clean test
- For generating Allure Report use these commands: allure generate allure-results --clean -o allure-report and allure serve allure-results


