module com.aerospace.gui3d {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.persistence;
    requires org.hibernate.orm.core; // Adicionando o módulo do Hibernate ORM

    opens com.aerospace.gui3d to javafx.fxml;
    opens com.aerospace.gui3d.controllers to javafx.fxml;
    opens com.aerospace.gui3d.jpa to org.hibernate.orm.core; // Abre o pacote para o Hibernate

    exports com.aerospace.gui3d;
    exports com.aerospace.gui3d.jpa;
    exports com.aerospace.gui3d.controllers;
}
