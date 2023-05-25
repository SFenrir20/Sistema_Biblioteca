/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Usuario;
import Services.RusuarioRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class UsuarioController {
    
    public List<Usuario> getLstUsuariosController(){
        return new RusuarioRepository().getAllUsuario();
    }
    
    public void InsertarUsController(Usuario us){
        new RusuarioRepository().addUsuarios(us);
    }
    
    public void EliminarUsController(Usuario us){
        new RusuarioRepository().removeUsuario(us);
    }
    
    public void ActualizarUsController(Usuario us){
        new RusuarioRepository().addUsuarios(us);
    }
}
