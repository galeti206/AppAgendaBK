package es.ieslosmontecillos.AppAgendaBK.services;

import es.ieslosmontecillos.AppAgendaBK.dao.UsuarioDao;
import es.ieslosmontecillos.AppAgendaBK.entity.Provincia;
import es.ieslosmontecillos.AppAgendaBK.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImplement implements UsuarioService{
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
}
