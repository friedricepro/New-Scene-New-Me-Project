# Project: New Scene, New Me

## Introduction

Software engineers develop programs to create visual and audio experiences using object-oriented programming. As we begin 2026, your goal is to create an animation program that reflects on your experiences from 2025 and visualizes your goals and aspirations for the year ahead using the Theater and Scene API.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, algorithms, and the Theater/Scene API to create your animation program:
- **Write Scene subclasses** – Create two Scene subclasses: one to visualize your 2025 recap (LastYear) and another to project your 2026 goals (ThisYear). Each class must include both a no-argument constructor and a parameterized constructor.
- **Use private instance variables** – Implement proper encapsulation by declaring instance variables as private in your Scene subclasses.
- **Create 1D arrays** – Create at least two 1D arrays to store data for your scenes. One array must be created using an initializer list, and one array must be populated by reading from a text file using the FileReader class.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Access and modify array elements** – Use algorithms to traverse, access, and/or modify elements in your 1D arrays to display personalized content in your scenes.
- **Use logic and iteration** – Incorporate selection statements (if/if-else) and loops (while, for, or enhanced for) to control the flow and display of content in your scenes.
Incorporate variety of media – Use at least four different types of Scene API methods across both scenes (examples: drawImage(), drawText(), drawRectangle(), drawEllipse(), playSound(), setTextStyle(), setFillColor(), etc.).
- **Create a UML diagram** – Design a UML class diagram showing your Scene subclasses with their instance variables, constructors, and methods before you begin coding.
- **Document your code** – Use multi-line comments to explain the purpose of each method (including preconditions and postconditions) and single-line comments to explain code segments.

## UML Diagram 


[UML Diagram for my project]

<img width="591" height="248" alt="image" src="https://github.com/user-attachments/assets/7f3e9fc3-9ed3-4106-b1c4-54149494876e" />


## Description of 2025 recap

For my 2025 recap I included 
- Pokemon, a hobby that i've been collecting in and a franchise i've been playing many games from. I included images of pokemon cards and images of my achievements in the games.
- Academics, my AP Score for the 2025 APCSP exam and a showcase of the A's ive accumulated in my 2nd semester of freshman year as well as my 1st semester of sophmore year.
- Travels, a compilation of places i've been to throughout this year that were some of my most memorable.
- Food, a compilation of food i've made/eaten.

## Description of 2026 goals

Jan - What I did in January, not too much, but I showcase some of my gesture drawings im learning in my art class and some pokemon cards I got for new years.
Goals - My goals that I hope to achieve in 2026, catch a shiny giratina, get 5's on my ap tests, and learn how to cook.

## Scene API Usage

- drawImage, I used this method to display images from each category, like Pokemon, Goals, Travels, etc.
- drawText, I used this method to add text captions under the images to provide short context/detail.
- drawRectangle and setFillColor, I used these methods to make the caption boxes and add shadows as an extra detail.
- setTextHeight, setTextStyle, and setTextColor, I used these methods to format and optimize my text to fit the aesthetic of each section.
- clear, I used this method to clear the screen and add a background color to transition into the next images.
- pause, I used this method to control timing and add time intervals.
- playSound, I used this method to play background audio to enhance the experience of my scene project.
