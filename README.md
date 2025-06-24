# project-to-dev

## Description

Projet de mise en relation entre des devs et des porteurs de projets

> 🦊 [Gitlab avec explication du projet](https://gitlab.com/jeandemel-formations/hb-cda-2025/projets/projet-orm)

## USECASE

![USECASE](docs/projet-mise-en-relation-use-case.png)

## UML

![UML](https://kroki.io/plantuml/svg/eNp9U0Fu2zAQvO8rCPsQoICC5moUBhSZsR3IkiBRbXwyZGnhsJBFlVylLdy8p8g7_LFSTizLbtoLscvd4c4MSaxI0k8WafUVc2I7cJisiMkCnIS0rDbM1kvssgJNrmVNUlXg-CrPyklGyAq7rEr5pDNp2kqhmnWJbN0UGyRwxOP-ZZuR_NYgo1NshyWUUUPH8aafwTNka0M6s4W8zIxhqUG9g-GR4ZC9karU9pTgNpPlKa0t8LvSve6-hGfAVwMm-NRq96WhTwLzx0qVaiPRjBn1slN_pDRho1cFruqWbmtdV_SyqpDWkkbjmaPs3LAJ1oo6D_ogc7lzOLvZXti1Ax6sXCF4IHgbemEaJyB4vJgHHNwgSH1-RPZF7eDe_exCNIsOQeLF80iAWEb8LYyWYhYG9oRp6rsxJMvFXRgsIeauJyDgD-I-gThNBExD8IZ2RJ_dufqOlut5PBKc21Pu0oR3oN7b2MEXfguL8HZueU_dhdWQivjQejXj8Vy4Uw72ppjj_BofXgMbMfxBWBUG_r6R97rgKua-K-ZhkLyDGNwMLGrMBh-vrz8Mul8xYrnevyAc84u2vuAR07j_rSQdeP63sVaGGvu1-rsd4Kab_s-6HQDwB-7XOco=)

## Installation

```bash
# Instructions d'installation
git clone https://github.com/AnaelTech/project-to-dev.git
```

## Utilisation

```bash
# Exemples d'utilisation
mvn clean install
mvn exec:java
```

> [!TIP]
>
> Pour connecter le projet à un serveur MySQL, il faut récupérer la structure du fichier `persistence-example.xml` à la racine du projet.  
> Ensuite, créer un fichier `persistence.xml` qui contiendra les informations de connexion à la base de données.

## Démarrage du projet avec Docker 🐋

## Prérequis

- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/)

## Lancer l'application

1. Construire et démarrer les services :

   ```sh
   docker-compose up --build
   ```

2. Accéder à l'application Java : [http://localhost:8081](http://localhost:8081)

3. Accéder à phpMyAdmin : [http://localhost:8080](http://localhost:8080)
   - Hôte MySQL : `db`
   - Utilisateur : `root` ou `user`
   - Mot de passe : `root` ou `password`

## Arrêter les services

```sh
docker-compose down
```

## Contribution

Les contributions sont les bienvenues ! N'hésitez pas à :

1. Fork le projet
2. Créer une branche pour votre fonctionnalité
3. Commit vos changements
4. Push vers la branche
5. Ouvrir une Pull Request

## Licence

Ce projet est sous licence [MIT](LICENSE).

---

> Généré avec le script GitHub Repository Creator
