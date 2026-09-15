# Gestion d'un etelier de réparations

## Contexte

Un atelier de réparation de téléphones souhaite suivre les appareils déposés par ses clients ainsi que les interventions réalisées. L'application reste une application Java console et les données sont stockées uniquement en mémoire.

## Domaine à modéliser

* Appareil : id, marque, modele, imei, etat ;
* Intervention : id, appareil concerné, description, cout, dateIntervention, statut ;
* EtatAppareil ou StatutIntervention sous forme d'enum.

Un appareil peut recevoir plusieurs interventions. Une intervention concerne un seul appareil.

## Contraintes POO

1. créer AbstractEntity ;
2. faire hériter Appareil et Intervention de cette classe ;
3. utiliser final sur les classes concrètes et le justifier ;
4. respecter l'encapsulation ;
5. créer une méthode d'instance permettant par exemple de décrire l'appareil ;
6. créer au moins un membre static justifié, par exemple une constante métier ou un compteur de démonstration ;
7. produire le diagramme de relation avant de coder ;
8. distinguer clairement surcharge et redéfinition dans le DevLog.

## Travail MAVEN

* créer un projet Maven gestion-atelier ;
* utiliser Java 21 ;
* valider avec mvn clean package ;
* créer au moins quatre appareils et trois interventions de démonstration.