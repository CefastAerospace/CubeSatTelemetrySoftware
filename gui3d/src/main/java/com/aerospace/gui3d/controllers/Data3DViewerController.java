package com.aerospace.gui3d.controllers;

import com.aerospace.gui3d.*;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.MeshView;

public class Data3DViewerController {
    @FXML
    private LineChart<?, ?> lineChart;

    @FXML
    private MenuBar menuBarTrocarGrafico;

    @FXML
    private MenuItem menuItemAltitude;

    @FXML
    private MenuItem menuItemTemperatura;

    @FXML
    private MeshView meshVIew3D;

    
    
    @FXML
    private AnchorPane anchorPane3d;

    private Model3D model3D;

    public void initialize() {
        // Criar uma instância de Model3D e obter o MeshView dele
        model3D = new Model3D();
        MeshView meshView = model3D.getMeshView();

        // Adicionar o MeshView ao AnchorPane
        anchorPane3d.getChildren().add(meshView);

        // Ajustar a posição e escala do MeshView dentro do AnchorPane
        meshView.setScaleX(2); // Ajuste conforme necessário
        meshView.setScaleY(2); // Ajuste conforme necessário
        meshView.setScaleZ(2); // Ajuste conforme necessário

        meshView.setTranslateX(210);
        meshView.setTranslateY(150);
        meshView.setTranslateZ(0); // Ajuste conforme necessário

        // Focar o AnchorPane para capturar eventos de teclado
        anchorPane3d.requestFocus();
        
        // Adicionar listener para eventos de teclado
        anchorPane3d.setOnKeyPressed(event -> model3D. handleKeyPressed(event));
    }


}
