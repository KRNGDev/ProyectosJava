package listadousuarios.listadousuario.controller;


import listadousuarios.listadousuario.modelo.UserModel;
import listadousuarios.listadousuario.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return  this.userService.getUser();
    }


    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return  this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return  this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserBayId(@RequestBody UserModel request,@PathVariable("id") Long id){
        return this.userService.updateById(request,id);

    }
    @DeleteMapping(path = "/{id}")
    public  String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);

        if(ok){
            return "User con id "+ id+" eliminado";
        }else {
            return "Error en la eliminacion";
        }

    }
}
