# controle

Le but de ce projet est de créer un service Web averc Spring Boot pour gérer les articles et leurs catégories


# Conception de base de données



Table "Article":


La table "Article" contient les informations relatives aux articles présents dans le système. Chaque article est identifié de manière unique par un ID avec 2  autres attributs ( nom et dateProduction)



Table "Categorie":



La table "Catégorie" enregistre les différentes catégories disponibles pour classer les articles. Chaque catégorie est identifiée de manière unique par un ID. Le champ "nom" décrit le libellé ou le nom de la catégorie. Cette table est utilisée comme référence pour associer des catégories aux articles dans la table principale "Article". Elle permet d'organiser les articles en fonction de leurs sujets ou thèmes principaux.



















![image](https://github.com/Eskoum/controle/assets/147450023/bb128797-9017-4171-9dc5-9d2c8d392d03)





# technologie utilisée



- spring tools

- jdk 17

- maven


# Caractéristiques du projet 

-opérations CRUD

