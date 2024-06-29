package com.aerospace.gui3d.jpa;

import javax.persistence.*;

@Entity
@Table(name = "dados")
public class Dados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cubesat")
    private int cubesat;

    @Column(name = "acelerometroX")
    private Float acelerometroX;

    @Column(name = "acelerometroY")
    private Float acelerometroY;

    @Column(name = "acelerometroZ")
    private Float acelerometroZ;

    @Column(name = "anguloX")
    private Float anguloX;

    @Column(name = "anguloY")
    private Float anguloY;

    @Column(name = "anguloZ")
    private Float anguloZ;

    @Column(name = "altitude")
    private Float altitude;

    @Column(name = "bateria")
    private Float bateria;

    @Column(name = "correnteBateria")
    private Float correnteBateria;

    @Column(name = "correntePlacaSolar")
    private Float correntePlacaSolar;

    @Column(name = "gas1")
    private Float gas1;

    @Column(name = "gas2")
    private Float gas2;

    @Column(name = "luz1")
    private Float luz1;

    @Column(name = "luz2")
    private Float luz2;

    @Column(name = "pontoOrvalho")
    private Float pontoOrvalho;

    @Column(name = "pressao")
    private Float pressao;

    @Column(name = "sensorUV")
    private Float sensorUV;

    @Column(name = "temperaturaExterna")
    private Float temperaturaExterna;

    @Column(name = "temperaturaInterna")
    private Float temperaturaInterna;

    @Column(name = "tensaoBateria")
    private Float tensaoBateria;

    @Column(name = "tensaoPlacaSolar")
    private Float tensaoPlacaSolar;

    @Column(name = "umidade")
    private Float umidade;

    @Column(name = "velocidade")
    private Float velocidade;

    @Column(name = "velocidadeAngularX")
    private Float velocidadeAngularX;

    @Column(name = "velocidadeAngularY")
    private Float velocidadeAngularY;

    @Column(name = "velocidadeAngularZ")
    private Float velocidadeAngularZ;

    @Column(name = "dataObtencao")
    private String dataObtencao;

    // Getters
    public int getId() {
        return id;
    }

    public int getCubesat() {
        return cubesat;
    }

    public Float getAcelerometroX() {
        return acelerometroX;
    }

    public Float getAcelerometroY() {
        return acelerometroY;
    }

    public Float getAcelerometroZ() {
        return acelerometroZ;
    }

    public Float getAnguloX() {
        return anguloX;
    }

    public Float getAnguloY() {
        return anguloY;
    }

    public Float getAnguloZ() {
        return anguloZ;
    }

    public Float getAltitude() {
        return altitude;
    }

    public Float getBateria() {
        return bateria;
    }

    public Float getCorrenteBateria() {
        return correnteBateria;
    }

    public Float getCorrentePlacaSolar() {
        return correntePlacaSolar;
    }

    public Float getGas1() {
        return gas1;
    }

    public Float getGas2() {
        return gas2;
    }

    public Float getLuz1() {
        return luz1;
    }

    public Float getLuz2() {
        return luz2;
    }

    public Float getPontoOrvalho() {
        return pontoOrvalho;
    }

    public Float getPressao() {
        return pressao;
    }

    public Float getSensorUV() {
        return sensorUV;
    }

    public Float getTemperaturaExterna() {
        return temperaturaExterna;
    }

    public Float getTemperaturaInterna() {
        return temperaturaInterna;
    }

    public Float getTensaoBateria() {
        return tensaoBateria;
    }

    public Float getTensaoPlacaSolar() {
        return tensaoPlacaSolar;
    }

    public Float getUmidade() {
        return umidade;
    }

    public Float getVelocidade() {
        return velocidade;
    }

    public Float getVelocidadeAngularX() {
        return velocidadeAngularX;
    }

    public Float getVelocidadeAngularY() {
        return velocidadeAngularY;
    }

    public Float getVelocidadeAngularZ() {
        return velocidadeAngularZ;
    }

    public String getDataObtencao() {
        return dataObtencao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCubesat(int cubesat) {
        this.cubesat = cubesat;
    }

    public void setAcelerometroX(Float acelerometroX) {
        this.acelerometroX = acelerometroX;
    }

    public void setAcelerometroY(Float acelerometroY) {
        this.acelerometroY = acelerometroY;
    }

    public void setAcelerometroZ(Float acelerometroZ) {
        this.acelerometroZ = acelerometroZ;
    }

    public void setAnguloX(Float anguloX) {
        this.anguloX = anguloX;
    }

    public void setAnguloY(Float anguloY) {
        this.anguloY = anguloY;
    }

    public void setAnguloZ(Float anguloZ) {
        this.anguloZ = anguloZ;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public void setBateria(Float bateria) {
        this.bateria = bateria;
    }

    public void setCorrenteBateria(Float correnteBateria) {
        this.correnteBateria = correnteBateria;
    }

    public void setCorrentePlacaSolar(Float correntePlacaSolar) {
        this.correntePlacaSolar = correntePlacaSolar;
    }

    public void setGas1(Float gas1) {
        this.gas1 = gas1;
    }

    public void setGas2(Float gas2) {
        this.gas2 = gas2;
    }

    public void setLuz1(Float luz1) {
        this.luz1 = luz1;
    }

    public void setLuz2(Float luz2) {
        this.luz2 = luz2;
    }

    public void setPontoOrvalho(Float pontoOrvalho) {
        this.pontoOrvalho = pontoOrvalho;
    }

    public void setPressao(Float pressao) {
        this.pressao = pressao;
    }

    public void setSensorUV(Float sensorUV) {
        this.sensorUV = sensorUV;
    }

    public void setTemperaturaExterna(Float temperaturaExterna) {
        this.temperaturaExterna = temperaturaExterna;
    }

    public void setTemperaturaInterna(Float temperaturaInterna) {
        this.temperaturaInterna = temperaturaInterna;
    }

    public void setTensaoBateria(Float tensaoBateria) {
        this.tensaoBateria = tensaoBateria;
    }

    public void setTensaoPlacaSolar(Float tensaoPlacaSolar) {
        this.tensaoPlacaSolar = tensaoPlacaSolar;
    }

    public void setUmidade(Float umidade) {
        this.umidade = umidade;
    }

    public void setVelocidade(Float velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidadeAngularX(Float velocidadeAngularX) {
        this.velocidadeAngularX = velocidadeAngularX;
    }

    public void setVelocidadeAngularY(Float velocidadeAngularY) {
        this.velocidadeAngularY = velocidadeAngularY;
    }

    public void setVelocidadeAngularZ(Float velocidadeAngularZ) {
        this.velocidadeAngularZ = velocidadeAngularZ;
    }

    public void setDataObtencao(String dataObtencao) {
        this.dataObtencao = dataObtencao;
    }
}
