/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Usuario;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IRusuario {
    List<Usuario> getAllUsuario();
    void addUsuarios(Usuario us);
    void removeUsuario(Usuario us);
    void updateUsuario(Usuario us);
    Usuario BuscarUsuarioXCodigo(int codigo);
    int getCorrelativo();
    
    int GerIdXNombreUsuario(String nom);
    
    List<Usuario> GetAllAlumos();
}
