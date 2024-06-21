This is a spring boot project I have recently worked on . It is  platform for managing and purchasing clothing items. It efficiently utilizes the tech stack like spring boot, data jpa , mysql and thymeleaf.
 It is customer features where customers can browse and purchase cloth and It also has admin features where admin can add items, update and delete items.
The project structure includes-
Resources which has the ui degisned using HTML, CSS, and Thymeleaf templates.
entity deals with a class with contain attributes of databases such as id, price, materail and name
Controller Handles http get post request from the website
Service runs the entire program by interacting with the repository layer to perform CRUD operations.
Repository , interface extends JpaRepository and provides methods to perform CRUD operations on the ClothingItem entity.
