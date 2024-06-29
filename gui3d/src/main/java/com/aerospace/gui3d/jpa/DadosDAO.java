package com.aerospace.gui3d.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DadosDAO {

    private EntityManagerFactory emf;

    public DadosDAO() {
        // Cria o EntityManagerFactory usando a unidade de persistência definida no persistence.xml
        emf = Persistence.createEntityManagerFactory("TCC-Banco-De-Dados");
    }

    public Dados buscarDadoMaisRecente() {
        EntityManager em = emf.createEntityManager();
        try {
            // Consulta para obter o dado mais recente da tabela 'dados' ordenado pelo ID decrescente
            TypedQuery<Dados> query = em.createQuery("SELECT d FROM Dados d ORDER BY d.id DESC", Dados.class);
            query.setMaxResults(1);  // Obtém apenas um resultado
            List<Dados> resultList = query.getResultList();
            return resultList.isEmpty() ? null : resultList.get(0);
        } finally {
            em.close();
        }
    }

    public void fechar() {
        emf.close();
    }
}
