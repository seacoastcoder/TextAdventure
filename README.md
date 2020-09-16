# TextAdventure

## Requirements
* Java11 (created with jdk-11.0.1.jdk)
* Maven (created with version 3.6.3)

### Optional
* Intelij Community Edition 

## Load Game JSON
1. To submit a game please place game JSON in the *resources/gameboards* directory.<br />
`src/main/resources/gameboards/testgame.json`

## Build the Game
1. Navigate to the project root and run a maven build:<br />
`mvn clean install`

## Run the Game

### Run game from command line
1. In the project root, use the following maven command to run the game: <br />
`mvn exec:java -Dexec.mainClass="org.example.Game" -Dexec.args="testgame.json"`

### Run game from intelij (Optional)
3. Create run configureation for the main Game.java class, with the name of the JSON as a game argument.
3. Run the project.
