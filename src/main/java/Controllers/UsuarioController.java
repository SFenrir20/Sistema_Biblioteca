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
        new RusuarioRepository().updateUsuario(us);
    }
    
    public int GetCorrelativoController(){
        return new RusuarioRepository().getCorrelativo();
    }
    
    public Usuario BuscarCodigoController(int codigo){
        return new RusuarioRepository().BuscarUsuarioXCodigo(codigo);
    }
    
    public List<Usuario> GetLstAllAlumnosController(){
        return new RusuarioRepository().GetAllAlumos();
    }
    
    public Usuario GetUsuariosXCategoria(String alum){
        List<Usuario> lst = GetLstAllAlumnosController();
        for(Usuario user:lst){
            if(user.getCategoria().equalsIgnoreCase(alum)){
                return user;
            }
        }
        return null;
    }
    
    public int GetUsuarioXId(String nom){
        return  new RusuarioRepository().GerIdXNombreUsuario(nom);
    }
     
    
}
