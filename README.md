# TextAdventure

## Requirements
* Java11
* Maven
* Intelij Community Edition 

## Load game JSON
* To submit a game please place game JSON in the gameboards directory, under the *resources* dirctory 

## Run game from intelij
1. Follow the step for loading the JSON file
2. Navigate to the project root and run a maven build: mvn clean install
3. Create run configureation for the main Game.java class, with the name of the JSON as a game argument
3. Run the project
