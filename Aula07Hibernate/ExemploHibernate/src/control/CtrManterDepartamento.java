/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import dao.DaoDepartamento;
import java.util.List;
import model.Departamento;
import org.hibernate.HibernateException;

/**
 *
 * @author elio
 */
public class CtrManterDepartamento {
    DaoDepartamento acessohibernatedepto = new DaoDepartamento();

    public CtrManterDepartamento() {
    }

    public int gravarDepartamento(Departamento departamento) {
        try {
            acessohibernatedepto.gravar(departamento);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }

    public List carregarDepartamentos() {
        try {
            return acessohibernatedepto.carregarTudoOrdenado(Departamento.class, "nome");
        } catch (HibernateException e) {
            return null;
        }
    }

    public boolean excluirDepartamento(Departamento departamento) {
        try {
            acessohibernatedepto.excluir(departamento);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterarDepartamento(Departamento departamento) {
        try {
            acessohibernatedepto.alterar(departamento);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }

}
