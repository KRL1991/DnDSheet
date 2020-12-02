package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

    public void save(GameData gameData) throws IOException {
        File file = new File("gameData.txt");
        PrintWriter output = new PrintWriter(file);

        // Nu skal vi bare skrive data
        output.println(gameData.strengthTextfield);
        output.println(gameData.dexterityTextfield);
        output.println(gameData.intelligenceTextField);
        output.println(gameData.constitutionTextfField);
        output.println(gameData.wisdomeTextField);
        output.println(gameData.charismaTextField);
        output.println(gameData.classAndLevelTextField);
        output.println(gameData.raceTextField);
        output.println(gameData.proficiencyTextField);
        output.println(gameData.savingStrenghtTextField);
        output.println(gameData.savingDexterityTextField);
        output.println(gameData.savingConstitutionTextField);
        output.println(gameData.savingIntelligenceTextField);
        output.println(gameData.savingWisdomeTextField);
        output.println(gameData.savingCharismaTextField);
        output.println(gameData.armorClassTextField);
        output.println(gameData.initiativeTextField);
        output.println(gameData.speedTextField);
        output.println(gameData.currentHitPointsTextField);
        output.println(gameData.hitDiceTextField);
        output.println(gameData.weapon1TextField);
        output.println(gameData.weapon2TextField);
        output.println(gameData.weapon3TextField);
        output.println(gameData.inventoryTextArea);
        output.println(gameData.wealthTextArea);

        // Når du lukker filen, så gemmes det
        output.close();
    }

    public GameData load() throws FileNotFoundException {
        File file = new File("gameData.txt");
        Scanner input = new Scanner(file);
        GameData gameData = new GameData();

        gameData.charName = input.next();
        gameData.strengthTextfield = input.next();
        gameData.dexterityTextfield = input.next();
        gameData.intelligenceTextField = input.next();
        gameData.constitutionTextfField = input.next();
        gameData.wisdomeTextField = input.next();
        gameData.charismaTextField = input.next();
        gameData.classAndLevelTextField = input.next();
        gameData.raceTextField = input.next();
        gameData.proficiencyTextField = input.next();
        gameData.savingStrenghtTextField = input.next();
        gameData.savingDexterityTextField = input.next();
        gameData.savingIntelligenceTextField = input.next();
        gameData.savingConstitutionTextField = input.next();
        gameData.savingWisdomeTextField = input.next();
        gameData.savingCharismaTextField = input.next();
        gameData.armorClassTextField = input.next();
        gameData.initiativeTextField = input.next();
        gameData.speedTextField = input.next();
        gameData.currentHitPointsTextField= input.next();
        gameData.hitDiceTextField= input.next();
        gameData.weapon1TextField = input.next();
        gameData.weapon2TextField = input.next();
        gameData.weapon3TextField = input.next();
        gameData.inventoryTextArea = input.next();
        gameData.wealthTextArea = input.next();

        return gameData;
    }


}
