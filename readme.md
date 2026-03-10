# TP2 - Application Java avec Spring (IoC & Dependency Injection)

## Description du projet

Ce projet est un travail pratique visant à créer une application Java utilisant le framework **Spring** afin de mettre en œuvre les principes de **l’inversion de contrôle (IoC)** et de **l’injection de dépendances (DI)**.

L'application est organisée selon une architecture en couches comprenant :

* une **couche DAO** responsable de l'accès aux données,
* une **couche métier** contenant la logique applicative,
* une **couche de présentation** permettant l’exécution de l’application.

Le projet démontre comment Spring permet de gérer automatiquement les dépendances entre les composants grâce à la configuration XML et aux annotations.

---

## Objectifs pédagogiques

Les principaux objectifs de ce laboratoire sont :

* Comprendre le principe de **l’inversion de contrôle (IoC)**.
* Utiliser **Spring Framework** pour gérer les dépendances entre les classes.
* Implémenter une architecture **DAO / Métier / Présentation**.
* Utiliser **Maven** pour la gestion des dépendances.
* Tester la couche métier avec **JUnit**.

---

## Prérequis

Avant d’exécuter ce projet, les outils suivants doivent être installés :

* **JDK 11 ou supérieur**
* **IntelliJ IDEA ou Eclipse**
* **Apache Maven**
* **Spring Framework**

---

## Technologies utilisées

Ce projet utilise les technologies suivantes :

* **Java**
* **Spring Framework (spring-context)**
* **Maven**
* **JUnit**
* **IntelliJ IDEA**

---

## Structure du projet

Le projet est structuré de la manière suivante :

```
src
│
├── main
│   ├── java
│   │   ├── dao
│   │   │   ├── IDao.java
│   │   │   ├── DaoImpl.java
│   │   │   └── DaoImpl2.java
│   │   │
│   │   ├── metier
│   │   │   ├── IMetier.java
│   │   │   └── MetierImpl.java
│   │   │
│   │   ├── presentation
│   │   │   ├── Presentation2.java
│   │   │   └── PresentationXML.java
│   │   │
│   │   └── org.example
│   │       └── App.java
│   │
│   └── resources
│       └── applicationContext.xml
│
└── test
    └── java
        └── metier
            └── MetierImplTest.java
```

---

## Description des packages

### Package `dao`

Ce package contient les classes responsables de l'accès aux données.

* **IDao** : interface définissant la méthode `getValue()`.
* **DaoImpl** : première implémentation de l'interface DAO.
* **DaoImpl2** : deuxième implémentation du DAO.

Ces classes simulent une source de données.

---

### Package `metier`

Ce package contient la logique métier de l'application.

* **IMetier** : interface définissant la méthode `calcul()`.
* **MetierImpl** : implémentation de la couche métier.

La classe `MetierImpl` dépend d'une implémentation de `IDao`.
Spring se charge d'injecter cette dépendance.

Exemple de logique métier :

```
result = dao.getValue() * 2
```

---

### Package `presentation`

Ce package contient les classes permettant d’exécuter l’application.

* **Presentation2** : exécution utilisant la configuration via annotations.
* **PresentationXML** : exécution utilisant la configuration XML Spring.

Ces classes chargent le **contexte Spring** et récupèrent les beans nécessaires.

---

### Dossier `resources`

Contient le fichier :

```
applicationContext.xml
```

Ce fichier définit la configuration Spring et les beans utilisés par l'application.

---

### Dossier `test`

Contient les **tests unitaires**.

* **MetierImplTest** : test de la couche métier utilisant **JUnit**.

Ce test vérifie que la méthode `calcul()` retourne la valeur attendue.

Exemple :

```
10 * 2 = 20
```

---

## Fonctionnement de l'injection de dépendances

Spring se charge d’injecter automatiquement l’implémentation de `IDao` dans `MetierImpl`.

Cela permet de :

* réduire le couplage entre les classes,
* faciliter les tests,
* améliorer la maintenabilité du code.

L'injection peut être réalisée via :

* **XML**
* **Annotations**

---

## Exécution du projet

### Exécution avec configuration XML

Lancer la classe :

```
PresentationXML
```

Spring charge le fichier :

```
applicationContext.xml
```

et instancie les beans nécessaires.

---

### Exécution avec annotations

Lancer la classe :

```
Presentation2
```

Spring détecte automatiquement les composants grâce aux annotations.

---

## Exécution des tests

Les tests peuvent être exécutés avec :

* IntelliJ IDEA (Run Test)
* Maven

Commande Maven :

```
mvn test
```

Le test `MetierImplTest` vérifie que la couche métier fonctionne correctement.

---

## Conclusion

Ce projet illustre l'utilisation du framework **Spring** pour gérer les dépendances entre les composants d'une application Java.

L'utilisation de **l'inversion de contrôle** permet de séparer clairement les responsabilités entre les différentes couches de l'application, rendant le code plus flexible, testable et maintenable.

---

## Auteur

**Abderrahmane Souaiki**
