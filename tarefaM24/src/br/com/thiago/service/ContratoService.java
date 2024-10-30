package br.com.thiago.service;

import br.com.thiago.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return contratoDao.buscar();
    }

    @Override
    public void excluir() {
        contratoDao.excluir();
    }

    @Override
    public void atualizar() {
        contratoDao.atualizar();
    }
}
