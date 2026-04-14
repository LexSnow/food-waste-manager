Level 5: Food Waste Management System

You have been tasked with developing a Food Waste Management System to help reduce the environmental impact of food waste. The purpose of this system is to track food donations, manage collection centers, and facilitate waste processing to ensure efficient and sustainable waste disposal. This system will monitor the key entities involved in the process, including food donors, collection centers, waste processors, and the types of waste they handle.

To use the application an user should be logged in using a username and a password. 

Food donors are sources that provide food waste, such as grocery stores, restaurants, and food distribution centers. Each donor should have a name, an address, and their contact information. Donors can donate multiple food waste items over time. Additionally, each Food Donor can deliver waste to multiple collection centers.

Each food waste item represents a batch of food that has been donated and designated as waste. For each food waste item, the system should track its weight (in kilograms), the expiration date, and the type of waste (for example, vegetables, dairy, or grains). Each food waste item should belong to a specific Food Donor that provided it. However, food waste items may pass through various processors as they are collected and processed.

Collection centers are designated facilities that collect food waste from various donors before it is sent for processing. Each collection center should have a location, and a maximum capacity (measured in kilograms) to indicate how much waste it can hold. Each collection center can accept food waste from multiple donors. Once collected, food waste from each collection center is then sent to a specific waste processor.

For example, a collection center located near a city center may receive waste from multiple restaurants and grocery stores and send it to a processor that specializes in composting.

Processors are entities responsible for converting food waste into useful byproducts, such as compost, energy, or fertilizer. Each processor has a name, a location, and a maximum processing capacity to indicate how much waste it can handle. Each processor can handle food waste from multiple collection centers. When a food waste item arrives at one processor, the food waste item is marked as processed.

Todo list:

    create a entity diagram (you can use this tool or you can use a piece of paper)
    create a git repository and link it with your GitHub account
    create a Spring Boot application with a Dockerized MySQL
    create REST endpoints for the problem
    integrate Spring Security OAuth (create an endpoint to login, then every request should be authenticated by a token)
    integrate the Swagger Library and the Lombok Project
    add logs application using SL4J library
    create two profiles, each having a different application.properties
    create an Angular/React application to consume the API
    host your Spring Boot application in the cloud