# MyDividend

**MyDividend** is a native Android application designed to calculate the dividend returns from a unit trust investment. [cite_start]This project was developed as part of the **ICT602 (Mobile Technology and Development)** individual assignment[cite: 1, 3, 5].

## 📌 Project Overview

[cite_start]The application allows users to input their investment details and automatically calculates the total dividend yield based on the annual interest rate and the duration of the investment (up to 12 months)[cite: 5, 7]. [cite_start]It features a responsive user interface with a navigation menu connecting the **Home (Calculator)** and **About** pages[cite: 14].

## 📱 Features

* **Investment Calculator:**
    * Accepts **Invested Fund Amount** (RM).
    * Accepts **Annual Dividend Rate** (%).
    * [cite_start]Accepts **Number of Months Invested** (Validation: Max 12 months)[cite: 7].
* **Automatic Calculation:**
    * [cite_start]Implements the formula: `Monthly Dividend = (Rate / 12) * Invested Fund`[cite: 9].
    * [cite_start]Computes `Total Dividend = Monthly Dividend * Months`[cite: 10].
    * [cite_start]Displays results formatted to 2 decimal places[cite: 11].
* **Navigation:**
    * [cite_start]Options Menu and Button navigation between "Home" and "About" screens[cite: 14].
* **About Page:**
    * [cite_start]Displays application icon, author information, and a clickable link to this GitHub repository[cite: 17, 18, 19, 21].

## 🛠️ Technology Stack

* **Language:** Java
* [cite_start]**Environment:** Android Studio Narwhal [cite: 23]
* [cite_start]**UI Design:** XML Layouts (Responsive & Mobile First) [cite: 24]
* **Minimum SDK:** API 24 (Android 7.0)

## 👤 Author Information

* **Name:** AHMAD FIRDAUS BIN MOHD KHALID
* **Student ID:** 2023415376
* [cite_start]**Course:** ICT602 - Mobile Technology and Development [cite: 2]
* **Class:** CDCS2405A
* **Faculty:** College of Computing, Informatics and Media

## 🚀 How to Run

1.  Clone this repository:
    ```bash
    git clone [https://github.com/AhmdFir/MyDividend.git](https://github.com/AhmdFir/MyDividend.git)
    ```
2.  Open **Android Studio**.
3.  Select **File > Open** and locate the cloned directory.
4.  Wait for Gradle to sync.
5.  Connect a physical device or start an Android Emulator.
6.  Click the **Run** button (Green Arrow).

## 📸 Screenshots

| Home Screen | About Screen |
|:---:|:---:|
| *(Place screenshot of calculator here)* | *(Place screenshot of about page here)* |

## 📝 License

This project is for educational purposes.
© 2025 Ahmad Firdaus. [cite_start]All Rights Reserved[cite: 20].