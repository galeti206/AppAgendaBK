package es.ieslosmontecillos.AppAgendaBK.services;

import es.ieslosmontecillos.AppAgendaBK.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Usuario save(Usuario usuario);
    public Usuario findById(Long id);
    public void delete(Usuario usuario);
}
