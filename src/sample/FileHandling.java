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
        output.println(gameData.charName);
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

        gameData.charName = input.nextLine();
        gameData.strengthTextfield = input.nextLine();
        gameData.dexterityTextfield = input.nextLine();
        gameData.intelligenceTextField = input.nextLine();
        gameData.constitutionTextfField = input.nextLine();
        gameData.wisdomeTextField = input.nextLine();
        gameData.charismaTextField = input.nextLine();
        gameData.classAndLevelTextField = input.nextLine();
        gameData.raceTextField = input.nextLine();
        gameData.proficiencyTextField = input.nextLine();
        gameData.savingStrenghtTextField = input.nextLine();
        gameData.savingDexterityTextField = input.nextLine();
        gameData.savingIntelligenceTextField = input.nextLine();
        gameData.savingConstitutionTextField = input.nextLine();
        gameData.savingWisdomeTextField = input.nextLine();
        gameData.savingCharismaTextField = input.nextLine();
        gameData.armorClassTextField = input.nextLine();
        gameData.initiativeTextField = input.nextLine();
        gameData.speedTextField = input.nextLine();
        gameData.currentHitPointsTextField = input.nextLine();
        gameData.hitDiceTextField = input.nextLine();
        gameData.weapon1TextField = input.nextLine();
        gameData.weapon2TextField = input.nextLine();
        gameData.weapon3TextField = input.nextLine();
        gameData.inventoryTextArea = input.nextLine();
        gameData.wealthTextArea = input.nextLine();

        return gameData;
    }


}
