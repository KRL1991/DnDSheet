package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    @FXML
    private AnchorPane background;

    @FXML
    private Button saveButton;

    @FXML
    private TextField charName;

    @FXML
    private TextField strengthTextfield;

    @FXML
    private TextField dexterityTextfield;

    @FXML
    private TextField intelligenceTextField;

    @FXML
    private TextField constitutionTextfField;

    @FXML
    private TextField wisdomeTextField;

    @FXML
    private TextField charismaTextField;

    @FXML
    private TextField classAndLevelTextField;

    @FXML
    private TextField raceTextField;

    @FXML
    private TextField proficiencyTextField;

    @FXML
    private TextField savingStrenghtTextField;

    @FXML
    private TextField savingDexterityTextField;

    @FXML
    private TextField savingConstitutionTextField;

    @FXML
    private TextField savingIntelligenceTextField;

    @FXML
    private TextField savingWisdomeTextField;

    @FXML
    private TextField savingCharismaTextField;

    @FXML
    private TextField armorClassTextField;

    @FXML
    private TextField initiativeTextField;

    @FXML
    private TextField speedTextField;

    @FXML
    private TextField currentHitPointsTextField;

    @FXML
    private TextField hitDiceTextField;

    @FXML
    private Button loadButton;

    @FXML
    private TextField weapon1TextField;

    @FXML
    private TextField weapon2TextField;

    @FXML
    private TextField weapon3TextField;

    @FXML
    private Button saveButtonInv;

    @FXML
    private Button loadButtonInv;

    @FXML
    private TextArea inventoryTextArea;

    @FXML
    private TextArea wealthTextArea;

    @FXML
    void loadCharSheet(ActionEvent event) throws FileNotFoundException {

        FileHandling fileHandling = new FileHandling();
        GameData gameData;
        gameData = fileHandling.load();

        charName.setText(gameData.charName);
        strengthTextfield.setText(gameData.strengthTextfield);
        dexterityTextfield.setText(gameData.dexterityTextfield);
        intelligenceTextField.setText(gameData.intelligenceTextField);
        constitutionTextfField.setText(gameData.constitutionTextfField);
        wisdomeTextField.setText(gameData.wisdomeTextField);
        charismaTextField.setText(gameData.charismaTextField);
        classAndLevelTextField.setText(gameData.classAndLevelTextField);
        raceTextField.setText(gameData.raceTextField);
        proficiencyTextField.setText(gameData.proficiencyTextField);
        savingStrenghtTextField.setText(gameData.savingStrenghtTextField);
        savingDexterityTextField.setText(gameData.savingDexterityTextField);
        savingIntelligenceTextField.setText(gameData.savingIntelligenceTextField);
        savingConstitutionTextField.setText(gameData.savingConstitutionTextField);
        savingWisdomeTextField.setText(gameData.savingWisdomeTextField);
        savingCharismaTextField.setText(gameData.savingCharismaTextField);
        armorClassTextField.setText(gameData.armorClassTextField);
        initiativeTextField.setText(gameData.initiativeTextField);
        speedTextField.setText(gameData.speedTextField);
        currentHitPointsTextField.setText(gameData.currentHitPointsTextField);
        hitDiceTextField.setText(gameData.hitDiceTextField);
        weapon1TextField.setText(gameData.weapon1TextField);
        weapon2TextField.setText(gameData.weapon2TextField);
        weapon3TextField.setText(gameData.weapon3TextField);
        inventoryTextArea.setText(gameData.inventoryTextArea);
        wealthTextArea.setText(gameData.wealthTextArea);





    }

    @FXML
    void loadInventory(ActionEvent event) {

    }

    @FXML
    void saveCharSheet(ActionEvent event) throws IOException {

        GameData gameData = new GameData();
        gameData.charName = charName.getText();
        gameData.strengthTextfield = strengthTextfield.getText();
        gameData.dexterityTextfield = dexterityTextfield.getText();
        gameData.intelligenceTextField = intelligenceTextField.getText();
        gameData.constitutionTextfField = constitutionTextfField.getText();
        gameData.wisdomeTextField = wisdomeTextField.getText();
        gameData.charismaTextField = charismaTextField.getText();
        gameData.classAndLevelTextField = classAndLevelTextField.getText();
        gameData.raceTextField = raceTextField.getText();
        gameData.proficiencyTextField = proficiencyTextField.getText();
        gameData.savingStrenghtTextField = savingStrenghtTextField.getText();
        gameData.savingDexterityTextField = savingDexterityTextField.getText();
        gameData.savingIntelligenceTextField = savingIntelligenceTextField.getText();
        gameData.savingConstitutionTextField = savingConstitutionTextField.getText();
        gameData.savingWisdomeTextField = savingWisdomeTextField.getText();
        gameData.savingCharismaTextField= savingCharismaTextField.getText();
        gameData.armorClassTextField = armorClassTextField.getText();
        gameData.initiativeTextField = initiativeTextField.getText();
        gameData.speedTextField = speedTextField.getText();
        gameData.currentHitPointsTextField = currentHitPointsTextField.getText();
        gameData.hitDiceTextField = hitDiceTextField.getText();
        gameData.weapon1TextField = weapon1TextField.getText();
        gameData.weapon2TextField = weapon2TextField.getText();
        gameData.weapon3TextField = weapon3TextField.getText();
        gameData.inventoryTextArea = inventoryTextArea.getText();
        gameData.wealthTextArea = wealthTextArea.getText();


        FileHandling filehandling = new FileHandling();
        filehandling.save(gameData);

    }

    @FXML
    void saveInventory(ActionEvent event) throws IOException {

        GameData gameData = new GameData();
        gameData.inventoryTextArea = inventoryTextArea.getText();
        gameData.wealthTextArea = wealthTextArea.getText();

        FileHandling fileHandling = new FileHandling();
        fileHandling.save(gameData);


    }

}
