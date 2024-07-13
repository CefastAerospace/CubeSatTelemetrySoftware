package com.aerospace.gui3d;

import com.aerospace.gui3d.jpa.Dados;
import com.aerospace.gui3d.jpa.DadosDAO;
import javafx.application.Platform;
import javafx.scene.control.Label;

/**
 * Class responsible for updating GUI elements based on data from a database.
 */
public class Updater {

    private DadosDAO dadosDAO;
    private Label[] labels; // Vetor de labels
    private Model3D model3d;
    private LineChartManager lineChartManager;
    private double prevX;
    private double prevY;
    private double prevZ;

    /**
     * Constructor for Updater class.
     *
     * @param labels Array of labels to update
     * @param model3d 3D model manager
     * @param lineChartManager Line chart manager for data visualization
     */
    public Updater(Label[] labels, Model3D model3d, LineChartManager lineChartManager) {
        this.labels = labels;  // Inicialização do vetor de labels
        this.model3d = model3d;
        this.dadosDAO = new DadosDAO(); // Instanciação do DAO para acessar os dados do banco
        this.lineChartManager = lineChartManager;
    }

    /**
     * Starts a thread that continuously updates GUI labels with the latest data
     * from the database. Uses Platform.runLater to ensure GUI updates are done
     * on the JavaFX application thread.
     */
    public void startUpdating() {
        Thread updaterThread = new Thread(() -> {
            try {
                while (true) {
                    Dados dadoMaisRecente = dadosDAO.buscarDadoMaisRecente();
                    if (dadoMaisRecente != null) {
                        Platform.runLater(() -> updateLabels(dadoMaisRecente));
                    }
                    Thread.sleep(1000); // Espera 1 segundo antes de buscar novamente
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                dadosDAO.fechar(); // Fecha o DAO ao finalizar
            }
        });
        updaterThread.setDaemon(true);
        updaterThread.start();
    }

    /**
     * Updates the GUI labels with the provided data.
     *
     * @param dado Latest data object fetched from the database
     */
    private void updateLabels(Dados dado) {
        // Atualiza as labels com os novos dados
        labels[0].setText(String.format("%.2f", dado.getAcelerometroX()));
        labels[1].setText(String.format("%.2f", dado.getAcelerometroY()));
        labels[2].setText(String.format("%.2f", dado.getAcelerometroZ()));
        labels[3].setText(String.format("%.2f", dado.getAnguloX()));
        labels[4].setText(String.format("%.2f", dado.getAnguloY()));
        labels[5].setText(String.format("%.2f", dado.getAnguloZ()));
        labels[6].setText(String.format("%.2f", dado.getVelocidadeAngularX()));
        labels[7].setText(String.format("%.2f", dado.getVelocidadeAngularY()));
        labels[8].setText(String.format("%.2f", dado.getVelocidadeAngularZ()));

        labels[9].setText(String.format("%.2f", dado.getAltitude()));
        labels[10].setText(String.format("%.2f", dado.getBateria()));
        labels[11].setText(String.format("%.2f", dado.getCorrenteBateria()));
        labels[12].setText(String.format("%.2f", dado.getTensaoBateria()));
        labels[13].setText(String.format("%.2f", dado.getCorrenteBateria() * dado.getTensaoBateria()));

        labels[14].setText(String.format("%.2f", dado.getCorrentePlacaSolar()));
        labels[15].setText(String.format("%.2f", dado.getTensaoPlacaSolar()));
        labels[16].setText(String.format("%.2f", dado.getCorrentePlacaSolar() * dado.getTensaoPlacaSolar()));

        labels[17].setText(String.format("%.2f", dado.getGas1()));
        labels[18].setText(String.format("%.2f", dado.getGas2()));
        labels[19].setText(String.format("%.2f", dado.getLuz1()));
        labels[20].setText(String.format("%.2f", dado.getLuz2()));
        labels[21].setText(String.format("%.2f", dado.getPontoOrvalho()));
        labels[22].setText(String.format("%.2f", dado.getPressao()));
        labels[23].setText(String.format("%.2f", dado.getSensorUV()));
        labels[24].setText(String.format("%.2f", dado.getTemperaturaExterna()));
        labels[25].setText(String.format("%.2f", dado.getTemperaturaInterna()));
        labels[26].setText(String.format("%.2f", dado.getUmidade()));

        if (prevX != dado.getAnguloX() && prevY != dado.getAnguloY() && prevZ != dado.getAnguloZ()) {
            model3d.rotateModel(dado.getAnguloX(), dado.getAnguloY(), dado.getAnguloZ());
            prevX = dado.getAnguloX();
            prevY = dado.getAnguloY();
            prevZ = dado.getAnguloZ();
        }

        lineChartManager.setyValueTemperaturaInterna(dado.getTemperaturaInterna());
        lineChartManager.setyValueTemperaturaExterna(dado.getTemperaturaExterna());
        lineChartManager.setyValueAltitude(dado.getAltitude());
        lineChartManager.setyValueUmidade(dado.getUmidade());
        lineChartManager.setyValuePotenciaBateria(dado.getCorrenteBateria() * dado.getTensaoBateria());
        lineChartManager.setyValuePotenciaPainelSolar(dado.getCorrentePlacaSolar() * dado.getTensaoPlacaSolar());
        lineChartManager.setyValuePressao(dado.getPressao());
        lineChartManager.setyValueSensorUV(dado.getSensorUV());
    }
}
